package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created sample Spring controller
 */
@RestController
public class HelloSpringController {

  @GetMapping(value = "/")
  public String greetings(){
    return "Welcome to our Spring Boot application!";
  }

}
