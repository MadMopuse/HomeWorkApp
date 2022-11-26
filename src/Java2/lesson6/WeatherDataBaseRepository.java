package Java2.lesson6;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherDataBaseRepository {

    boolean saveWeatherData(WeatherDataBase weatherDataBase) throws SQLException;

    List<WeatherDataBase> getAllSavedData() throws IOException, SQLException;

    void closeConnection();
}
