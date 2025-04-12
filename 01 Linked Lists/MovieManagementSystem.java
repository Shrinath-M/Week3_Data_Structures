public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        // Add movie records
        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
        list.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

        // Display all records in forward order
        System.out.println("Movie Records (Forward):");
        list.displayForward();

        // Display all records in reverse order
        System.out.println("\nMovie Records (Reverse):");
        list.displayReverse();

        // Search for movies
        System.out.println("\nSearching for movies by Director 'Christopher Nolan' or Rating 7.8:");
        list.searchByDirectorOrRating("Christopher Nolan", 7.8);

        // Update movie rating
        System.out.println("\nUpdating rating for 'Avatar':");
        list.updateRating("Avatar", 8.1);

        // Display all records after update
        System.out.println("\nMovie Records After Update (Forward):");
        list.displayForward();

        // Remove a movie record
        System.out.println("\nRemoving 'Interstellar':");
        list.removeByTitle("Interstellar");

        // Display all records after deletion
        System.out.println("\nMovie Records After Deletion (Forward):");
        list.displayForward();
    }
}
