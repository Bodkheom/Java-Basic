import java.util.*;  ////////// operation To Define +,-,*,/,%

public class Calculator {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        
        System.out.println("Enter 1 number");
        int num1=s1.nextInt();
        
        System.out.println("Enter second number");
        int num2=s1.nextInt();

        System.out.println("Enter The Operation To Perform + - * / %");
        char operation= s1.next().charAt(0);
        switch(operation){
            case '+': System.out.println("Addition Of " + num1 + " & " + num2 + " is " + num1+num2);
            break;
            case '-' : System.out.println("Sub  Of " + num1 + " & " + num2 + " is " + (num1-num2));
            break;
            case '*' : System.out.println("Multi  Of " + num1 + " & " + num2 + " is " + (num1*num2));
            break;
            case '/' : System.out.println("Quotient  Of " + num1 + " & " + num2 + " is " + (num1/num2));
            break;
            case '%' : System.out.println("Remainder  Of " + num1 + " &" + num2 + " is " + (num1%num2));
            break;
            default: System.out.println("Please Select The Operation Stated Above");   

        }
    }
}
