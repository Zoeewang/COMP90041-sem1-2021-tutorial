package wk10;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class Wk10Demo3 {
    public static void main(String[] args) {

        try{
            int i = 1;
            throw new NullPointerException();

        }catch(NullPointerException e){ //depends on match
            System.out.println("X");
        }catch(Exception e){
            System.out.println("W");
        }

        finally { //no matter what
            System.out.println("Z");
        }

        System.out.println("Y");// depend caught or not


    }
}
