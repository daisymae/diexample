package guru.springframework.config;

import guru.springframework.service.HelloWorldService;
import guru.springframework.service.HelloWorldServiceEnglishImpl;
import guru.springframework.service.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
  @Bean
  public HelloWorldService helloWorldServiceEnglish() {
    return new HelloWorldServiceEnglishImpl();
  }

  @Bean
  public HelloWorldService helloWorldServiceSpanish() {
    return new HelloWorldSpanishImpl();
  }
}
