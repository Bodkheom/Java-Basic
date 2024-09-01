import java.util.*;
public class Ifelse{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a number:");
        int age=s1.nextInt();
        if(age>18){
            System.out.println("You are an adult");
        }
        if(age>=15&&age<=18){
            System.out.println("You are a teenager");
        }
        else if(age<15) {
            System.out.println("You are a Not Adult");
        }


    }
}