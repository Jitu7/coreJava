package example6;

public class Example6 {

    public static void main(String[] args) {
        Instrument p = () -> System.out.println(":)");

        p.play();

        Musician pianoPlayer = new Musician(new Piano());
        pianoPlayer.play();

        Musician drumPlayer = new Musician(() -> System.out.println("Drum Sound !!"));
        drumPlayer.play();
    }

}
