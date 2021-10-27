/*
Polymorphism is that we use same names
1.Methode Overloading
*/

package OOPS.JAVA;

public class Polymorphism {
    public static void main(String[] args) {
        //create object
        // MOverloading mover = new MOverloading();
        // mover.dispaly();
        // mover.dispaly(45);

        SMOverriding obj = new SMOverriding();
        obj.dispaly();
        obj.superclassHello();
    }
    
}
class MOverloading{
    void dispaly(){
        System.out.println("display function without arguments");
    }
    void dispaly(int a){
        System.out.println("display function with argument " +a);
    }
}

class MOverriding{
    void dispaly(){
        System.out.println("overriding display from base class");
    }
}

class SMOverriding extends MOverriding{
    void dispaly(){
        System.out.println("Overriding display from sub class");
    }
    //super class
    void superclassHello(){
        super.dispaly();
    }
}