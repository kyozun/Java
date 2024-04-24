import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static StudentList studentList;

    public static void menu() {
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search Student by name");
        System.out.println("4. Search Student by ID");
        System.out.println("5. Print student information in descending order of mark");
        System.out.println("6. Exit");
    }

    public static void addStudent() {
        int id = 0;
        String firstName;
        String lastName;
        double mark;
        System.out.println("Enter student ID: ");
        id = input.nextInt();

        System.out.println("Enter first name: ");
        firstName = input.next();

        System.out.println("Enter last name: ");
        lastName = input.next();

        System.out.println("Enter mark: ");
        mark = input.nextDouble();

        Student student = new Student(id, firstName, lastName, mark);
        studentList.addStudent(student);
    }

    public static void deleteStudent() {
        int id;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        studentList.removeStudent(id);
    }

    public static void searchStudentByName() {
        String name;
        System.out.println("Enter student name: ");
        name = input.next();
        ArrayList<Student> found = studentList.findByName(name);
        studentList.showList(found);
    }

    public static void searchById() {
        int id;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        Student student = studentList.findById(id);
        if (student == null) {
            System.out.println("Not found");
        } else {
            student.printInfo();
        }
    }

    public static void printSorted() {
        studentList.sortByMarks();
        studentList.showList();
    }

    public static void main(String[] args) {
        studentList = new StudentList();
        menu();

        while (true) {
            int choice;
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    menu();
                case 2:
                    deleteStudent();
                    menu();
                case 3:
                    searchStudentByName();
                    menu();
                case 4:
                    searchById();
                    menu();
                case 5:
                    printSorted();
                    menu();
                case 6:
                    System.exit(0);
            }
        }
    }
}