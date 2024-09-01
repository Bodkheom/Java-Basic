import java.util.*;
public class CheckIfStudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks Of Maths");
        int number1=sc.nextInt();

        System.out.println("Enter Marks Of Physics");
        int number2=sc.nextInt();
        
        System.out.println("Enter Marks Of Chemistry");
        int number3=sc.nextInt();
        
        String type1=((number1>=35))? "Pass": "Fail";
        String type2=((number2>=35))? "Pass": "Fail";
        String type3=((number3>=35))? "Pass": "Fail";
        
        System.out.println("You Are "+type1+" In Maths "+type2 + " in Physics " + " And " +type3 + " in Chemistry" );
    }
}
