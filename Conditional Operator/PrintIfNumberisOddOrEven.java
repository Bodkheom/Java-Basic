import java.util.*;

public class PrintIfNumberisOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.println("Enter A Number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("The Number " + num + " Is divisible By 2 Or The Num Is Even");
        } else{
            System.out.println("The Number " + num + " Is Not  divisible By 2 Or The Num Is Odd" + " And The Reminder Is" + num%2);
        }


    }
}
