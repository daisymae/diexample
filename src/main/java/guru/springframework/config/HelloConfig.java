package guru.springframework.config;

import guru.springframework.service.HelloWorldService;
import guru.springframework.service.HelloWorldServiceEnglishImpl;
import guru.springframework.service.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {
  @Bean
  @Profile("english")
  public HelloWorldService helloWorldServiceEnglish() {
    return new HelloWorldServiceEnglishImpl();
  }

  @Bean
  @Profile("spanish")
  public HelloWorldService helloWorldServiceSpanish() {
    return new HelloWorldSpanishImpl();
  }
}
