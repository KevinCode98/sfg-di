package pvin.springframework.sfg_di.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
