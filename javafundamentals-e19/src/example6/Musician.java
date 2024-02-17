package example6;

public class Musician {

    private Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play() {
        instrument.play();
    }
}
