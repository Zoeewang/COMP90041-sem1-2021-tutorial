package wk11;


import java.io.*;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class WriteDog {
    public static void main(String[] args) {

        Dog d1 = new Dog(1,"bob");
//        Dog d2 = new Dog(2, "sue");
//        Dog[] dogs = {d1, d2};

        ObjectOutputStream outputStream = null;
        String filename = "dog.dat";

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            outputStream.writeObject(d1);

        } catch (FileNotFoundException e) {
            System.out.println("File dog.txt was not found");
            System.out.println("or could not be opened.");
        } catch (IOException e) {
            System.out.println("Could not write to file: " + filename);
            System.exit(0);
        }
        finally {
            if (outputStream != null){
                try{
                    outputStream.close();
                }
                catch(IOException e){
                    System.out.println("Error closing!");
                    System.exit(0);
                }
            }
        }
    }
}


