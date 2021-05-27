package wk11;
import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class InputDemo {

    public static void main(String[] args)
    {

        Scanner inputStream = null;
        //String filename = "stuff.txt";
        File file = new File("./src/wk11/stuff.txt");

        try{
            inputStream = new Scanner(new FileInputStream(file));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + file);
            System.exit(0);
        }
//
//        String line1 = inputStream.nextLine();
//        String line2 = inputStream.nextLine();
//
//        System.out.println("Read from file: " + line1 + "\n" + line2);


        // read the rest
        String line = null;
        int count = 0;
        while(inputStream.hasNextLine())
        {
            line = inputStream.nextLine();
            count++;
            System.out.println("Line " + count + ": " + line);
        }

        System.out.println("Done.");
        inputStream.close();
    }
}
