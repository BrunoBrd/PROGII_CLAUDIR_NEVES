/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho.av2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Claudir
 */
public class Conexao {

    private static String URL = "jdbc:postgresql://localhost:5432/trab_prog_ii";
    private static String USUARIO = "postgres";
    private static String SENHA = "admin";
    private static String status;

    public static Connection criarConexao() {
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conexao != null) {
            status = "Conectado";
        } else {
            status = "Não conectado";
        }

        return conexao;
    }

    public String getStatus() {
        return status;
    }
}
