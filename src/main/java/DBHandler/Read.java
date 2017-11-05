package DBHandler;


import Connection.DBOrmConnection;
import DAO.CityDao;
import DAO.CountryDao;
import Database.City;
import Database.Country;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Read class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class Read {

    private CityDao cityDao;
    private CountryDao countryDato;

    /**
     * <p>Constructor for Read.</p>
     */
    public Read() {

        cityDao = new CityDao();
        countryDato = new CountryDao();
    }

    /**
     * <p>printEverythingInCity.</p>
     */
    public void printEverythingInCity() {

        try
        {
            List<City> cityList = cityDao.getCityDao().queryForAll();

            int index = 0;
            while (index < cityList.size())
            {
                System.out.println(cityList.get(index).toString());
                index++;
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * <p>print5LastElements.</p>
     */
    public void print5LastElements() {

        QueryBuilder<City, String> builder = cityDao.getCityDao().queryBuilder();
        builder.limit((long) 5);
        builder.orderBy(City.ID_FIELD, false);
        try
        {
            List<City> cityList = cityDao.getCityDao().query(builder.prepare());
            for (City C : cityList)
            {
                System.out.println(C.toString());
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * <p>print5FirstRowsInCountry.</p>
     */
    public void print5FirstRowsInCountry() {

        try
        {
            List<Country> countryList = countryDato.getCountryDao().queryForAll();

            int index = 0;
            while (index < 5)
            {
                System.out.println(countryList.get(index).toString());
                index++;
            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
