package example1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

    public static void main(String[] args) {

        System.out.println(
                LocalTime.now().format(DateTimeFormatter.ofPattern("hh-mm-ss")));

    }
}
