package Database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * <p>Country class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
@DatabaseTable(tableName = "Country")
public class Country implements Serializable {

    /** Constant <code>ID_FIELD="Code"</code> */
    public static final String ID_FIELD = "Code";
    /** Constant <code>NAME_FIELD="Name"</code> */
    public static final String NAME_FIELD = "Name";
    /** Constant <code>CONTINENT_FIELD="Continent"</code> */
    public static final String CONTINENT_FIELD = "Continent";
    /** Constant <code>REGION_FIELD="Region"</code> */
    public static final String REGION_FIELD = "Region";
    /** Constant <code>SURFACEAREA_FIELD="SurfaceArea"</code> */
    public static final String SURFACEAREA_FIELD = "SurfaceArea";
    /** Constant <code>INDEPYEAR_FIELD="IndepYear"</code> */
    public static final String INDEPYEAR_FIELD = "IndepYear";
    /** Constant <code>POPULATION_FIELD="Population"</code> */
    public static final String POPULATION_FIELD = "Population";
    /** Constant <code>LIFEEXPECTANCY_FIELD="LifeExpectancy"</code> */
    public static final String LIFEEXPECTANCY_FIELD = "LifeExpectancy";
    /** Constant <code>GNP_FIELD="GNP"</code> */
    public static final String GNP_FIELD = "GNP";
    /** Constant <code>GNPOLD_FIELD="GNPOld"</code> */
    public static final String GNPOLD_FIELD = "GNPOld";
    /** Constant <code>LOCALNAME_FIELD="LocalName"</code> */
    public static final String LOCALNAME_FIELD = "LocalName";
    /** Constant <code>GOVERNEMENTFORM_FIELD="GovernmentForm"</code> */
    public static final String GOVERNEMENTFORM_FIELD = "GovernmentForm";
    /** Constant <code>HEADOFSTATE_FIELD="HeadOfState"</code> */
    public static final String HEADOFSTATE_FIELD = "HeadOfState";
    /** Constant <code>CAPITAL_FIELD="Capital"</code> */
    public static final String CAPITAL_FIELD = "Capital";
    /** Constant <code>CODE2_FIELD="Code2"</code> */
    public static final String CODE2_FIELD = "Code2";


    @DatabaseField(columnName = ID_FIELD)
    private String code;

    @DatabaseField(columnName = NAME_FIELD)
    private String name;

    @DatabaseField(columnName = CONTINENT_FIELD)
    private String continent;

    @DatabaseField(columnName = REGION_FIELD)
    private String region;

    @DatabaseField(columnName = SURFACEAREA_FIELD)
    private double surfaceArea;

    @DatabaseField(columnName = INDEPYEAR_FIELD)
    private int indepYear;

    @DatabaseField(columnName = POPULATION_FIELD)
    private int population;

    @DatabaseField(columnName = LIFEEXPECTANCY_FIELD)
    private double lifeExpectancy;

    @DatabaseField(columnName = GNP_FIELD)
    private double gnp;

    @DatabaseField(columnName = GNPOLD_FIELD)
    private double gnpOld;

    @DatabaseField(columnName = LOCALNAME_FIELD)
    private String localName;

    @DatabaseField(columnName = GOVERNEMENTFORM_FIELD)
    private String governmentForm;

    @DatabaseField(columnName = HEADOFSTATE_FIELD)
    private String headOfState;

    @DatabaseField(columnName = CAPITAL_FIELD)
    private int capital;

    @DatabaseField(columnName = CODE2_FIELD)
    private String code2;


