import java.util.*;
public class dayofweekswitch {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter A Number From 1-7");
        int num=s1.nextInt();
        switch (num) {
            case 1: System.out.println("Mon");
                break;
                
            case 2: System.out.println("Tue");
            break;

            
            case 3: System.out.println("Wed");
            break;
            
            case 4: System.out.println("Thrs");
            break;
            
            case 5: System.out.println("Friday");
            break;
            
            case 6: System.out.println("Sat");
            break;
            
            case 7: System.out.println("Sun");
            break;
        
            default:
                break;
        }
    }
}
