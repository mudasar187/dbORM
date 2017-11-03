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

public class Read {

    private CityDao cityDao;
    private CountryDao countryDato;

    public Read() {
        cityDao = new CityDao();
        countryDato = new CountryDao();
    }

    public void printEverythingInCity() {
        try {
            List<City> cityList = cityDao.getCityDao().queryForAll();

            int index = 4082;
            while (index < 4084) {
                System.out.println("Ex: " + cityList.get(index).toString());
                index++;
            }
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }

    }

    public void print10LastElements() {
        QueryBuilder<City, String> builder = cityDao.getCityDao().queryBuilder();
        builder.limit((long) 10);
        builder.orderBy(City.ID_FIELD, false);
        try {
            List<City> cityList = cityDao.getCityDao().query(builder.prepare());
            for (City C: cityList) {
                System.out.println("Ex: " + C.toString());
            }
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }

    }

    public void printEverythingCountry() {
        try {
            List<Country> countryList = countryDato.getCountryDao().queryForAll();

            int index = 0;
            while (index < 5) {
                System.out.println("Ex: " + countryList.get(index).toString());
                index++;
            }

        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }


}
