import java.io.*;

class FileReaderExample {
    public static void main(String[] args) {
        try {
            Reader rdr = new FileReader("abc1.txt");
            int data = rdr.read();//read byte by byte hello
            while(data!= -1){
                System.out.println((char)data);
                data = rdr.read();

            }
            rdr.close();

        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
