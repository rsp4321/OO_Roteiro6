/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {
    
    private String cpf;

    /**
     * Construtor sem parâmetros para utilizar com o método "preencher()"
     */
    public Cliente() {
        super();
        this.cpf = "12345678987";   // Provavelmente, deve ser inválido
    }

    public Cliente(String cpf, String nome, char Sexo, int idade) {
        super(nome, Sexo, idade);
        this.cpf = cpf;
    }

    @Override
    public void imprime() {
//        super.imprime(); //To change body of generated methods, choose Tools | Templates.
        
        //        System.out.println("**** Cadastro da pessoa ****");
        String texto = "**** Cadastro da pessoa ****\n";
        
//        System.out.println("Nome: " + this.getNome());
        texto += "Nome: " + this.getNome();
        
//        System.out.println("Sexo: " + this.getSexo());
        texto += "Sexo: " + this.getSexo();
        
//        System.out.println("Idade: " + this.getIdade());
        texto += "Idade: " + this.getIdade();
        
        texto += "CPF: " + this.getCpf();
        
//        System.out.println("**** Fim da exibição ****");
        texto += "**** Fim da exibição ****";
        
        System.out.println(texto);
    }

    @Override
    public void preencher() {
        super.preencher(); //To change body of generated methods, choose Tools | Templates.
        
        Scanner sc = new Scanner(System.in);
        
    }
    
    

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
