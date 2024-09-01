import java.util.*;

public class avgofthreeno {
   public static void main(String[] args) {
       Scanner s1 = new Scanner(System.in); 

        System.out.println("Enter three numbers:");
        int num1 = s1.nextInt();
        int num2 = s1.nextInt();
        int num3 = s1.nextInt();
        int sum=num1+num2+num3;
        int avg=sum/3;
        System.out.println("Avg Of Number  " + num1 + num2 + num3 +  " is: " + avg); 
   } 
}
