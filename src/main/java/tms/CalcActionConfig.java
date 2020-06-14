package tms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CalcActionConfig {

    private WriterConfig writerConfig;
    private ReaderConfig readerConfig;
    private CalcServiceConfig calcServiceConfig;

    double a;
    double b;
    String op;

    public CalcActionConfig(WriterConfig writerConfig, ReaderConfig readerConfig, CalcServiceConfig calcServiceConfig) {
        this.writerConfig = writerConfig;
        this.readerConfig = readerConfig;
        this.calcServiceConfig = calcServiceConfig;
    }

    public void start () {
        writerConfig.out("Input a");
        a = readerConfig.readDouble();
        writerConfig.out("Input b");
        b = readerConfig.readDouble();
        writerConfig.out("Input operation (sum / minus / div / mult)");
        op = readerConfig.readString();
        writerConfig.out(calcServiceConfig.start(a, b,op));
    }
}
