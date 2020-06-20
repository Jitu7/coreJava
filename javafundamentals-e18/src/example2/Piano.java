package example2;

public class Piano implements Playable {
    int y;

    @Override
    public void play() {
        System.out.println("Play!");
    }

}
