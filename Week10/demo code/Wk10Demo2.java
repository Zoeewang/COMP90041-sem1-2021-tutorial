package wk10;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class Wk10Demo2 {
    public static void main(String[] args) {
        try{
            //System.out.println(1/0);
            Person p1 = new Person(null);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("get 1");
        }
        catch(NullPointerException e) {
            System.out.println("get 2");
        }
        catch(Exception e){
            System.out.println("hihi");  ///put end
        }


        System.out.println("hello");
    }
}
