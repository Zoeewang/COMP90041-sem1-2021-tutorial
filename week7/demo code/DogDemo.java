package wk8;

import wk5.Dog;

import java.util.Arrays;

public class DogDemo {
    public static void main(String[] args) {

    //create
    Dog d1 = new Dog("white", 2, "Bob");
    Dog d2 =  new Dog("black", 3, "Sue");
    Dog d3 = new Dog("yellow", 4, "Jon");
    Dog[] dogArr = {d1, d2, d3}; //length = 3




       System.out.println(d1);

       Dog[] newArr;
       newArr = new Dog[3];
       newArr[0] = d1;
       newArr[1] = d2;
       newArr[2] = d3;










    //fixed color, age, read names from argu
   Dog[] dogArr1 = new Dog[args.length];
       for(int i = 0; i<args.length;i++){
       dogArr1[i] = new Dog("white",2,args[i]);
   }
       System.out.println(Arrays.toString(dogArr1));


    //add a dog
    Dog[] dogArr2 = new Dog[dogArr.length+1];
        for(int i = 0; i<dogArr.length;i++){
        dogArr2[i] = dogArr[i];
    }
    dogArr2[dogArr2.length-1] = new Dog("white",2,args[0]);

        //good practice: create array length is large enough









    //remove, set it to null, read name from args, del it
        for(int i=0; i<dogArr.length;i++){
        if(dogArr[i].getName().equals(args[0])){
            dogArr[i]= null;
        }
    }

    //edit a dog in array
    dogArr[0].setName("happy");

}

}