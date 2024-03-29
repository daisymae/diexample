package guru.springframework.config;

import guru.springframework.service.HelloWorldFactory;
import guru.springframework.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

  @Bean
  public HelloWorldFactory helloWorldFactory() {
    return new HelloWorldFactory();
  }

  @Bean
  @Profile("english")
  @Primary
  public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
    return factory.createHelloWorldService("en");
  }

  @Bean
  @Profile("spanish")
  @Primary
  public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
    return factory.createHelloWorldService("es");
  }

  @Bean(name = "french")
  public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
    return factory.createHelloWorldService("fr");
  }

  @Bean
  public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
    return factory.createHelloWorldService("de");
  }

  @Bean
  public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory) {
    return factory.createHelloWorldService("pl");
  }

  @Bean
  public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory) {
    return factory.createHelloWorldService("ru");
  }

}
