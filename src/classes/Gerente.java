package classes;

public class Gerente extends Funcionario {
    private String senha;
    private int quantPessoasGerenciadas;
    
    public Gerente(){
        super();
        this.senha = "-";
        this.quantPessoasGerenciadas = -1;
    }
    
    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario, String senha, int quantPessoasGerenciadas){
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
        this.senha = senha ;
        this.quantPessoasGerenciadas= quantPessoasGerenciadas;
    }
    
    public String imprime(){
        String str = super.imprime() + 
                "\nSenha: " + this.senha +
                "\nNº de pessoas gerenciadas: " + this.quantPessoasGerenciadas +
                "\nBonificação: " 
                + getBonificacao((int) this.horasTrabalho, this.salario);
        return str;
    }
    
    public double getBonificacao(int horasTrabalho, float salario){
        double bonificacao = super.getBonificacao(horasTrabalho, salario, 10);
        return bonificacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }  
    
    public int getQuantPessoasGerenciadas() {
        return quantPessoasGerenciadas;
    }

    public void setQuantPessoasGerenciadas(int quantPessoasGerenciadas) {
        this.quantPessoasGerenciadas = quantPessoasGerenciadas;
    }
}
