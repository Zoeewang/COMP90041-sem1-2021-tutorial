package wk9;

public class LateBindingDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Dog d1 = new Dog();
        Dog d2 = new Husky();


        a1.sleep();
        //a1.bark();
        a2.sleep();
        a2.sound();
        d1.bark();
        //d2.eat();
    }


}
