package wk9;

public class MissingPerson extends Person{

    public MissingPerson(){

    }


}


//Dog d1 = new Dog(1,"hh")
//Dog d2 = new Dog(d1)

//Person (name)   // Person p1 = new Person("ann")
//MissingPerson (Person p, int day) // MissingPerson mp = new MissingPerson(p1,20)
//MissinPerson constructor -- condition: Person p1 name is not empty, otherwise exit

//p1.setname("")   --privacy leak
// new MissingPerson(Person(p1),20)
//p1.setname("")   --all good