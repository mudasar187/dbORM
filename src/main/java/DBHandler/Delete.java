package DBHandler;

import DAO.CityDao;
import DAO.CountryDao;
import DAO.CountrylanguageDao;
import Database.City;
import Database.Country;
import Database.CountryLanguage;
import com.j256.ormlite.stmt.DeleteBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Delete class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class Delete {

    private CityDao cityDao;
    private CountryDao countryDao;
    private CountrylanguageDao countrylanguageDao;
    private ArrayList<Object> multiArray;

    /**
     * <p>Constructor for Delete.</p>
     */
    public Delete() {

        cityDao = new CityDao();
        countryDao = new CountryDao();
        countrylanguageDao = new CountrylanguageDao();
        multiArray = new ArrayList<>();
    }

    /**
     * <p>getCityByID.</p>
     *
     * @param countryCode a {@link java.lang.String} object.
     */
    public void getCityByID(String countryCode) {

        try
        {
            List<City> cityList = cityDao.getCityDao().queryForEq(City.COUNTRYCODE_FIELD, countryCode);
            multiArray.add(cityList);

            DeleteBuilder<City, String> deleteBuilder = cityDao.getCityDao().deleteBuilder();
            deleteBuilder.where().eq(City.COUNTRYCODE_FIELD, countryCode);
            int result = deleteBuilder.delete();
            System.out.println("Result: " + result);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * <p>getCountryByCode.</p>
     *
     * @param countryCode a {@link java.lang.String} object.
     */
    public void getCountryByCode(String countryCode) {

        try
        {
            List<Country> countryList = countryDao.getCountryDao().queryForEq(Country.ID_FIELD, countryCode);
            multiArray.add(countryList);

            DeleteBuilder<Country, String> deleteBuilder = countryDao.getCountryDao().deleteBuilder();
            deleteBuilder.where().eq(Country.ID_FIELD, countryCode);
            int result = deleteBuilder.delete();
            System.out.println("Result: " + result);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * <p>getCountryLanguageByCountryCode.</p>
     *
     * @param countryCode a {@link java.lang.String} object.
     */
    public void getCountryLanguageByCountryCode(String countryCode) {

        try
        {
            List<CountryLanguage> countryLanguageList = countrylanguageDao.getCountryLanguageDao().queryForEq(
                    CountryLanguage.COUNTRYCODE_FIELD, countryCode);
            multiArray.add(countryLanguageList);

            DeleteBuilder<CountryLanguage, String> deleteBuilder = countrylanguageDao.getCountryLanguageDao().deleteBuilder();
            deleteBuilder.where().eq(CountryLanguage.COUNTRYCODE_FIELD, countryCode);
            int result = deleteBuilder.delete();
            System.out.println("Result: " + result);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * <p>insertIntoCity.</p>
     */
    public void insertIntoCity() {

        List<City> cityList = (List<City>) multiArray.get(0);
        for (City C : cityList)
        {
            try
            {
                cityDao.getCityDao().create(C);
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }

        }

    }

    /**
     * <p>insertIntoCountry.</p>
     */
    public void insertIntoCountry() {

        List<Country> countryList = (List<Country>) multiArray.get(1);
        for (Country C : countryList)
        {
            try
            {
                countryDao.getCountryDao().create(C);
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * <p>insertIntoCountryLanguage.</p>
     */
    public void insertIntoCountryLanguage() {

        List<CountryLanguage> countryLanguageList = (List<CountryLanguage>) multiArray.get(2);
        for (CountryLanguage CL : countryLanguageList)
        {
            try
            {
                countrylanguageDao.getCountryLanguageDao().create(CL);
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
