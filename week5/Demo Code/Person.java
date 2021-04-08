package wk5;

public class Person {
    private String name;
    private int age;//instance variables


    public static final int PRICE =2; //static variable

    public static String greet; //class/static variable


    //constructor
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
//
    public Person(){

    }


    //non-static method / instance method
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }




    public void greet(String st){
        greet = st;
        System.out.println(greet);
    }



    public String toString()
    {
        return age + name;
    }










    public static void main(String[] args) {

        Person person1 = new Person("bob",20);
        System.out.println(person1);

        System.out.println(person1.toString());




//        Person person2 = new Person();
//        System.out.println(person1.getAge());
//        person1.setAge(40);
//        System.out.println(person1.getAge());
//
//        person1.greet("hello");
//        person1.greet("hi");
//
//        System.out.println(person1);








    }









}
