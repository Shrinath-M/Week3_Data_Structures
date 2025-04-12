class Library {
    private Node head;
    private Node tail;

    // Add a new book
    public void addBook(String bookTitle, String author, String genre, int bookId, boolean availabilityStatus, int position) {
        Node newNode = new Node(bookTitle, author, genre, bookId, availabilityStatus);

        if (position == 0) { // Add at the beginning
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == tail || current == null) { // Add at the end
            if (tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        } else { // Add at a specific position
            newNode.next = current.next;
            if (current.next != null) current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Remove a book by Book ID
    public void removeBook(int bookId) {
        if (head == null) return;

        Node current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;

                if (current == head) head = current.next;
                if (current == tail) tail = current.prev;

                return;
            }
            current = current.next;
        }
    }

    // Search for a book by Book Title or Author
    public Node searchBook(String titleOrAuthor) {
        Node current = head;
        while (current != null) {
            if (current.bookTitle.equalsIgnoreCase(titleOrAuthor) || current.author.equalsIgnoreCase(titleOrAuthor)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Update a book’s availability status
    public void updateAvailability(int bookId, boolean newStatus) {
        Node current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.availabilityStatus = newStatus;
                return;
            }
            current = current.next;
        }
    }

    // Display all books in forward order
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println("Book Title: " + current.bookTitle + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", Book ID: " + current.bookId +
                    ", Availability: " + (current.availabilityStatus ? "Available" : "Borrowed"));
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        Node current = tail;
        while (current != null) {
            System.out.println("Book Title: " + current.bookTitle + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", Book ID: " + current.bookId +
                    ", Availability: " + (current.availabilityStatus ? "Available" : "Borrowed"));
            current = current.prev;
        }
    }

    // Count total number of books in the library
    public int countBooks() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
