package guru.springframework.service;

public class HelloWorldServiceFrenchImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Bonjour de monde";
  }
}
