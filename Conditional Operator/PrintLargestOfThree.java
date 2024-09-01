import java.util.*;

public class PrintLargestOfThree {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        
        System.out.println("Enter First Number");
        int num1=s1.nextInt();

        System.out.println("Enter Second Number");
        int num2=s1.nextInt();

        
        System.out.println("Enter Third Number");
        int num3=s1.nextInt();

        if(num1>=num2&&num1>=num3){
            System.out.println("number first is largest");
        }else if(num2>=num1&&num2>=num3){
            System.out.println("number Second is largest");
        }else{
            System.out.println("number third is largest");
        }

    }
}
