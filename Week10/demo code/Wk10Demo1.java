package wk10;

public class Wk10Demo1 {
    /**
     * @author Zhe Wang
     * The University of Melbourne
     */

    public static void main(String[] args){

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }


        System.out.println("helloo");



    }
}
