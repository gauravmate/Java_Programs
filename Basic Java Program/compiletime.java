class demoa13 {
    void add(int x, int y) {
        System.out.println("int add function called");
        System.out.println(x + y);
    }

    void add(float x, float y) {
        System.out.println("int add function called");
        System.out.println(x + y);
    }
}

public class compiletime {
    public static void main(String[] args) {
        demoa13 ob = new demoa13();
        ob.add(100, 200);
        ob.add(1.2f, 2.2f);
    }
}
