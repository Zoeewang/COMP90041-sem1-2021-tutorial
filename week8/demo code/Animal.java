package wk9;

public class Animal {
    protected int age;
    protected String name;

    public Animal(){

    }
    //constructor
    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    //share same method
    public void sleep(){
        System.out.println("Zzz");
    }

    public void sound(){
        System.out.println("hhh");
    }

    //must concrete this different method
    //public abstract String introduceAnimal();
}
