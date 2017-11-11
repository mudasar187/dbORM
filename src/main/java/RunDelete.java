import DBHandler.Delete;

/**
 * <p>RunDelete class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class RunDelete {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {

        Delete delete = new Delete();

        System.out.println("### Deleting all rows in all tables matching 'ABW' ...\n");
        delete.getCityByID("ABW");
        delete.getCountryByCode("ABW");
        delete.getCountryLanguageByCountryCode("ABW");


        // Remove the uncomment at the 4 lines below to put the rows back again to tables
//        System.out.println("\n\n\nInserting them back to all tables ...");
//        delete.insertIntoCity();
//        delete.insertIntoCountry();
//        delete.insertIntoCountryLanguage();
    }
}
