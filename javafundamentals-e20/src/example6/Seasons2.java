package example6;

public enum Seasons2 {

    SPRING {
        @Override
        public void rains() { // it overrides
            System.out.println(":(");
        }
    }, SUMMER {
        @Override
        public void rains() { // it overrides
            System.out.println(":(");
        }
    }, AUTUMN {
        @Override
        public void rains() { // it overrides
            System.out.println(":(");
        }
    }, WINTER {
        @Override
        public void rains() { // it overrides
            System.out.println(":(");
        }
    };

    // if its abstract all have to override
    public abstract void rains();

}
