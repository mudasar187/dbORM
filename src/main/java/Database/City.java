package Database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * <p>City class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
@DatabaseTable(tableName = "City")
public class City implements Serializable {

    /** Constant <code>ID_FIELD="ID"</code> */
    public static final String ID_FIELD = "ID";
    /** Constant <code>NAME_FIELD="Name"</code> */
    public static final String NAME_FIELD = "Name";
    /** Constant <code>COUNTRYCODE_FIELD="CountryCode"</code> */
    public static final String COUNTRYCODE_FIELD = "CountryCode";
    /** Constant <code>DISTRICT_FIELD="District"</code> */
    public static final String DISTRICT_FIELD = "District";
    /** Constant <code>POPULATION_FIELD="Population"</code> */
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


    /**
     * <p>Constructor for City.</p>
     */
    public City() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    /**
     * <p>Constructor for City.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @param countryCode a {@link java.lang.String} object.
     * @param district a {@link java.lang.String} object.
     * @param population a int.
     */
    public City(String name, String countryCode, String district, int population) {

        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    /**
     * <p>getIdField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getIdField() {

        return ID_FIELD;
    }

    /**
     * <p>getNameField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getNameField() {

        return NAME_FIELD;
    }

    /**
     * <p>getCountrycodeField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getCountrycodeField() {

        return COUNTRYCODE_FIELD;
    }

    /**
     * <p>getDistrictField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getDistrictField() {

        return DISTRICT_FIELD;
    }

    /**
     * <p>getPopulationField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getPopulationField() {

        return POPULATION_FIELD;
    }

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a int.
     */
    public int getId() {

        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a int.
     */
    public void setId(int id) {

        this.id = id;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() {

        return name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object.
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * <p>Getter for the field <code>countryCode</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountryCode() {

        return countryCode;
    }

    /**
     * <p>Setter for the field <code>countryCode</code>.</p>
     *
     * @param countryCode a {@link java.lang.String} object.
     */
    public void setCountryCode(String countryCode) {

        this.countryCode = countryCode;
    }

    /**
     * <p>Getter for the field <code>district</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDistrict() {

        return district;
    }

    /**
     * <p>Setter for the field <code>district</code>.</p>
     *
     * @param district a {@link java.lang.String} object.
     */
    public void setDistrict(String district) {

        this.district = district;
    }

    /**
     * <p>Getter for the field <code>population</code>.</p>
     *
     * @return a int.
     */
    public int getPopulation() {

        return population;
    }

    /**
     * <p>Setter for the field <code>population</code>.</p>
     *
     * @param population a int.
     */
    public void setPopulation(int population) {

        this.population = population;
    }

    /** {@inheritDoc} */
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
