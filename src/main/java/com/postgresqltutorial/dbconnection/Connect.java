/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.postgresqltutorial.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ezekielkouassi
 */
public class Connect {

    private final String url = "jdbc:postgresql://localhost/week8_db";
    private final String user = "postgres";
    private final String password = "admin";

    /**
     * Connect to postgresql database
     *
     *
     * @return Connection Object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("connection réussie");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;

    }

}
