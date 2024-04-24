import java.util.*;

public class StudentList {
    private ArrayList<Student> students;
    private int length;

    public StudentList() {
        students = new ArrayList<Student>();
    }

    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for (Student student : students) {
            String fullName = new String(student.getFirstName() + " " + student.getLastName()).toLowerCase();
            if (fullName.matches("(.*)" + name.toLowerCase() + ".*")) {
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
        return matches;
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                int choice;
                System.out.println("Are you sure you want to delete the student? (1.Yes or 2.No)");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1) {
                    students.remove(student);
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cannot find student with id " + id);
        }
    }

    public void sortByMarks() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.valueOf(String.valueOf(s1)).compareTo(Double.valueOf(String.valueOf(s2)));
            }
        });
    }

    public void showList() {
        for (Student student : students) {
            student.printInfo();
        }
    }

    public void showList(ArrayList<Student> students) {
        for (Student student : students) {
            student.printInfo();
        }
    }

}
