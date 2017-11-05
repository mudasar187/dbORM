package DBHandler;

import DAO.CountryDao;
import Database.City;
import Database.Country;
import com.j256.ormlite.stmt.UpdateBuilder;

/**
 * <p>Update class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class Update {

    private CountryDao countryDao;

    /**
     * <p>Constructor for Update.</p>
     */
    public Update() {

        countryDao = new CountryDao();
    }

    /**
     * <p>updateCountryNameByCode.</p>
     *
     * @param CountryCode a {@link java.lang.String} object.
     * @param newName a {@link java.lang.String} object.
     */
    public void updateCountryNameByCode(String CountryCode, String newName) {

        UpdateBuilder<Country, String> updateBuilder = countryDao.getCountryDao().updateBuilder();
        try
        {
            updateBuilder.updateColumnValue(Country.NAME_FIELD, newName);
            updateBuilder.where().eq(Country.ID_FIELD, CountryCode);
            int result = updateBuilder.update();
            if (result > 0)
            {
                System.out.println("### Success !");
            } else
            {
                System.out.println("### Fail !");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
