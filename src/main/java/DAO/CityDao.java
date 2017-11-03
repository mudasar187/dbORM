package DAO;

import Connection.DBOrmConnection;
import Database.City;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

public class CityDao {

    private DBOrmConnection connection;

    public CityDao() {
        connection = new DBOrmConnection("src/main/resources/database.properties");
    }

    public Dao<City, String> getCityDao() {
        try {
            return DaoManager.createDao(connection.getConnection(), City.class);
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
            return null;
        }
    }

}
