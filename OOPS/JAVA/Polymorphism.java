/*
Polymorphism is that we use same names
1.Methode Overloading
*/

package OOPS.JAVA;

public class Polymorphism {
    public static void main(String[] args) {
        //create object
        MOverloading mover = new MOverloading();
        mover.dispaly();
        mover.dispaly(45);
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

