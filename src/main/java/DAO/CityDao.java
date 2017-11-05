package DAO;

import Connection.DBOrmConnection;
import Database.City;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import java.sql.SQLException;

/**
 * <p>CityDao class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class CityDao {

    private DBOrmConnection connection;

    /**
     * <p>Constructor for CityDao.</p>
     */
    public CityDao() {

        connection = new DBOrmConnection("src/main/resources/database.properties");
    }

    /**
     * <p>getCityDao.</p>
     *
     * @return a {@link com.j256.ormlite.dao.Dao} object.
     */
    public Dao<City, String> getCityDao() {

        try
        {
            return DaoManager.createDao(connection.getConnection(), City.class);
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
