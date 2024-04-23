package example2;

public class Car {

    private int x;

    /*
    Engine can never exist without car
     */
    class Engine {
        public void run() {
            Car.this.x++;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
