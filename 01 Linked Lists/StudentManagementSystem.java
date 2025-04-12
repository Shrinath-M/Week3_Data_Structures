public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Add student records
        list.addAtBeginning(1, "Alice", 20, "A");
        list.addAtEnd(2, "Bob", 22, "B");
        list.addAtPosition(2, 3, "Charlie", 21, "C");

        // Display all records
        System.out.println("All Student Records:");
        list.displayAllRecords();

        // Search for a student
        System.out.println("\nSearching for Roll Number 2:");
        StudentNode student = list.searchByRollNumber(2);
        if (student != null) {
            System.out.println("Found: Roll Number: " + student.rollNum + ", Name: " + student.name);
        } else {
            System.out.println("Student not found.");
        }

        // Update a student's grade
        System.out.println("\nUpdating Grade for Roll Number 2:");
        list.updateGrade(2, "A+");

        // Display all records again
        System.out.println("\nAll Student Records After Update:");
        list.displayAllRecords();

        // Delete a student record
        System.out.println("\nDeleting Roll Number 3:");
        list.deleteByRollNumber(3);

        // Display all records again
        System.out.println("\nAll Student Records After Deletion:");
        list.displayAllRecords();
    }

}
