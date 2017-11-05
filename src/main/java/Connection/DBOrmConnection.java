package Connection;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

/**
 * <p>DBOrmConnection class.</p>
 *
 * @author mudasar
 * @version $Id: $Id
 */
public class DBOrmConnection {

    private String hostName;
    private String dbName;
    private String userName;
    private String passWord;
    private int port;
    private Properties props;
    private String url;

    /**
     * <p>Constructor for DBOrmConnection.</p>
     *
     * @param properties a {@link java.lang.String} object.
     */
    public DBOrmConnection(String properties) {

        try
        {
            props = new Properties();
            props.load(new FileInputStream(properties));
            userName = props.getProperty("userName");
            hostName = props.getProperty("hostName");
            dbName = props.getProperty("dbName");
            passWord = props.getProperty("passWord");
            port = Integer.parseInt(props.getProperty("port"));

        }
        catch (IOException e)
        {
            System.out.println("### Properties file not found ###");
        }
    }

    /**
     * <p>getConnection.</p>
     *
     * @return a {@link com.j256.ormlite.support.ConnectionSource} object.
     */
    public ConnectionSource getConnection()
    {
        url = "jdbc:mysql://" + hostName + ":" + port + "/" + dbName;
        ConnectionSource connectionSource = null;
        try
        {
            connectionSource = new JdbcConnectionSource(url, userName, passWord);
        }
        catch (SQLException e)
        {
            System.out.println("### Connection error ###");
        }
        return connectionSource;
    }
}
