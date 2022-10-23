package Java2.lesson6;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty("DailyForecasts")
    public DailyForecast [] dailyForecasts;
    @JsonProperty("Headline")
    public Headline headline;

    public WeatherResponse() {
    }

    public WeatherResponse(DailyForecast[] dailyForecasts, Headline headline) {
        this.dailyForecasts = dailyForecasts;
        this.headline = headline;
    }

    public DailyForecast[] getDailyForecasts() {
        return dailyForecasts;
    }

    public Headline getHeadline() {
        return headline;
    }
}
