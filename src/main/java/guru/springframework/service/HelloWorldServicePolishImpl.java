package guru.springframework.service;

public class HelloWorldServicePolishImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Witaj świecie";
  }
}
