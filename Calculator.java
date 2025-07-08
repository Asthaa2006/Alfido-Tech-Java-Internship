
    
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // take user input for numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // taker userinput for operator
        System.out.print("Enter operator (+, -, *, /, %): ");
        String operator = scanner.next();
        
        // Perform calculation based on operator
        switch (operator) {
            case "+":
                System.out.println("Addition : " + (num1 + num2));
                break;
                
            case "-":
                System.out.println("Subtraction : " + (num1 - num2));
                break;
                
            case "*":
                System.out.println("Multiplication: " + (num1 * num2));
                break;
                
            case "/":
               
                    System.out.println("Division : " + (num1 / num2));
                
                break;
                
            
                
            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or %");
        }
        
        // Close scanner
        scanner.close();
    }
}