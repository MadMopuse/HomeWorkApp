package Java2.lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Temperature {
    @JsonProperty("Maximum")
    public TemperatureValue maximumTemperature;
    @JsonProperty("Minimum")
    public TemperatureValue minimumTemperature;

    public Temperature() {
    }

    public Temperature(TemperatureValue maximumTemperature, TemperatureValue minimumTemperature) {
        this.maximumTemperature = maximumTemperature;
        this.minimumTemperature = minimumTemperature;
    }

    public TemperatureValue getMaximumTemperature() {
        return maximumTemperature;
    }

    public TemperatureValue getMinimumTemperature() {
        return minimumTemperature;
    }
}
