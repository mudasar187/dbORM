package Database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable(tableName = "CountryLanguage")
public class CountryLanguage implements Serializable{

    public static final String COUNTRYCODE_FIELD = "CountryCode";
    public static final String LANGUAGE_FIELD = "Language";
    public static final String ISOFFICIAL_FIELD = "IsOfficial";
    public static final String PERCENTAGE_FIELD = "Percentage";

    @DatabaseField(columnName = COUNTRYCODE_FIELD)
    private String countryCode;

    @DatabaseField(columnName = LANGUAGE_FIELD)
    private String language;

    @DatabaseField(columnName = ISOFFICIAL_FIELD)
    private char isOfficial;

    @DatabaseField(columnName = PERCENTAGE_FIELD)
    private double percentage;

    public CountryLanguage() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    public CountryLanguage(String countryCode, String language, char isOfficial, double percentage) {

        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public static String getCountrycodeField() { return COUNTRYCODE_FIELD; }

    public static String getLanugageField() { return LANGUAGE_FIELD; }

    public static String getIsofficialField() { return ISOFFICIAL_FIELD; }

    public static String getPercentageField() { return PERCENTAGE_FIELD; }

    public String getCountryCode() { return countryCode; }

    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public char getIsOfficial() { return isOfficial; }

    public void setIsOfficial(char isOfficial) { this.isOfficial = isOfficial; }

    public double getPercentage() { return percentage; }

    public void setPercentage(double percentage) { this.percentage = percentage; }

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
