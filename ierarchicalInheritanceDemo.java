class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails() {
        System.out.println("----- Student Details -----");
        displayPersonDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subjectCode;

    Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    void displayTeacherDetails() {
        System.out.println("----- Teacher Details -----");
        displayPersonDetails();
        System.out.println("Subject Code: " + subjectCode);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 20, 101);
        Teacher t = new Teacher("Mrs. Sharma", 40, "CS101");

        s.displayStudentDetails();
        System.out.println();
        t.displayTeacherDetails();
    }
}
