package example2;

/*
    Thread Priority (Not Recommended)
    ---------------
    Thread.MIN_PRIORITY = 1
    Thread.NORM_PRIORITY = 5
    Thread.MAX_PRIORITY = 10

    new Thread().setPriority(5); // 1 -- 10 default 5

    the priority of the newly created thread is set equal to the
    priority of the thread creating it, that is, the currently running
    thread

    1) priorities are between 1 - 10
    2) default priority is 5
    3) Priority is just an advise we give to JVM,
    JVM may consider or may not consider.
    4) we should consider Synchronization in case of Priority
    to control threads

    using join() we can control
 */
public class Example2 {

    public static void main(String[] args) {
        // 1st work
        // query DB1 -> 3 seconds
        // query DB2 -> 2 seconds
        // 3 + 2  5 second
        // if we do query DB1 n DB2 in different threads then
        // Max(3, 2) = 3 seconds

        // 2nd work ---> join()
        // processing

        var db1 = new DB1Runnable();
        var db2 = new DB2Runnable();

        var t1 = new Thread(db1);
        var t2 = new Thread(db2);

        t1.start();
        t2.start();



        /*
         current thread i.e main thread waits for finish of t1, t2
         */
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PROCESSING..."); // main
    }

}
