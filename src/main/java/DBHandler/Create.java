package DBHandler;

import DAO.CityDao;
import Database.City;

/**
 * <p>Create class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class Create {

    private CityDao cityDao;

    /**
     * <p>Constructor for Create.</p>
     */
    public Create() {

        cityDao = new CityDao();
    }

    /**
     * <p>insertToCity.</p>
     *
     * @param city a {@link Database.City} object.
     */
    public void insertToCity(City city) {

        if (city != null)
        {
            try
            {
                cityDao.getCityDao().create(city);
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        } else
        {
            System.out.println("### Your input is not valid ...");
        }
    }

}
