package Java2.lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.text.SimpleDateFormat;

import static Java2.lesson6.HomeWork6.CURRENT_DAY;
import static Java2.lesson6.HomeWork6.FIVE_DAYS;

public class WeatherProcessor {

    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";

    private static final String SAINT_PETERSBURG_KEY = "474212_PC";

    //api-key from my account from https://developer.accuweather.com/
    private static final String API_KEY = "gUFLDVvorvAKJ7bi8UyBBA6md5M8eDAb";
    public static void getWeather(int dayCount) throws IOException {

        OkHttpClient client = new OkHttpClient();

        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(SAINT_PETERSBURG_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

       // System.out.println(url.toString());

        // При необходимости указать заголовки
        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        //System.out.println(jsonResponse);
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse weatherResponse = objectMapper.readValue(jsonResponse, WeatherResponse.class);
        //System.out.println(weatherResponse.getHeadline().getText());

        if (dayCount == CURRENT_DAY){
            System.out.println("Current weather: " + weatherResponse.getHeadline().getText() +
                    "\nMin Temperature " + weatherResponse.getDailyForecasts()[0].getTemperature().getMinimumTemperature().getValueAndUnit() +
                    "\nMax Temperature " + weatherResponse.getDailyForecasts()[0].getTemperature().getMaximumTemperature().getValueAndUnit());
        } else if (dayCount == FIVE_DAYS){
            String pattern = "dd-MM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

            for (DailyForecast df : weatherResponse.getDailyForecasts() ){
                System.out.println("In city Saint-Petersburg for date " + simpleDateFormat.format(df.getDate())
                        + ". Waiting: " + df.getDay().getIconPhrase()
                        + ". Min Temperature: " + df.getTemperature().getMinimumTemperature().getValueAndUnit()
                        + ". Max Temperature: " + df.getTemperature().getMaximumTemperature().getValueAndUnit());
            }
        }
    }

}
