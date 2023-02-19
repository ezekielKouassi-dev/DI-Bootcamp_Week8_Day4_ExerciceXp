/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.postgresqltutorial.exercice1;

import com.postgresqltutorial.dbconnection.Connect;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ezekielkouassi
 */
public class Create {
    public static boolean create() {
        boolean result = false;
        String sql = "CREATE TABLE COMPANY ( " +
                "ID INT PRIMARY KEY NOT NULL, " +
                "NAME TEXT NOT NULL, " +
                "AGE INT NOT NULL, " +
                "ADDRESS CHAR(50), " +
                "SALARY REAL " +
                ")";
        
        try {
            // instantiation de la classe de connection à la base
            Connect OConnect = new Connect();
            
            // création d'un objet statement pour la requête
            Statement stmt = OConnect.connect().createStatement();
            
            // excution de la requête
            result = stmt.execute(sql);
            System.out.println("création de la table réussite");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return result;
    }
}
