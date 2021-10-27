package OOPS.JAVA;

public class Test {
    public static void main(String[] args) {
        //object of second cls
        SecondCls obj = new SecondCls();
        //first class object
        FirstCls fc = new FirstCls();

        fc.dispaly(obj);
    }
}

class FirstCls{
    void dispaly(SecondCls sc){
        sc.dispaly();
    }
}

class SecondCls{
    void dispaly(){
        System.out.println("Hello from second class");
    }
}