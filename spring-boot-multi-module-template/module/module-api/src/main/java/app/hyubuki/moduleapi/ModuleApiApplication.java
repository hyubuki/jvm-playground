package app.hyubuki.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
  scanBasePackages = {
    "app.hyubuki"
  }
)
public class ModuleApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(ModuleApiApplication.class, args);
  }

}
