
import java.util.Scanner;


class Student{
    void studentdetails(){

        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter Name:");
        String name = sc.nextLine();
        System.out.println("enter mail:");
        String email = sc.nextLine();
    }

    
}
public class ClassExample {
    public static void main(String[] args) {
        
        Student st = new Student();
        
         st.studentdetails();
        
    }
}
 