package threadprograms;

class demo2 implements Runnable {
    Thread t;

    public demo2(String n) {
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

public class multiplethread1 {
    public static void main(String[] args) throws Exception {

        demo1 ob1 = new demo1("A");
        demo1 ob2 = new demo1("B");
        demo1 ob3 = new demo1("C");
        int i;
        // System.out.println("child Thread A isAlive"ob1.+.isAlive());
        // System.out.println("child Thread B isAlive"ob2.t.isAlive());
        // System.out.println("child Thread C isAlive"ob3.t.isAlive());
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e) {

        }
        // System.out.println("child Thread C isAlive"ob31.+.isAlive());
        // System.out.println("child Thread B isAlive"ob2.t.isAlive());
        // System.out.println("child Thread C isAlive"ob3.t.isAlive());

    }
}
