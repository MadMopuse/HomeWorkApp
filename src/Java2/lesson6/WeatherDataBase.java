package Java2.lesson6;

public class WeatherDataBase {


    //String city, String localDate, String weatherText, Double temperature
//Поля класса
    public String city;

    public String localDate;

    public String weatherText;

    public double temperature;

    public String getCity() {
        return city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public double getTemperature() {
        return temperature;
    }

    //Constructor
    public WeatherDataBase(String city, String localDate, String weatherText, double temperature) {
        this.city = city;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }
//Вывод информации
    @Override
     public String toString(){
        return String.format("Город: %s| Время: %s| Описание погоды: %s| Температура: %s",
                this.city, this.localDate, this.weatherText, this.temperature);
     }


}
