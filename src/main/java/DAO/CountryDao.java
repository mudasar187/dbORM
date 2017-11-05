package DAO;

import Connection.DBOrmConnection;
import Database.Country;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import java.sql.SQLException;

/**
 * <p>CountryDao class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class CountryDao {

    private DBOrmConnection connection;

    /**
     * <p>Constructor for CountryDao.</p>
     */
    public CountryDao() {

        connection = new DBOrmConnection("src/main/resources/database.properties");
    }

    /**
     * <p>getCountryDao.</p>
     *
     * @return a {@link com.j256.ormlite.dao.Dao} object.
     */
    public Dao<Country, String> getCountryDao() {

        try
        {
            return DaoManager.createDao(connection.getConnection(), Country.class);
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
