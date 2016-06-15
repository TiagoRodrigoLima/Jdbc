/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.jdbc.dao;

import br.edu.ifpe.jdbc.factory.ConnectionFactory;
import br.edu.ifpe.jdbc.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago
 */
public class AlunoDao {

    // A conexão com o banco de dados
    private Connection connection;

    public AlunoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    /**
     * 
     * @param aluno 
     */
    public void adicionar(Aluno aluno) {
        String sql = "INSERT INTO Alunos "
                + "(id, matricula, nome, coeficienteRendimento, aprovado) "
                + "VALUES (?,?,?,?,?)";

        try {
            // PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Seta os valores com os dados do objeto
            stmt.setInt(1, aluno.getId());
            stmt.setString(2, aluno.getMatricula());
            stmt.setString(3, aluno.getNome());
            stmt.setDouble(4, aluno.getCoeficienteRendimento());
            stmt.setBoolean(5, aluno.isAprovado());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    /**
     * 
     * @return 
     */
    public List<Aluno> listar() {
        try {
            List<Aluno> alunos = new ArrayList<Aluno>();
            String sql = "SELECT * FROM Alunos";
            PreparedStatement stmt = this.connection.
                    prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Cria o objeto Aluno
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCoeficienteRendimento(rs.getDouble("coeficienteRendimento"));
                aluno.setAprovado(rs.getBoolean("aprovado"));

                // Adiciona o objeto à lista
                alunos.add(aluno);
            }

            rs.close();
            stmt.close();
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * 
     * @param aluno 
     */
    public void alterar(Aluno aluno) {
        String sql = "UPDATE Alunos SET " +
                "matricula=?, nome=?, " +
                "coeficienteRendimento=?, aprovado=?" +
                " WHERE id=?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setDouble(3, aluno.getCoeficienteRendimento());
            stmt.setBoolean(4, aluno.isAprovado());
            stmt.setInt(5, aluno.getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    /**
     * 
     * @param aluno 
     */
    public void remover(Aluno aluno) {
        try {
            String sql = "DELETE FROM Alunos WHERE id=?";
            PreparedStatement stmt = connection.
                        prepareStatement(sql);
            
            stmt.setInt(1, aluno.getId());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
