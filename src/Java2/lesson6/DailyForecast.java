package Java2.lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)

public class DailyForecast {
    @JsonProperty("Date")
    public Date date;
    @JsonProperty("Temperature")
    public Temperature temperature;
    @JsonProperty("Day")
    public Day day;

    public DailyForecast() {
    }

    public DailyForecast(Date date, Temperature temperature, Day day) {
        this.date = date;
        this.temperature = temperature;
        this.day = day;
    }

    public Day getDay() {
        return day;
    }

    public Date getDate() {
        return date;
    }

    public Temperature getTemperature() {
        return temperature;
    }
}
