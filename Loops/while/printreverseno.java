import java.util.*;

public class printreverseno {
    //n=10899 reverse =99801
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the no.");
        int num=s.nextInt();
        while(num>0){
            int lastdigit=num%10; /// to print last digit
            System.out.print(lastdigit);
            num/=10;//num=num/10 // to remove the last digit
        }
    }
    
}
