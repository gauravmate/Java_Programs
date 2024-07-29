package threadprograms;

class demo implements Runnable {
    Thread t;

    public demo() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        int i;
        try {
            for (i = 1; i < 5; i++) {
                System.out.println("child thread " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }

}

public class thread1 {
    public static void main(String[] args) throws Exception {
        demo ob1 = new demo();
        int i;
        try {
            for (i = 1; i < 5; i++) {
                System.out.println("main thread " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {

        }
    }
}
