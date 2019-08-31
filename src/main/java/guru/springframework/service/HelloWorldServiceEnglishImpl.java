package guru.springframework.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Hello World";
  }
}
