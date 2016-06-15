/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.jdbc.model;

/**
 *
 * @author tiago
 */
public class Aluno {
    private int id;
    private String matricula;
    private String nome;
    private double coeficienteRendimento;
    private boolean aprovado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteRendimento() {
        return coeficienteRendimento;
    }

    public void setCoeficienteRendimento(double coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
