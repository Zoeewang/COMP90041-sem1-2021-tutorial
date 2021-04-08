package wk5;

public class Demo2 {
    public static String changeName(String name){
        return name +"haha";
    }



    public static void main(String[] args) {
        Person p2 = new Person("carl",15);
        System.out.println(p2.getAge());
        p2.setAge(40);
        System.out.println(p2.getAge());






    }
}
