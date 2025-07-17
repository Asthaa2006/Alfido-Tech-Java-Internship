
import java.util.Scanner;

class Student{
    String name;
    String email;
    void studentdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("student name: ");
         name = sc.next();
        System.out.println("enter email: ");
         email = sc.next();

        
    }
    void displaystudentdetails(){
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Email: "+ email);
        System.out.println();
    }
}

class Department extends Student{
    String course;
    void departmentdetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Course: ");
         course = sc.nextLine();
        
    }
    void displaydepartmentdetails() {
        displaystudentdetails(); // inherited method
        System.out.println("Course: " + course);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student st = new Student();
        st.studentdetails();
        st.displaystudentdetails();
    }
}
