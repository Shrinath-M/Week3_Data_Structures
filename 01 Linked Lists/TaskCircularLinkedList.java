class TaskCircularLinkedList {
    private TaskNode head;
    private TaskNode current;
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        current = head;
    }

    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head; // Complete the circular link
        }
    }

    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode current = head;
        for (int i = 1; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }
        if (current.next == head) {
            System.out.println("Position out of bounds, adding at the end.");
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }
        TaskNode current = head, prev = null;
        do {
            if (current.taskId == taskId) {
                if (current == head) { // Removing the head node
                    TaskNode tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Current Task: ID: " + current.taskId + ", Name: " + current.taskName +
                    ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next; // Move to the next task
        }
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode current = head;
        do {
            System.out.println("ID: " + current.taskId + ", Name: " + current.taskName +
                    ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }


    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Found: ID: " + current.taskId + ", Name: " + current.taskName +
                        ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
}
