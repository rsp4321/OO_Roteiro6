package classes;

public class Diretor extends Funcionario {
    private String senha;
    
    public Diretor(){
        super();
        this.senha = "-";
    }
    
    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario, String senha){
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
        this.senha = senha;
    }
    
    public String imprime(){
        String str = super.imprime() + 
                "\nSenha: " + this.senha +
                "\nBonificação: " 
                + getBonificacao((int) this.horasTrabalho, this.salario);
        return str;
    }
    
    public double getBonificacao(int horasTrabalho, float salario){
        double bonificacao = super.getBonificacao(horasTrabalho, salario, 15);
        return bonificacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
