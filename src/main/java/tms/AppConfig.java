package tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext("tms");
        CalcActionConfig calcActionConfig = (CalcActionConfig) app.getBean("calcActionConfig");
        calcActionConfig.start();
    }

}
