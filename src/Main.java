import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/// Testare
public class Main {
    public static void main(String[] args) {
      /// creatingTableArt("articole");
      ///  creatingTableCat("categories");
      ///  creatingTableProd("producator");
      ///  creatingTableLogin("login");
      ///  insertDataArt("articole");
      ///  insertDataCat("categories");
      ///  insertDataProd("producator");
      ///  insertDataLogin("login");
      ///  deleteDataArt("articole");
      ///  deleteDataCat("categories");
      ///  deleteDataProd("producator");
      ///  deleteDataLogin("login");
      /// editDataArt("articole");
      /// editDataCat("categories");
      /// editDataProd("producator");
    }
    public static void creatingTableArt(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name + "(\n"
                    + " id_articol integer PRIMARY KEY AUTOINCREMENT,\n"
                    + " id_categorie integer NOT NULL,\n"
                    + " id_producator integer NOT NULL,\n"  // Adăugăm coloana pentru cheia străină
                    + " descriere text NOT NULL,\n"
                    + " stoc int ,\n"
                    + " pret int,\n"
                    + " nume_producator text NOT NULL,\n"
                    + " FOREIGN KEY (id_categorie) REFERENCES categories(id_categorie),\n"
                    + " FOREIGN KEY (id_producator) REFERENCES producator(id_producator)\n"  // Cheie străină
                    + ");";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Table created successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void creatingTableCat(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name + "(\n"
                    + " id_categorie integer PRIMARY KEY AUTOINCREMENT,\n"
                    + " denumire text NOT NULL\n"
                    + ");";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Table created successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void creatingTableProd(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name + "(\n"
                    + " id_producator integer PRIMARY KEY AUTOINCREMENT,\n"
                    + " nume text NOT NULL,\n"
                    + " email text NOT NULL,\n"
                    + " varsta integer NOT NULL\n"
                    + ");";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Table created successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void creatingTableLogin(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name + "(\n"
                    + " email text PRIMARY KEY,\n"
                    + " parola text NOT NULL\n"
                    + ");";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Table created successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void insertDataArt(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "INSERT INTO " + table_name + " (id_categorie, id_producator, descriere, stoc, pret, nume_producator) VALUES (1, 1, 'Telefon', 10, 1000,'Gerald');";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Data inserted successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void insertDataCat(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "INSERT INTO " + table_name + " (denumire) VALUES ('Telefoane');";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Data inserted successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void insertDataProd(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "INSERT INTO " + table_name + " (nume, email, varsta) VALUES ('Gerald', 'gerald25@gmail.com', 20);";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data inserted successfully.");
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void insertDataLogin(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");

            // Create a statement
            String sql = "INSERT INTO " + table_name + " (email, parola) VALUES ('gerald25@gmail.com', '1234');";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data inserted successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void deleteDataArt(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "DELETE FROM " + table_name;
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data deleted successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void deleteDataCat(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "DELETE FROM " + table_name;
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data deleted successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void deleteDataProd(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "DELETE FROM " + table_name + " WHERE id_producator = 1;";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data deleted successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void deleteDataLogin(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "DELETE FROM " + table_name;
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data deleted successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void editDataArt(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "UPDATE " + table_name + " SET stoc = 20 WHERE id_articol = 10;";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data edited successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void editDataCat(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "UPDATE " + table_name + " SET denumire = 'Baterie' WHERE id_categorie = 1;";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data edited successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void editDataProd(String table_name) {
        // SQLite's connection string
        String url = "jdbc:sqlite:/C:/MyStore/ProiectP3/identifier.sqlite";
        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
            // Create a statement
            String sql = "UPDATE " + table_name + " SET nume = 'Andrei' WHERE id_producator = 1;";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Data edited successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
