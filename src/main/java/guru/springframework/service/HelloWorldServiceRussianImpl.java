package guru.springframework.service;

public class HelloWorldServiceRussianImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Привет, мир";
  }
}
