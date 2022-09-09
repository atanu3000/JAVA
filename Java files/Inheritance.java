class ShowA{
    void printA(){
        System.out.println("This class 'A'");
    }
}
class ShowB extends ShowA{
    void printB() {
        System.out.println("This class 'B'");
    }
}
class ShowC extends ShowB{
    void printC(){
        System.out.println("This class 'C'");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        ShowA o1 = new ShowA();
        o1.printA();
        // o1.printB();
        // o1.printC();
        
        ShowB o2 = new ShowB();
        o2.printA();
        o2.printB();
        // o2.printC();

        ShowC o3 = new ShowC();
        o3.printA();
        o3.printB();
        o3.printC();
    }
}
