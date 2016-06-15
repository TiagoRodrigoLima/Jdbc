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
public class TestaRemover {
    public static void main(String[] args) {
        // Cria o objeto aluno
        Aluno aluno = new Aluno();
        aluno.setId(1);
        
        // Cria o objeto dao
        AlunoDao dao = new AlunoDao();
        dao.remover(aluno);
        
        System.out.println("Aluno removido!");
    }
}
