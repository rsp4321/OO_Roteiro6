/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Scanner;

/**
 * Classe para abstrair o cadastro de uma pessoa
 * Ela foi definida abastrata pois não faz sentido na regra de negócios dada.
 * @author aluno
 */
public abstract class Pessoa {
    
    private String nome;
    private char sexo;
    private int idade;

    /**
     * Construtor criado para compatibilizar com a rotina "preencher()"
     */
    public Pessoa() {
        this.nome = "";
        this.sexo = 'M';
        this.idade = 0;
    }
    
    /**
     * Construtor completo passando os parâmetros.
     * @param nome
     * @param Sexo
     * @param idade 
     */
    public Pessoa(String nome, char Sexo, int idade) {
        this.nome = nome;
        this.sexo = Sexo;
        this.idade = idade;
    }
    
    public void imprime() { // Deixei público pois poderá ser utilizado em outras classes
        
//        System.out.println("**** Cadastro da pessoa ****");
        String texto = "**** Cadastro da pessoa ****\n";
        
//        System.out.println("Nome: " + this.getNome());
        texto += "Nome: " + this.getNome();
        
//        System.out.println("Sexo: " + this.getSexo());
        texto += "Sexo: " + this.getSexo();
        
//        System.out.println("Idade: " + this.getIdade());
        texto += "Idade: " + this.getIdade();
        
//        System.out.println("**** Fim da exibição ****");
        texto += "**** Fim da exibição ****";
        
        System.out.println(texto);
    }
    
    public void preencher() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o nome completo: ");
        String nome = sc.next();
        this.setNome(nome);
        
        System.out.println("Entre com o sexo (M-F): ");
        char sexo = sc.next().charAt(0);
        this.setSexo(sexo);
        
        System.out.println("Entre com a idade: ");
        int idade = sc.nextInt();
        this.setIdade(idade);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the Sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(char Sexo) {
        this.sexo = Sexo;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
