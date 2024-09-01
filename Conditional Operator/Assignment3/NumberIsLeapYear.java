import java.util.*;

public class NumberIsLeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.println("Enter Year");
        int year = s.nextInt();
        boolean leap=false;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.err.println("Year "+ year+" is a leap year");


        }
        else {
            System.err.println("Year "+ year+" is not leap year");
        }


        }
    }
