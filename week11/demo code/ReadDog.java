package wk11;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class ReadDog {

    public static void main(String[] args) {
        ObjectInputStream inputStream = null;
        String filename = "dog.dat";
        Dog d1 = null;

        try
        {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            d1 =(Dog) inputStream.readObject();
            //dogs =(Dog[]) inputStream.readObject();
        }
        catch ( Exception e)
        {
            System.out.println("Could not read to file: " + filename);
            System.exit(0);
        }


        System.out.println(d1);
        //System.out.println(Arrays.toString(dogs));

    }


}
