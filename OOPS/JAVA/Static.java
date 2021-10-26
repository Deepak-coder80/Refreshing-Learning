package OOPS.JAVA;

public class Static {
    int a = 10;
    //static int a=10;//-->METHOD 1
    public static void main(String[] args) {
        // System.out.println(a);-->this will produce an error because
        // variable a is not a static variable

        /*
        This can be fixed in two ways
        1. make the variable as static one
        2. create an object for this class
        */
        // System.out.println(a); --> Method1

        //Method 2
        Static obj = new Static();

        System.out.println(obj.a);

    }
}
