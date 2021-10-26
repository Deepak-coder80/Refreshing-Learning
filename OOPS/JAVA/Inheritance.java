/*
Inheritance is just like genitical transfer .
there will be a copy methode in extended method
Inheritance classified into 3
1.Single
2.Multilevel
3.Hierarchial

*/

package OOPS.JAVA;

public class Inheritance {
    public static void main(String[] args) {
        //object of second class
        SecondClass  sClass = new SecondClass();
        sClass.displayfc();
        sClass.displaysc();
    }
    
}

class FirstClass{
    FirstClass(){
        System.out.println("First class Constructor");
    }
    void displayfc(){
        System.out.println("Hello from the firstClass");
    }
}

class SecondClass extends FirstClass{
    SecondClass(){
        System.out.println("Second class Construcor");
    }
    void displaysc(){
        System.out.println("Hello from second Class");
    }
}
