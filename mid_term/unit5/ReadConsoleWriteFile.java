//Read from console and write in file

import java.io.*;
import java.util.*;

class ReadConsoleWriteFile {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);//throws IOException
       File ob1 = new File("abc1.txt");
       ob1.createNewFile();
       PrintWriter pw1 = new PrintWriter(ob1);
    
    pw1.println("Enter your Name.");
for(int i = 0; i<=5;i++){
pw1.println(sc.next());
//System.out.println(sc1.next());

}
pw1.close();
sc.close();
}
}
