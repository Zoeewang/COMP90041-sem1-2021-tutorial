package wk5;

public class Demo1 {
    public static final int APPLE_PRICE = 5;
    private static String name ; //class variable





    public static double method1(double num1, int num2){
        String str = "hello";
        return num1 + num2;
    }





    //overloading
    public static double method1(int num1, double num2){

        return 20.00;

    }










    public static void method2(int num, String str){
        System.out.println(str + num);
    }





    public static void main(String[] args) {

        System.out.println(1+1);
//        System.out.println(method1(1,2.0));
        System.out.println(method1(2.0,1));

//
//
//
//
//        method2(1,"hello");
        System.out.println(Demo2.changeName(name));
        for(int i=0; i<10 ; i++){

        }


    }

}
