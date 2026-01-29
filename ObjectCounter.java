// Java program to count number of objects created using static variable

public class ObjectCounter {

    static int count = 0;   

    ObjectCounter() {
        count++;           
    }

    public static void main(String[] args) {

        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();

        System.out.println("Number of objects created: " + count);
    }
}
