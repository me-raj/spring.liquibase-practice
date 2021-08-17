package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.PreparedStatement;


/**
 * Example of a Java-based migration.
 */
public class V8_2__AnotherColumn extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
        try (PreparedStatement statement =
                     context
                             .getConnection()
                             .prepareStatement("ALTER TABLE practice_flyway \n" +
                                     " ADD Email varchar(255);")) {
            statement.execute();
        }
    }
}