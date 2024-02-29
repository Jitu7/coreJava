public class Example5 {

    //    static final ThreadLocal<Integer> local = new ThreadLocal<>();
    static final ThreadLocal<Integer> local = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable r1 = () -> {
            while (true) {
                local.set(10);
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " " + local.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable r2 = () -> {
            while (true) {
                local.set(20);
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " " + local.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        new Thread(r1, "T1").start();
        new Thread(r2, "T2").start();


    }
}
