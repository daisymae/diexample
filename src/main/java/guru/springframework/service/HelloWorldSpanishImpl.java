package guru.springframework.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldSpanishImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Hola mundo!!";
  }
}
