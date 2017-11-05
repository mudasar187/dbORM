import DBHandler.Create;
import DBHandler.Read;
import Database.City;

/**
 * <p>RunCreate class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class RunCreate {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {

        Create create = new Create();
        Read read = new Read();

        System.out.println("### Print 5 last rows in city table ...\n");
        read.print5LastElements();
        System.out.println("\n### Look at the last id ...\n\n");

        System.out.println("### Now i am inserting a new row to city table ...\n");
        create.insertToCity(new City("Hasle", "NOR", "Oslo", 500));

        System.out.println("\n### Print the 5 last elements in city table ...");
        read.print5LastElements();
        System.out.println("\n### Look at the last row index ...");
    }
}
