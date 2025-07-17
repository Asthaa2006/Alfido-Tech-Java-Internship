import java.util.Scanner;

class Student {
    String st_username;
    String email;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        st_username = sc.nextLine();
        System.out.print("Enter email: ");
        email = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Student Profile");
        System.out.println("Username: " + st_username);
        System.out.println("Email: " + email);
    }
}

class University extends Student {
    String department;

    @Override
    void displayDetails() {
        System.out.println();
        System.out.println("Student profile");     
        System.out.println("Username: " + st_username);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println();
    }

    void inputDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        University uni = new University();
        uni.inputDetails();
        uni.inputDepartment();
        uni.displayDetails();

        // Runtime polymorphism
        Student stud = new University();
        stud.inputDetails();
        ((University) stud).inputDepartment();
        stud.displayDetails(); // Calls overridden method in Admin
    }
}
