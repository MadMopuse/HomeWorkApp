package Java2.lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headline {

    @JsonProperty("Text")
    public String text;

    public Headline() {
    }

    public Headline(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
