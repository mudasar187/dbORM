package DAO;

import Connection.DBOrmConnection;
import Database.CountryLanguage;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

/**
 * <p>CountrylanguageDao class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class CountrylanguageDao {

    private DBOrmConnection connection;

    /**
     * <p>Constructor for CountrylanguageDao.</p>
     */
    public CountrylanguageDao() {

        connection = new DBOrmConnection("src/main/resources/database.properties");
    }

    /**
     * <p>getCountryLanguageDao.</p>
     *
     * @return a {@link com.j256.ormlite.dao.Dao} object.
     */
    public Dao<CountryLanguage, String> getCountryLanguageDao() {

        try
        {
            return DaoManager.createDao(connection.getConnection(), CountryLanguage.class);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
