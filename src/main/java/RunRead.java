import DBHandler.Read;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * <p>RunRead class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class RunRead {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     * @throws java.lang.InterruptedException if any.
     */
    public static void main(String[] args) throws InterruptedException {

        Read read = new Read();

        System.out.println("### Print 5 first rows in country ...\n");
        read.print5FirstRowsInCountry();

        System.out.println("\n\n### Be patient.. going to print all rows in city");

        System.out.println("\n\n### Now printing all rows in City");
        System.out.println("### Taking a little while ... Made a timer so you can read the rows above first :)");
        TimeUnit.MILLISECONDS.sleep(10000);
        read.printEverythingInCity();
    }
}
