import java.util.*;
public class multipleof10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        do { 
            System.out.println("Enter Number");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
        } while (true);
        System.out.println("You have enter no multiple of 10");
    }
    
    
}
