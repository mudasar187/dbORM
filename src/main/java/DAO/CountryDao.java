package DAO;

import Connection.DBOrmConnection;
import Database.City;
import Database.Country;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

public class CountryDao {

    private DBOrmConnection connection;

    public CountryDao() {
        connection = new DBOrmConnection("src/main/resources/database.properties");
    }

    public Dao<Country, String> getCountryDao() {
        try {
            return DaoManager.createDao(connection.getConnection(), Country.class);
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
            return null;
        }
    }

}
