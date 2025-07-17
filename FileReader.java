import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    public static void main(String[] args) {
        // creating obj for file
        File myfile = new File("text.txt");

        try{

            Scanner read = new Scanner(myfile);
            System.out.println("Reading file: Text.txt ");
            System.out.println("--------------------------------");
            while(read.hasNextLine()){
                String line = read.nextLine();
                System.out.println(line);
            }
            read.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
