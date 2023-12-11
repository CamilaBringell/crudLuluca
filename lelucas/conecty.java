package com.lelucas.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camila Bringel
 */

import java.sql.*;

public class Conecty {
    public static Connection conector (){
           java.sql.Connection conexao = null;
           
           String drive = "com.mysql.jdbc.Drive";
           String url = "jdbc:mysql:localhost:3306/leluca";
           String user = "root";
           String senha = "mila0000";
           
           try {
            Class.forName(drive);
            conexao = DriverManager.getConnection(url,user,senha);
            return conexao;
            
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
           
        }
           
        return null;
    }
   
    
}
