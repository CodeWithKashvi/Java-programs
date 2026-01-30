class Apple {
    void show() {
        System.out.println ("This is Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Apple a2 = new Banana();
        Apple a3 = new Cherry();

        a1.show();
        a2.show();
        a3.show();
    }
}
