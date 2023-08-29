import java.io.IOException;
import java.io.*;
import java.util.*;


class ReadFileWriteConsole {
    public static void main(String...aa)throws IOException {
        File ob1= new File("abc1.txt");//consider the file already exits and have the data 
        //otherwise create file using following statement and some data by open the file
        //obj1.createNewFile();
        Scanner sc = new Scanner(ob1);//read
        PrintWriter pw = new PrintWriter(System.out);//write

        pw.println("Enter your name");
        while(sc.hasNext()){
            pw.println(sc.next());
            //System.out.println(sc.next());

        }
        
        pw.close();
        pw.close();

    }
}
