import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileCopy {

    public static void main(String[] args) {
        try {

            File inputFile1 = new File("input1.txt");
            Scanner scanner1 = new Scanner(inputFile1);


            File inputFile2 = new File("input2.txt");
            Scanner scanner2 = new Scanner(inputFile2);


            FileWriter outputFile = new FileWriter("output.txt");


            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                outputFile.write(line);

            }


            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                outputFile.write(line);

            }


            scanner1.close();
            scanner2.close();
            outputFile.close();

            System.out.println("File copy completed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}