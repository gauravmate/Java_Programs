package threadprograms;

class demo1 implements Runnable {
    Thread t;

    public demo1(String n) {
        t = new Thread(this);
        t.setName(n);
        t.start();
    }

    public void run() {
        int i;
        try {
            for (i = 1; i < 5; i++) {
                System.out.println("child Thread" + t.getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }

}

public class multiplethread {
    public static void main(String[] args) throws Exception {

        demo1 ob1 = new demo1("A");
        demo1 ob2 = new demo1("B");
        demo1 ob3 = new demo1("C");
        demo1 ob4 = new demo1("D");
        int i;
        try {
            for (i = 1; i < 5; i++) {
                System.out.println("main Thread" + i);
                Thread.sleep(1500);
            }
        } catch (Exception e) {

        }

    }
}
