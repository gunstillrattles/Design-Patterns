package kz.narxoz.patterns.singleton;

import kz.narxoz.patterns.singleton.Database;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database database = Database.getInstance();
        Scanner scan = new Scanner(System.in);
        int whichQuery;
        whichQuery = scan.nextInt();
        if (whichQuery == 1) {
            String sql = "INSERT INTO USERS (NAME, AGE) " +
                    "VALUES ('John', 20)";
            database.query(sql);
        } else if (whichQuery == 2) {
            String sql = "UPDATE USERS set AGE = 25000 where ID=1;";
            database.query(sql);
        } else if (whichQuery == 3) {
            String sql = "DELETE from USERS where ID = 2;";
            database.query(sql);
        }
        else if (whichQuery == 4) {
            System.out.println(database.select());
        }
        else if (whichQuery == 5) {
            database.close();
        }
    }
}