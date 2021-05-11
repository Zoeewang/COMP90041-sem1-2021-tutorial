package wk9;

import wk92.MyInterface;

public class Cat extends Animal{
    private String eyeColor;


    public Cat(){

    }

    public Cat(int age, String name, String eyeColor){
        super(age, name);
        this.eyeColor = eyeColor;
    }

    public String introduceAnimal(){
        return "Cat name is " + name + "age" + age + "eyeColor" +eyeColor;
    }


}
