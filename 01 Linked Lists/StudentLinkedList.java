class StudentLinkedList{
    private StudentNode head;
    public void addAtBeginning(int rollNum, String name, int age, String grade){
        StudentNode newNode = new StudentNode(rollNum, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    public void addAtEnd(int rollNum, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNum, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        StudentNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteByRollNumber(int rollNum) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNum == rollNum) {
            head = head.next;
            return;
        }
        StudentNode current = head;
        while (current.next != null && current.next.rollNum != rollNum) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with Roll Number " + rollNum + " not found.");
        } else {
            current.next = current.next.next;
        }
    }
    public StudentNode searchByRollNumber(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNum == rollNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        StudentNode current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNum + ", Name: " + current.name +
                    ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode student = searchByRollNumber(rollNumber);
        if (student == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        } else {
            student.grade = newGrade;
            System.out.println("Grade updated successfully.");
        }
    }

}
