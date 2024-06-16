package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionfactory {

    public Connection getConnection() {
        System.out.println("Conectando");

        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=Agenda;"
                        + "user=sa;"
                        + "password=adm;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=5;";

        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("foi");
            return DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }}
