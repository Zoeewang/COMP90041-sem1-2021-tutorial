package wk92;
//
public abstract class Cat extends Animal implements Test, MyInterface{
    private String eyeColor;



//    public String introduceAnimal(){
//        return "Cat name is " + name + "age" + age + "eyeColor" +eyeColor;
//    }
    public abstract  String introduceAnimal();


    public String move(String[] str, int sth) {
        return null;
    }
    public String greet(){
        return "hello";
    }

}




//abstract:   can have normal method    extends(1)                related class
//interface:   only abstract             implements (multiple)    unrelated classes




//interface     open
//box, map, car, book