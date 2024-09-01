import java.util.*;

public class add3proudctandgst {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); 

        System.out.println("Enter three PRices:");
        float pencil = s1.nextFloat();
        float pen = s1.nextFloat();
        float erasor = s1.nextFloat();
        float sum= pencil+pen+erasor;
        float gst=0.18f*sum;
        float finalprice=gst+sum;
        System.out.println("Total Cost Of Items"+ sum);
        System.err.println("With GST THE COST OF ITEM IS"+finalprice);

        
      

    }
}
  
          



