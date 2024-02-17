package example5;

public final class EngineFactory {

    private EngineFactory() { // now it can't be instantiated outside
    }

    public static Engine build(String type) {

        return switch (type) {
            case "electric" -> new ElectricEngine();
            case "diesel" -> new DieselEngine();
            default -> throw new IllegalArgumentException();
        };

    }

}
