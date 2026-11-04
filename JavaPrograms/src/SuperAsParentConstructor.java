
class Parents1 {
    Parents1() {
        System.out.println("Parent constructor");
    }
}

class Child1 extends Parents1{
    Child1() {
        //super();
        System.out.println("Child constructor");
    }
}

public class SuperAsParentConstructor {
    public static void main(String[] args) {
        Child1 c = new Child1();
    }
}
