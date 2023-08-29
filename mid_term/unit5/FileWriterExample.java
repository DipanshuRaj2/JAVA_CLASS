package unit5;

//write methods for 
import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            Writer w  = new FileWriter("output.txt");
            String content ="I Love my country";

            w.write(67);//c
            char[] ch= content.toCharArray();
            w.write(ch[4]);
            w.write(ch,3,5);

            w.close();
            System.out.println("Done");

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
