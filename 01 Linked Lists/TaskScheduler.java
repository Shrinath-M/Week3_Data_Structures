public class TaskScheduler {
    public static void main(String[] args) {
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtBeginning(1, "Task 1", 3, "2025-04-16");
        scheduler.addAtEnd(2, "Task 2", 2, "2025-04-17");
        scheduler.addAtPosition(2, 3, "Task 3", 1, "2025-04-18");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nViewing Tasks in Circular Order:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("\nSearching for Tasks with Priority 2:");
        scheduler.searchByPriority(2);

        System.out.println("\nRemoving Task with ID 3:");
        scheduler.removeByTaskId(3);

        System.out.println("\nAll Tasks After Removal:");
        scheduler.displayAllTasks();
    }
}
