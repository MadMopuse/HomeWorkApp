package Java2.lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty("IconPhrase")
    public String iconPhrase;

    public Day() {
    }

    public Day(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }
}
