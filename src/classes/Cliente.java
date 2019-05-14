package classes;

import classes.Pessoa;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(){
        super();
        this.cpf = "";
    }
    
    public String imprime(){
        String str = super.imprime() + "\nCpf: " + this.cpf;
        
        return str;
    }
    
    public void preencher(String nome, char sexo, int idade, String cpf){
        super.preencher(nome, sexo, idade);
        this.cpf = cpf;    
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
}
