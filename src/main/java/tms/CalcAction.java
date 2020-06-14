package tms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalcAction {

    @Autowired
    private Writer writer;
    @Autowired
    private Reader reader;
    @Autowired
    private CalcService calcService;

    double a;
    double b;
    String op;

    public void start () {
        writer.out("Input a");
        a = reader.readDouble();
        writer.out("Input b");
        b = reader.readDouble();
        writer.out("Input operation (sum / minus / div / mult)");
        op = reader.readString();
        writer.out(calcService.start(a, b,op));
    }
}
