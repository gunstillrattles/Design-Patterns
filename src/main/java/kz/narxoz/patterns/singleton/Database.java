package kz.narxoz.patterns.singleton;
import java.sql.*;
public class Database {
    private static Database database = null;

    private Connection c = null;
    private Statement stmt = null;

    private Database() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/testdb",
                        "postgres", "Xv6Vv12c3c");
    }

    public void query(String sql) throws SQLException {
        stmt = c.createStatement();
        stmt.execute(sql);
        stmt.close();
    }

    public String select() throws SQLException {
        stmt = c.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM users;");
        StringBuilder str = new StringBuilder("");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            str.append("ID = " + id);
            str.append("NAME = " + name);
            str.append("AGE = " + age);
        }
        return str.toString();
    }


    public static Database getInstance() throws SQLException, ClassNotFoundException {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public void close() throws SQLException {
        c.close();
        database = null;
    }
}