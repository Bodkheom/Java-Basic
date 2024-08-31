import java .util.*;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Radius Of Cirlce");
        float num1= s1.nextFloat();
        float rad2=num1*num1;
        double area=rad2*3.14;
        System.out.println("Area Of The Circle For Radius"+ num1 +"is "+" "+area);

}
}
