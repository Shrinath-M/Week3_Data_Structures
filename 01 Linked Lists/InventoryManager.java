public class InventoryManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add items
        inventory.addItem("Widget", 101, 10, 5.99, 0);
        inventory.addItem("Gadget", 102, 5, 12.49, 1);
        inventory.addItem("Tool", 103, 15, 7.99, 2);

        // Display inventory
        System.out.println("Inventory:");
        inventory.displayInventory();

        // Update quantity
        inventory.updateQuantity(102, 8);

        // Calculate total inventory value
        System.out.println("Total Inventory Value: " + inventory.calculateTotalValue());

        // Remove an item
        inventory.removeItem(103);

        // Sort by name
        inventory.sortInventory("name", true);

        // Display inventory
        System.out.println("Sorted Inventory:");
        inventory.displayInventory();
    }
}

