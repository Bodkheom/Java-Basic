import java.util.*;
public class Swwitch_Statement {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Number Between 1 to 3");
        int num=s1.nextInt();
        switch(num){
            case 1: System.out.println("Mango");
            break;
            case 2: System.out.println("Chocholate");
            break;
            case 3: System.out.println("Grapes");
            break;
            default:System.out.println("Number Not Between 1 to 3 Try Again");
        }
    }
    
}
