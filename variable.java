/* 
public class variable {
    public static void main (String[] args) {
        // varaibles
        //String name = "tony stark";
        int a = 10 ;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);
    }
    
}
*/
//take user input
import java.util.*;
public class variable {
    public static void main(String[] args) {
        //input
        Scanner mc = new Scanner(System.in);
        String name = mc.nextLine();
        System.out.println(name);
        mc.close();
    }
}

