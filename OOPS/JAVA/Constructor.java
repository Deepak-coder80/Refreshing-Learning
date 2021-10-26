/*
Constructor is a method that will called when the object that class has been 
created
when I write like 
Sample sple = new Sample()

Here after the new keyword the Sample() is the constructor calling

Here is example for this ,
There is two classes such as Constructor (the main class) and Sample class
*/

package OOPS.JAVA;

public class Constructor {
    public static void main(String[] args) {
        Sample smple = new Sample();
    }
}
class Sample{
    Sample(){
        System.out.println("This is an consturctor");
    }
}