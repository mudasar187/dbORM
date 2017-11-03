package Database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable(tableName = "Country")
public class Country implements Serializable {

    public static final String ID_FIELD = "Code";
    public static final String NAME_FIELD = "Name";
    public static final String CONTINENT_FIELD = "Continent";
    public static final String REGION_FIELD = "Region";
    public static final String SURFACEAREA_FIELD = "SurfaceArea";
    public static final String INDEPYEAR_FIELD = "IndepYear";
    public static final String POPULATION_FIELD = "Population";
    public static final String LIFEEXPECTANCY_FIELD = "LifeExpectancy";
    public static final String GNP_FIELD = "GNP";
    public static final String GNPOLD_FIELD = "GNPOld";
    public static final String LOCALNAME_FIELD = "LocalName";
    public static final String GOVERNEMENTFORM_FIELD = "GovernmentForm";
    public static final String HEADOFSTATE_FIELD = "HeadOfState";
    public static final String CAPITAL_FIELD = "Capital";
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


    public Country() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    public static String getIdField() { return ID_FIELD; }

    public static String getNameField() { return NAME_FIELD; }

    public static String getContinentField() { return CONTINENT_FIELD; }

    public static String getRegionField() { return REGION_FIELD; }

    public static String getSurfaceareaField() { return SURFACEAREA_FIELD; }

    public static String getIndepyearField() { return INDEPYEAR_FIELD; }

    public static String getPopulationField() { return POPULATION_FIELD; }

    public static String getLifeexpectancyField() { return LIFEEXPECTANCY_FIELD; }

    public static String getGnpField() { return GNP_FIELD; }

    public static String getGnpoldField() { return GNPOLD_FIELD; }

    public static String getLocalnameField() { return LOCALNAME_FIELD; }

    public static String getGovernementformField() { return GOVERNEMENTFORM_FIELD; }

    public static String getHeadofstateField() { return HEADOFSTATE_FIELD; }

    public static String getCapitalField() { return CAPITAL_FIELD; }

    public static String getCode2Field() { return CODE2_FIELD; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getContinent() { return continent; }

    public void setContinent(String continent) { this.continent = continent; }

    public String getRegion() { return region; }

    public void setRegion(String region) { this.region = region; }

    public double getSurfaceArea() { return surfaceArea; }

    public void setSurfaceArea(Double surfaceArea) { this.surfaceArea = surfaceArea; }

    public int getIndepYear() { return indepYear; }

    public void setIndepYear(int indepYear) { this.indepYear = indepYear; }

    public int getPopulation() { return population; }

    public void setPopulation(int population) { this.population = population; }

    public double getLifeExpectancy() { return lifeExpectancy; }

    public void setLifeExpectancy(double lifeExpectancy) { this.lifeExpectancy = lifeExpectancy; }

    public double getGnp() { return gnp; }

    public void setGnp(int gnp) { this.gnp = gnp; }

    public double getGnpOld() { return gnpOld; }

    public void setGnpOld(int gnpOld) { this.gnpOld = gnpOld; }

    public String getLocalName() { return localName; }

    public void setLocalName(String localName) { this.localName = localName; }

    public String getGovernmentForm() { return governmentForm; }

    public void setGovernmentForm(String governmentForm) { this.governmentForm = governmentForm; }

    public String getHeadOfState() { return headOfState; }

    public void setHeadOfState(String headOfState) { this.headOfState = headOfState; }

    public int getCapital() { return capital; }

    public void setCapital(int capital) { this.capital = capital; }

    public String getCode2() { return code2; }

    public void setCode2(String code2) { this.code2 = code2; }



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
