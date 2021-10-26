/*
Named parameters are parameters that passed to the constructor
when the named parameter and variable inside that class(global) are
same in name then use the 'this' keyword or this pointer(when comes to 
cpp and c)
*/

package OOPS.JAVA;

public class NamedParameters {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        ThisKey key = new ThisKey(num1, num2);

        key.display();
    }
    
}
class ThisKey{
    int a,b;
    ThisKey(int a , int b){
        this.a=a;
        this.b=b;
        System.out.println("a = "+a+" b = "+b);
    }
    void display(){
        System.out.println("a = "+a+" b = "+b);
    }
}