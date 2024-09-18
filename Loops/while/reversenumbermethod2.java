import java.util.*;
public class reversenumbermethod2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the no.");
        int num=s.nextInt();
        int rev=0;
        while(num>0){
            int lastdigit=num%10; /// to print last digit
            rev=(rev*10)+lastdigit; //dry code in copy
            num/=10;//num=num/10 // to remove the last digit
        }
        System.out.println(rev);
    }
    
}
