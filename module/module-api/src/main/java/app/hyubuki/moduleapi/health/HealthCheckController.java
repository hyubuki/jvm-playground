package app.hyubuki.moduleapi.health;


import app.hyubuki.modulecore.health.HealthTester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HealthCheckController {

  private final HealthTester healthTester = new HealthTester();

  @GetMapping("/health")
  public String healthCheck() {
    return "Application Name: " + healthTester.getApplicationName();
  }
}
