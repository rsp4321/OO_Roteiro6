/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {
    
    private int horasTrabalho;
    private float salario;
    private float bonificacao;
    private final static float ALIQUOTA_BONIFICACAO = 5;  // Fixando a alíquota de bonificação para clarear

    public Funcionario(int horasTrabalho, float salario, String nome, char Sexo, int idade) {
        super(nome, Sexo, idade);
        this.horasTrabalho = horasTrabalho;
        this.salario = salario;
    }

    /**
     * @return the horasTrabalho
     */
    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    /**
     * @param horasTrabalho the horasTrabalho to set
     */
    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
