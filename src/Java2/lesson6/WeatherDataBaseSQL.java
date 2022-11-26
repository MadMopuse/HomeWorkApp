package Java2.lesson6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataBaseSQL {

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection connection;
    private static  Statement statement;


    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:weather.db");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }try {
            getStatement().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Statement getStatement() {
        if (statement == null){
            try {
                statement = getConnection().createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return statement;
    }

    public static void insertData(WeatherDataBase weatherDataBase){
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(
                    "INSERT INTO weather (city, localDate, weatherText, temperature) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, weatherDataBase.getCity());
            preparedStatement.setString(2, weatherDataBase.getLocalDate());
            preparedStatement.setString(3, weatherDataBase.getWeatherText());
            preparedStatement.setDouble(4, weatherDataBase.getTemperature());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<WeatherDataBase> returnAll(){
        ArrayList<WeatherDataBase> WeatherList = new ArrayList<>();
        try {
            ResultSet resultSet = getStatement().executeQuery("SELECT * FROM weather");

            while (resultSet.next()){
                WeatherDataBase weather = new WeatherDataBase(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDouble(5));
                WeatherList.add(weather);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return WeatherList;
    }

    public static void createTable(){
        try {
            getStatement().executeUpdate("CREATE TABLE IF NOT EXISTS" +
                    " weather (id INTEGER PRIMARY KEY AUTOINCREMENT, city TEXT NOT NULL, localDate TEXT NOT NULL," +
                    "weatherText TEXT NOT NULL, temperature REAL NOT NULL)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
