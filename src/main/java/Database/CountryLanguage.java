package Database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * <p>CountryLanguage class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
@DatabaseTable(tableName = "CountryLanguage")
public class CountryLanguage implements Serializable {

    /** Constant <code>COUNTRYCODE_FIELD="CountryCode"</code> */
    public static final String COUNTRYCODE_FIELD = "CountryCode";
    /** Constant <code>LANGUAGE_FIELD="Language"</code> */
    public static final String LANGUAGE_FIELD = "Language";
    /** Constant <code>ISOFFICIAL_FIELD="IsOfficial"</code> */
    public static final String ISOFFICIAL_FIELD = "IsOfficial";
    /** Constant <code>PERCENTAGE_FIELD="Percentage"</code> */
    public static final String PERCENTAGE_FIELD = "Percentage";

    @DatabaseField(columnName = COUNTRYCODE_FIELD)
    private String countryCode;

    @DatabaseField(columnName = LANGUAGE_FIELD)
    private String language;

    @DatabaseField(columnName = ISOFFICIAL_FIELD)
    private char isOfficial;

    @DatabaseField(columnName = PERCENTAGE_FIELD)
    private double percentage;

    /**
     * <p>Constructor for CountryLanguage.</p>
     */
    public CountryLanguage() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    /**
     * <p>Constructor for CountryLanguage.</p>
     *
     * @param countryCode a {@link java.lang.String} object.
     * @param language a {@link java.lang.String} object.
     * @param isOfficial a char.
     * @param percentage a double.
     */
    public CountryLanguage(String countryCode, String language, char isOfficial, double percentage) {

        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
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
     * <p>getLanugageField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getLanugageField() {

        return LANGUAGE_FIELD;
    }

    /**
     * <p>getIsofficialField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getIsofficialField() {

        return ISOFFICIAL_FIELD;
    }

    /**
     * <p>getPercentageField.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getPercentageField() {

        return PERCENTAGE_FIELD;
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
     * <p>Getter for the field <code>language</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLanguage() {

        return language;
    }

    /**
     * <p>Setter for the field <code>language</code>.</p>
     *
     * @param language a {@link java.lang.String} object.
     */
    public void setLanguage(String language) {

        this.language = language;
    }

    /**
     * <p>Getter for the field <code>isOfficial</code>.</p>
     *
     * @return a char.
     */
    public char getIsOfficial() {

        return isOfficial;
    }

    /**
     * <p>Setter for the field <code>isOfficial</code>.</p>
     *
     * @param isOfficial a char.
     */
    public void setIsOfficial(char isOfficial) {

        this.isOfficial = isOfficial;
    }

    /**
     * <p>Getter for the field <code>percentage</code>.</p>
     *
     * @return a double.
     */
    public double getPercentage() {

        return percentage;
    }

    /**
     * <p>Setter for the field <code>percentage</code>.</p>
     *
     * @param percentage a double.
     */
    public void setPercentage(double percentage) {

        this.percentage = percentage;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {

        return "CountryLanguage{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }
}
