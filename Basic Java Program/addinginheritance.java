class x1 {
    int i, j;

    x1() {
        i = 10;
        System.out.println("int x");
    }
}

class z1 extends x1 {
    int j;

    z1() {
        i = 20;
        System.out.println("in z");
    }

    void add() {
        System.out.println(i + j);
    }
}

public class addinginheritance {
    public static void main(String[] args) {

        z1 ob = new z1();
        ob.add();

    }
}
