package tms;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

    public double start(double a, double b, String op) {

        switch (op) {
            case "sum":
                return a + b;
            case "minus":
                return a - b;
            case "mult":
                return a * b;
            case "div":
                if (b > 0) {
                    return a / b;
                } else break;
        }
        return -100;
    }
}

