package Java2.lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureValue {
    @JsonProperty("Value")
    public double value;
    @JsonProperty("Unit")
    public String unit;

    public String getValueAndUnit() {
        return value + unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public TemperatureValue() {
    }

    public TemperatureValue(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
}
