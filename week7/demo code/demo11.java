package wk8;

import java.util.Arrays;

public class demo11 {
    public static void main(String[] args) {
        String s;
        s = "hello";

        //
        int[] arr;
        arr = new int[4];
        //2nd element
        arr[1] = 2;

        //display
        for(int e : arr){
            System.out.println(e);
        }
        //toString
        System.out.println(Arrays.toString(arr));



        //length: 4
        //max index : 3    4: out bound
        //i< a.length
        //i<= a.length -1


        //primitive types vs class type
        int t = 5;
        String s2 = "hello";
        System.out.println(test(t=6));





    }
    public static int test(int i){
        return i;
    }
}
