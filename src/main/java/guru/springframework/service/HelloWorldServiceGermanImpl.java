package guru.springframework.service;

public class HelloWorldServiceGermanImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Hallo Welt!";
  }
}
