package DBHandler;

import DAO.CityDao;
import Database.City;

public class Create {

    private CityDao cityDao;

    public Create() {
        cityDao = new CityDao();
    }

    public void insertToCity(City city) {
        if (city != null) {
            try {
                cityDao.getCityDao().create(city);
            } catch (Exception e) {
                System.out.println("Error occured: " + e.getMessage());
            }
        } else {
            System.out.println("Your input is not valid");
        }
    }

}
