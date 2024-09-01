import java.util.*;

public class PrintWheatherNumberIsPostiveOrNegative {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter A Number");
        int num= s1.nextInt();
        String type=(num>=0)? "Postive":"Negative";
        System.out.println(type);
    }
}
