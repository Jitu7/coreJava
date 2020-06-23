package example6;

public enum Seasons {

    SPRING, SUMMER, AUTUMN { // not recommended

        @Override
        public void rains() { // it overrides
            System.out.println(":(");
        }

    }, WINTER;

    public void rains() {
        System.out.println(":)");
    }

}
