/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.jdbc.test;

import br.edu.ifpe.jdbc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tiago
 */
public class TestaConexao {
    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta");
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
