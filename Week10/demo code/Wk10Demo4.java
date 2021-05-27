package wk10;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class Wk10Demo4 {

    public void method1() throws Exception,ArrayIndexOutOfBoundsException,NullPointerException {
        int[] arr = {1,2};
        System.out.println(arr[2]);

    }






    public void method3() throws Exception {
        method1();
    }




    public void method2(){
        try{
        method1();
        }
        catch(Exception e){
            System.out.println("change a number!");
        }

    }

    public static void main(String[] args) {
            Wk10Demo4 obj = new Wk10Demo4();
            obj.method2();
    }



}
