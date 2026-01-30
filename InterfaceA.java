// Interface A
interface A {
    void show();   // public by default
}

// Interface B
interface B {
    void display();   // public by default
}

// Interface C
interface C {
    void print();   // public by default
}

// Class implementing all three interfaces
class Demo implements A, B, C {

    // Implementation of interface A method
    public void show() {
        System.out.println("Method from Interface A");
    }

    // Implementation of interface B method
    public void display() {
        System.out.println("Method from Interface B");
    }

    // Implementation of interface C method
    public void print() {
        System.out.println("Method from Interface C");
    }

    // Main method
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
        d.print();
    }
}
