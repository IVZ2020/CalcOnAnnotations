package tms;

import org.springframework.stereotype.Component;

@Component
public class WriterConfig {

    public static void out (Object line) {
        System.out.println(line);
    }
}
