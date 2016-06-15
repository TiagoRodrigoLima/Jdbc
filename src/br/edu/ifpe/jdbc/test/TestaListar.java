/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.jdbc.test;

import br.edu.ifpe.jdbc.dao.AlunoDao;
import br.edu.ifpe.jdbc.model.Aluno;
import java.util.List;

/**
 *
 * @author tiago
 */
public class TestaListar {
    public static void main(String[] args) {
        // Cria um dao
        AlunoDao dao = new AlunoDao();
        
        // Lista os contatos com o dao
        List<Aluno> alunos = dao.listar();
        
        // Itera na lista e imprime as informações
        for (Aluno a : alunos) {
            System.out.println("ID: " + a.getId());
            System.out.println("Matrícula: " + a.getMatricula());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Coeficiente Rendimento: " + a.getCoeficienteRendimento());
            System.out.println("Aprovado: " + a.isAprovado());
            System.out.println("");
        }
    }
            
}
