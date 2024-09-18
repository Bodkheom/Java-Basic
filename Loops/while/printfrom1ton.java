import java.util.*;
public class printfrom1ton {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("enter the digit to which you like to print");
        int num= s.nextInt();
        int cout=1;
        System.out.println("the number between 1 to"+ num+" is ");
        while(cout<=num){
            System.out.println(cout);
            
            cout++;
        }
       
    }
    
}
