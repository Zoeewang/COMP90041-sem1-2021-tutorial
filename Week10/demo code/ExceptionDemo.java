package wk10;

import java.util.Scanner;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String s = kbd.nextLine();
        logInExample(s);

    }



    public static void logInExample(String inputPwd) {

        String username = "uni";
        String correctPwd = "unimelb123";
        try {
            if (inputPwd.equals(correctPwd)) {
                System.out.println(" yeah, correct pwd");
            } else {
                throw new PasswordCheckException("user defined error msg");
                //throw new PasswordCheckException("user defined message");
            }
        } catch (PasswordCheckException e) {
            //System.out.println("wrong pwd");
            // the alternative way is
            System.out.println(e.getMessage());

        }


//        System.out.println("test");
    }
}
