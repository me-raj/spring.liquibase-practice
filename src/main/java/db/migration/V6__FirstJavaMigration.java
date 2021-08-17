package db.migration;


import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.PreparedStatement;

/**
 * Example of a Java-based migration.
 */
public class V6__FirstJavaMigration extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
        try (PreparedStatement statement =
                     context
                             .getConnection()
                             .prepareStatement("INSERT INTO practice_flyway (ID,NAME) VALUES (3,'INSERTED_FROM_JAVA')")) {
            statement.execute();
        }
    }
}