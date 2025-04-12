class Inventory {
    private Node head;

    // Add an item
    public void addItem(String itemName, int itemId, int quantity, double price, int position) {
        Node newNode = new Node(itemName, itemId, quantity, price);

        if (position == 0) { // Add at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) { // Add at the end
            System.out.println("Position out of bounds. Adding at the end.");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove an item by Item ID
    public void removeItem(int itemId) {
        if (head == null) return;

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Update quantity by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        Node current = head;

        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
    }

    // Search for an item by Item ID or Name
    public Node searchItem(String itemNameOrId) {
        Node current = head;
        while (current != null) {
            if (String.valueOf(current.itemId).equals(itemNameOrId) || current.itemName.equals(itemNameOrId)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Calculate and display total inventory value
    public double calculateTotalValue() {
        double totalValue = 0.0;
        Node current = head;

        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }

        return totalValue;
    }

    // Sort inventory based on Item Name or Price
    public void sortInventory(String criteria, boolean ascending) {
        if (head == null || head.next == null) return;

        Node current, index;
        double tempPrice;
        int tempId, tempQty;
        String tempName;

        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                boolean condition = (criteria.equals("name") && current.itemName.compareToIgnoreCase(index.itemName) > 0) ||
                        (criteria.equals("price") && current.price > index.price);

                if (ascending ? condition : !condition) {
                    // Swap data
                    tempPrice = current.price;
                    tempId = current.itemId;
                    tempQty = current.quantity;
                    tempName = current.itemName;

                    current.price = index.price;
                    current.itemId = index.itemId;
                    current.quantity = index.quantity;
                    current.itemName = index.itemName;

                    index.price = tempPrice;
                    index.itemId = tempId;
                    index.quantity = tempQty;
                    index.itemName = tempName;
                }
            }
        }
    }

    // Display inventory
    public void displayInventory() {
        Node current = head;

        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId +
                    ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}