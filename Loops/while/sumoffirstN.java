import java.util.*;
public class sumoffirstN {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("enter the digit to which you like to print");
        int num= s.nextInt();
        int cout=1;
        int sum=0;
        System.out.println("the number between 1 to"+ num+" is ");
        while(cout<=num){
            System.out.println(cout);
            sum=sum+cout; //sum+=count
            cout++;     
    }
    System.out.println("the sum of number b/w 1 to "+ num+" is " + sum);

}
}
    

