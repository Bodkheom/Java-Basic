import java.util.*;

public class printfeverabove100 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        float temp =s.nextFloat() ;
        System.err.println("Enter Your TEmprature");
        if (temp>=100) {
            System.out.println("You have Fever");
        } else{
            System.out.println("You  Don't have Fever");
 
        }
    }
}
