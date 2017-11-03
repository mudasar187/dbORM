package Database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable(tableName = "City")
public class City implements Serializable {

    public static final String ID_FIELD = "ID";
    public static final String NAME_FIELD = "Name";
    public static final String COUNTRYCODE_FIELD = "CountryCode";
    public static final String DISTRICT_FIELD = "District";
    public static final String POPULATION_FIELD = "Population";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = NAME_FIELD)
    private String name;

    @DatabaseField(columnName = COUNTRYCODE_FIELD)
    private String countryCode;

    @DatabaseField(columnName = DISTRICT_FIELD)
    private String district;

    @DatabaseField(columnName = POPULATION_FIELD)
    private int population;


    public City() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    public City(String name, String countryCode, String district, int population) {

        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public static String getIdField() { return ID_FIELD; }

    public static String getNameField() { return NAME_FIELD; }

    public static String getCountrycodeField() { return COUNTRYCODE_FIELD; }

    public static String getDistrictField() { return DISTRICT_FIELD; }

    public static String getPopulationField() { return POPULATION_FIELD; }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() { return countryCode; }

    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public String getDistrict() { return district; }

    public void setDistrict(String district) { this.district = district; }

    public int getPopulation() { return population; }

    public void setPopulation(int population) { this.population = population; }

    @Override
    public String toString() {

        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population='" + population + '\'' +
                '}';
    }
}
