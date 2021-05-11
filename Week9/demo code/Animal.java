package wk92;

public abstract class Animal {
    protected int age;
    protected String name;



//share same method
public void sleep(){
        System.out.println("Zzz");
        }

//must concrete this different method
public abstract String introduceAnimal();

//cat dog    car, assignment

}
