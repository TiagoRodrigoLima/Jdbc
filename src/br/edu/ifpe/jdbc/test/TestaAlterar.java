/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.jdbc.test;

import br.edu.ifpe.jdbc.dao.AlunoDao;
import br.edu.ifpe.jdbc.model.Aluno;

/**
 *
 * @author tiago
 */
public class TestaAlterar {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setId(1);
        aluno.setMatricula("20142Y6-RC0100");
        aluno.setNome("Tiago Lima");
        aluno.setCoeficienteRendimento(10.0);
        aluno.setAprovado(true);
        
        // Grave nessa conexão
        AlunoDao dao = new AlunoDao();
        
        // Grava no banco
        dao.alterar(aluno);
        
        System.out.println("Aluno alterado!");
    }
}