    /**
     * <p>Constructor for Country.</p>
     */
    public Country() {
        // all persisted classes must define a no-arg constructor with at least package visibility
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
     * <p>getContinentField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getContinentField() {

        return CONTINENT_FIELD;
    }

    /**
     * <p>getRegionField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getRegionField() {

        return REGION_FIELD;
    }

    /**
     * <p>getSurfaceareaField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getSurfaceareaField() {

        return SURFACEAREA_FIELD;
    }

    /**
     * <p>getIndepyearField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getIndepyearField() {

        return INDEPYEAR_FIELD;
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
     * <p>getLifeexpectancyField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getLifeexpectancyField() {

        return LIFEEXPECTANCY_FIELD;
    }

    /**
     * <p>getGnpField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getGnpField() {

        return GNP_FIELD;
    }

    /**
     * <p>getGnpoldField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getGnpoldField() {

        return GNPOLD_FIELD;
    }

    /**
     * <p>getLocalnameField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getLocalnameField() {

        return LOCALNAME_FIELD;
    }

    /**
     * <p>getGovernementformField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getGovernementformField() {

        return GOVERNEMENTFORM_FIELD;
    }

    /**
     * <p>getHeadofstateField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getHeadofstateField() {

        return HEADOFSTATE_FIELD;
    }

    /**
     * <p>getCapitalField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getCapitalField() {

        return CAPITAL_FIELD;
    }

    /**
     * <p>getCode2Field.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getCode2Field() {

        return CODE2_FIELD;
    }

    /**
     * <p>Getter for the field <code>code</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCode() {

        return code;
    }

    /**
     * <p>Setter for the field <code>code</code>.</p>
     *
     * @param code a {@link java.lang.String} object.
     */
    public void setCode(String code) {

        this.code = code;
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
     * <p>Getter for the field <code>continent</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getContinent() {

        return continent;
    }

    /**
     * <p>Setter for the field <code>continent</code>.</p>
     *
     * @param continent a {@link java.lang.String} object.
     */
    public void setContinent(String continent) {

        this.continent = continent;
    }

    /**
     * <p>Getter for the field <code>region</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRegion() {

        return region;
    }

    /**
     * <p>Setter for the field <code>region</code>.</p>
     *
     * @param region a {@link java.lang.String} object.
     */
    public void setRegion(String region) {

        this.region = region;
    }

    /**
     * <p>Getter for the field <code>surfaceArea</code>.</p>
     *
     * @return a double.
     */
    public double getSurfaceArea() {

        return surfaceArea;
    }

    /**
     * <p>Setter for the field <code>surfaceArea</code>.</p>
     *
     * @param surfaceArea a {@link java.lang.Double} object.
     */
    public void setSurfaceArea(Double surfaceArea) {

        this.surfaceArea = surfaceArea;
    }

    /**
     * <p>Getter for the field <code>indepYear</code>.</p>
     *
     * @return a int.
     */
    public int getIndepYear() {

        return indepYear;
    }

    /**
     * <p>Setter for the field <code>indepYear</code>.</p>
     *
     * @param indepYear a int.
     */
    public void setIndepYear(int indepYear) {

        this.indepYear = indepYear;
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

    /**
     * <p>Getter for the field <code>lifeExpectancy</code>.</p>
     *
     * @return a double.
     */
    public double getLifeExpectancy() {

        return lifeExpectancy;
    }

    /**
     * <p>Setter for the field <code>lifeExpectancy</code>.</p>
     *
     * @param lifeExpectancy a double.
     */
    public void setLifeExpectancy(double lifeExpectancy) {

        this.lifeExpectancy = lifeExpectancy;
    }

    /**
     * <p>Getter for the field <code>gnp</code>.</p>
     *
     * @return a double.
     */
    public double getGnp() {

        return gnp;
    }

    /**
     * <p>Setter for the field <code>gnp</code>.</p>
     *
     * @param gnp a int.
     */
    public void setGnp(int gnp) {

        this.gnp = gnp;
    }

    /**
     * <p>Getter for the field <code>gnpOld</code>.</p>
     *
     * @return a double.
     */
    public double getGnpOld() {

        return gnpOld;
    }

    /**
     * <p>Setter for the field <code>gnpOld</code>.</p>
     *
     * @param gnpOld a int.
     */
    public void setGnpOld(int gnpOld) {

        this.gnpOld = gnpOld;
    }

    /**
     * <p>Getter for the field <code>localName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLocalName() {

        return localName;
    }

    /**
     * <p>Setter for the field <code>localName</code>.</p>
     *
     * @param localName a {@link java.lang.String} object.
     */
    public void setLocalName(String localName) {

        this.localName = localName;
    }

    /**
     * <p>Getter for the field <code>governmentForm</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGovernmentForm() {

        return governmentForm;
    }

    /**
     * <p>Setter for the field <code>governmentForm</code>.</p>
     *
     * @param governmentForm a {@link java.lang.String} object.
     */
    public void setGovernmentForm(String governmentForm) {

        this.governmentForm = governmentForm;
    }

    /**
     * <p>Getter for the field <code>headOfState</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getHeadOfState() {

        return headOfState;
    }

    /**
     * <p>Setter for the field <code>headOfState</code>.</p>
     *
     * @param headOfState a {@link java.lang.String} object.
     */
    public void setHeadOfState(String headOfState) {

        this.headOfState = headOfState;
    }

    /**
     * <p>Getter for the field <code>capital</code>.</p>
     *
     * @return a int.
     */
    public int getCapital() {

        return capital;
    }

    /**
     * <p>Setter for the field <code>capital</code>.</p>
     *
     * @param capital a int.
     */
    public void setCapital(int capital) {

        this.capital = capital;
    }

    /**
     * <p>Getter for the field <code>code2</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCode2() {

        return code2;
    }

    /**
     * <p>Setter for the field <code>code2</code>.</p>
     *
     * @param code2 a {@link java.lang.String} object.
     */
    public void setCode2(String code2) {

        this.code2 = code2;
    }


    /** {@inheritDoc} */
    @Override
    public String toString() {

        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpOld=" + gnpOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", code2=" + code2 +
                '}';
    }
}
