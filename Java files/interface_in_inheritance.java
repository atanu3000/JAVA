interface sampleInterface {
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}

class MySampleclass implements childSampleInterface {
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
    public void meth3() {
        System.out.println("Meth3");
    }
    public void meth4() {
        System.out.println("Meth4");
    }
}
public class interface_in_inheritance {
    public static void main(String[] args) {
        MySampleclass ob = new MySampleclass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
    }
}
