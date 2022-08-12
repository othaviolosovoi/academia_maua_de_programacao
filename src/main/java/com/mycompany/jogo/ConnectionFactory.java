/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**`
 *
 * @author mateu
 */
import java.sql.*;

public class ConnectionFactory {
    
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "AcademiaMauaDeProgramacao";
    private static String user = "root";
    private static String password = "2Q2weC%^iMGh%JauT7jBWTG2V&9mcSzF";
    
    public static Connection getConnection() throws Exception{
        //jdbc:mysql://localhost:3306/banco_de_dados?useTimezone=true%serverTimezone=UTC
        String stringConexao = String.format(
            "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host,
                port,
                db
        );
        Connection conexao = DriverManager.getConnection(
        stringConexao,
        user,
        password
        );
        return conexao;
    }
}
