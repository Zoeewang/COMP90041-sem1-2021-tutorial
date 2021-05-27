package wk11;

import java.io.Serializable;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class Dog implements Serializable {
    private int age;
    private String name;


    public Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    /**
     * this method is for ....
     * @return  return a string used for....
     */

    public String toString(){
        return age + name;
    }
}
