class A{
    void method(){
        System.out.println("From class A");
    }
}
class B extends A{
    void method(){
        System.out.println("From class B");
    }
}
public class Binding{
    public static void main (String[] args) {
        A a1 = new A();
        a1.method();
        A a2 = new B();
        a2.method();
    }
}

