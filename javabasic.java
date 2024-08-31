import java.util.*;
public class javabasic{
    public static void main(String[] args) {
        
        System.out.println("OM BODKHE");     //basic output command
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");             //basic output command end
        int a = 10;    //basic sum command
        int b= 5;         
        int c= a+b;     
        System.out.println("Sum of a and b is: " + c);       //basic sum command end
       
        // Scanner scanner = new Scanner(System.in);        //basic input command 
        // String input = scanner.next();                          // next only staring ka leta hai space k bdh ka kuch nahi  take om bodkhe as eg
        //  System.err.println(input);                           //basic input command end

        // Scanner sc = new Scanner(System.in);      // basic input command nextline - space k bdh ka bhi print 
        // String name = sc.nextLine();
        // System.out.println(name);                       // basic input command nextline - space k bdh ka bhi print 

        // Scanner s = new Scanner(System.in);       // basic input command for number
        // int num = s.nextInt();
        // System.out.println(num);             // basic input command for number end

        //   Scanner s = new Scanner(System.in);       // basic input command for boolean
        //   boolean bool = s.nextBoolean();
        //   System.out.println(bool);                 // basic input command for boolean end

        Scanner s2 = new Scanner(System.in); //  sum of input commands using scanner

        System.out.println("Enter two numbers:");
        int num1 = s2.nextInt();
        int num2 = s2.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum); //  sum of input using scanner 
        
      




        

    }
}