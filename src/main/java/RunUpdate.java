import DBHandler.Read;
import DBHandler.Update;

/**
 * <p>RunUpdate class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class RunUpdate {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {

        Update update = new Update();
        Read read = new Read();

        System.out.println("### Print 5 first rows in country table\n");
        read.print5FirstRowsInCountry();

        System.out.println("\n### Now im going to update a row in country ...");
        System.out.println("### Changing country name 'Aruba' to 'Abura' ...");
        update.updateCountryNameByCode("ABW", "Abura");

        System.out.println("\n### Look at the row now ...");
        read.print5FirstRowsInCountry();
    }
}
