package wk9;


public class Dog extends Animal{
    private String furColor;

    //getter
    //setter

    public Dog(){

    }


    //ddddf
    public Dog(int age, String name, String furColor){
        super(age, name);
        this.furColor = furColor;
    }


    public void bark(){

    }
    public String introduceAnimal(){
        return "Dog name is " + name + "age" + age + "furColor" + furColor;
    }


}
