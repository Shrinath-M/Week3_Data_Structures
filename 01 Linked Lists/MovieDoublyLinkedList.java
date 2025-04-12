class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // Add a movie record at the beginning
    public void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
        MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a movie record at the end
    public void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a movie record at a specific position
    public void addAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
        MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
        if (position == 1) {
            addAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        MovieNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode; // Update tail if new node is added at the end
        }
        current.next = newNode;
    }

    // Remove a movie record by Movie Title
    public void removeByTitle(String title) {
        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Movie with title '" + title + "' not found.");
            return;
        }
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search for a movie record by Director or Rating
    public void searchByDirectorOrRating(String director, double rating) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director) || current.rating == rating) {
                System.out.println("Found: Title: " + current.title + ", Director: " + current.director +
                        ", Year of Release: " + current.yearOfRelease + ", Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found with Director '" + director + "' or Rating '" + rating + "'.");
        }
    }

    // Display all movie records in forward order
    public void displayForward() {
        MovieNode current = head;
        if (current == null) {
            System.out.println("No movie records available.");
            return;
        }
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director +
                    ", Year of Release: " + current.yearOfRelease + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movie records in reverse order
    public void displayReverse() {
        MovieNode current = tail;
        if (current == null) {
            System.out.println("No movie records available.");
            return;
        }
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director +
                    ", Year of Release: " + current.yearOfRelease + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's rating based on the Movie Title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated successfully for '" + title + "'.");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title '" + title + "' not found.");
    }
}
