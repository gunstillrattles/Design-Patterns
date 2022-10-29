package kz.narxoz.patterns.adapter;
import java.sql.*;
public class DBReader {
    private static DBReader dbReader = null;

    private Connection c = null;
    private Statement stmt = null;

    private DBReader() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/testdb",
                        "postgres", "Xv6Vv12c3c");
    }

    public void getUserByName(String name) throws SQLException {
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM ADAPTER_USERS WHERE firstname = '" + name + "';" );
        while ( rs.next() ) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String nickname = rs.getString("nickname");
            int age  = rs.getInt("age");
            System.out.println( "ID = " + id );
            System.out.println( "FIRST NAME = " + firstname );
            System.out.println( "LAST NAME = " + lastname );
            System.out.println( "NICK NAME = " + nickname );
            System.out.println( "AGE = " + age );
            System.out.println();
        }
        rs.close();
        stmt.close();
    }

    public void getUserById(int findId) throws SQLException {
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ADAPTER_USERS WHERE id = '" + findId + "';");
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String nickname = rs.getString("nickname");
            int age = rs.getInt("age");
            System.out.println("ID = " + id);
            System.out.println("FIRST NAME = " + firstname);
            System.out.println("LAST NAME = " + lastname);
            System.out.println("NICK NAME = " + nickname);
            System.out.println("AGE = " + age);
            System.out.println();
        }
        rs.close();
        stmt.close();
    }

    public static DBReader getInstance() throws SQLException, ClassNotFoundException {
        if (dbReader == null) {
            dbReader = new DBReader();
        }
        return dbReader;
    }
}