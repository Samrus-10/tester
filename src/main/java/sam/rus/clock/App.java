package sam.rus.clock;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        System.out.println(Clock.systemUTC().instant());
        Instant instant = Instant.ofEpochSecond(11);
        String now = Instant.now().atOffset(ZoneOffset.ofHours(1)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now);
        System.out.println(instant);

    }
}
