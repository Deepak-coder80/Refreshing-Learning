package OOPS.JAVA;

public class Hello {
    public static void main(String[] args) {
        // create an object for sample class
        Sample s1 = new Sample();
        s1.a = 90;
        s1.b = 12;
        s1.calculateSum();
        s1.dispaly();
    }
}

class Sample {
    int a;
    int b;
    int c;

    void calculateSum() {
        c = a + b;
    }

    void dispaly() {
        System.out.println("a=" + a + "\nb=" + b + "\nsum =" + c);
    }
}