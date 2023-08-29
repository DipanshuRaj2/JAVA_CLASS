import java.io.*;

public class SerializationDemo {
    public static void main(String args[]){
        try{
            Myclass object1 = new Myclass("Hello ", -7 ,2.7e10);
            // System.out.println("object1: " + object1);
            FileOutputStream fos = new FileOutputStream("serial1.txt");//write

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
                oos.writeObject(object1);
                oos.flush();
                oos.close();

            
        }
        catch(IOException e) {
            System.out.println("Exception during serialization: " +e);
            System.exit(0);
        }
    }
    
}
