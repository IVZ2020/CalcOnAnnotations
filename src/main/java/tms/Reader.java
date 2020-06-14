package tms;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Reader {

    public double readDouble() {
        Scanner scanner = new Scanner (System.in);
        return scanner.nextDouble();
    }

    public String readString () {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
