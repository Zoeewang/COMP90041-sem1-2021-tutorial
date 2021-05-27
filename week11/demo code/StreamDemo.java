package wk11;
import java.io.*;

public class StreamDemo {
    public static void main (String[] args)
    {
       PrintWriter outputStream = null; //outside try
        String filename = "stuff.txt";
        File file = new File("./src/wk11/stuff11.txt");
        if (file.exists()) {
            System.out.println("hello");
        }


        try {
            //outputStream = new PrintWriter(file);
            outputStream = new PrintWriter(new FileOutputStream(file,true));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + filename);
            System.exit(0);
        }

        if (file.exists()) {
            System.out.println("hello");
        }

        outputStream.println("The quick brown fox");
        outputStream.println("jumped over the lazy dog.");

        //outputStream.flush();
        outputStream.close();

        System.out.println("Written to file: " + filename);
    }
}
