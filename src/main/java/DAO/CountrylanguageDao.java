package DAO;

import Connection.DBOrmConnection;
import Database.Country;
import Database.CountryLanguage;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

public class CountrylanguageDao {

    private DBOrmConnection connection;

    public CountrylanguageDao() {
        connection = new DBOrmConnection("src/main/resources/database.properties");
    }

    public Dao<CountryLanguage, String> getCountryLanguageDao() {
        try {
            return DaoManager.createDao(connection.getConnection(), CountryLanguage.class);
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
            return null;
        }
    }

}
