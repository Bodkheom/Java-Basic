import java.util.*;

public class PrintLargestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        }
        if(num1==num2) {
            System.err.println("The Number Are Equal: ");
        } 
        else if(num2>num1) {
            System.out.println("The largest number is: " + num2);
        }
    
}
}
