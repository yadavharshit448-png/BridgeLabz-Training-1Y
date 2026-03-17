interface A {
    void show();
}

interface B {
    void display();
}

class H implements A, B {

    public void show() {
        System.out.println("From A");
    }

    public void display() {
        System.out.println("From B");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        H h1 = new H();
        h1.show();
        h1.display();
    }


}