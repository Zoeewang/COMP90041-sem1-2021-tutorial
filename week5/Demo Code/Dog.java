package wk5;

public class Dog {
    private String color;
    private int age;
    private Dogname name;


    //constructor
    public Dog(String color, int age){
        this.age = age;
        this.color = color;
    }
//
    public Dog(String color, int age, String first, String last) {
        this.color = color;
        this.age = age;
        name = new Dogname(first,last);
    }



        public Dog(){
        color = "white";
        age =1;
    }




    public static int calAge(int age){
        return age + 1;
    }

    //getter
    public String getColor() {
        return color;
    }


    public Dogname getName(){
        return name;
    }

    public void setName(String first, String last)
    {
        name.setFirst(first);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    } //instance method --object

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        return "hello "+ color + age;
    }

    public static int method1(int i){
        int b = 2;
        return i+1;
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog("black",2);
        dog1.getAge();
        System.out.println(dog1);
        method1(1);

    }

}
