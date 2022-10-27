class Base1 {
    Base1() {
        System.out.println("I'm a contructor.");
    }
    public int x;
    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("I'm a derived class constructor");
    }
    public int y;
    public int gety() {
        return y;
    }
    public void sety(int y) {
        this.y = y;
    }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}