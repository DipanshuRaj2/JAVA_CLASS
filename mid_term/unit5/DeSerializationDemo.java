import java.io.*;

public class DeSerializationDemo {
    public static void main(String args[]) {
        try {
            MyClass object2;

            FileInputStream fis = new FileInputStream("serial1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            object2 = (MyClass) ois.readObject();
            ois.close();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception during deserialization");
        }
    }
}
