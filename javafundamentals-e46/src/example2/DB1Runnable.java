package example2;

/*
    General rule there might be some exceptions
   -----------------------------------------------
    Whenever you see method that's blocking a thread remember
    that method throws InterruptedException.
    ex- sleep(), wait(), join() ...

*/
public class DB1Runnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("DB 1 querying ended...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
