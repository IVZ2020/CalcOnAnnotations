package tms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CalcActionConfig calcActionConfig (ReaderConfig readerConfig, WriterConfig writerConfig, CalcServiceConfig calcServiceConfig) {
        return new CalcActionConfig(writerConfig, readerConfig, calcServiceConfig);
    }

    @Bean
    public CalcServiceConfig calcServiceConfig () {
        return new CalcServiceConfig();
    }

    @Bean
    public ReaderConfig readerConfig () {
        return new ReaderConfig();
    }

    @Bean
    public WriterConfig writerConfig () {
        return new WriterConfig();
    }
}
