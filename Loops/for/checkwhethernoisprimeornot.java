import java.util.*;

public class checkwhethernoisprimeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("The no is " + n + " is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { ///logic copy 
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The no " + n + " is prime");
            } else {
                System.out.println("The no " + n + " is not prime");
            }
        }
    }
}