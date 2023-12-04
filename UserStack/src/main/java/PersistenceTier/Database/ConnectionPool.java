package PersistenceTier.Database;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;

import javax.sql.DataSource;

public class ConnectionPool {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://snuffleupagus.db.elephantsql.com:5432/mljxbazt");
        config.setUsername("mljxbazt");
        config.setPassword("DoWu6suEBlN2FXWalzDbYPUTAAFrkpFK");
        config.setMaximumPoolSize(2);
        config.setConnectionInitSql("set search_path to users");

        dataSource = new HikariDataSource(config);
    }
    public static DataSource getDataSource() {
        return dataSource;
    }
}
