class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean availabilityStatus; // true = available, false = borrowed
    Node prev;
    Node next;

    public BookNode(String bookTitle, String author, String genre, int bookId, boolean availabilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus = availabilityStatus;
        this.prev = null;
        this.next = null;
    }
}

