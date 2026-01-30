class ObjectCount {

    static int count = 0;   // static variable

    ObjectCount() {
        count++;            // increment when object is created
    }

    public static void main(String[] args) {

        new ObjectCount();
        new ObjectCount();
        new ObjectCount();

        System.out.println("Number of objects created: " + count);
    }
}
