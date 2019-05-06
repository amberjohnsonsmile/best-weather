package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class WeatherController {
  private static final int high = 70;
  private static final int low = 50;
  private static final String type = "sunny";

  @RequestMapping("/weather")
  public Weather weather(@RequestParam(value="favorite", defaultValue="rainy") String favorite) {
    return new Weather(high, low, type, favorite);
  }
}
