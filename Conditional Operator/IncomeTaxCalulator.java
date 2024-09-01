// Income Less than 5L No tax , Income b/w 5-10 20% , Income >10 30%//


import java.util.*; 

public class IncomeTaxCalulator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter Your Income ");
        int income = sc.nextInt();
        if(income<=500000){
            System.out.println("No tax");
        } else if (income>500000 && income<=1000000) {
            System.err.println("Tax For Your Income is "+ income*0.2);
            
        } else{
            System.out.println("Tax For Your Income is " + income*0.3);
        }
    }
}
    
