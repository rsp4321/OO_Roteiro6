package classes;

public class Secretario extends Funcionario {
    
    public Secretario(){
        super();
    }
    
    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario){
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
    }
    
    public double getBonificacao(int horasTrabalho, float salario){
        double bonificacao = super.getBonificacao(horasTrabalho, salario, 5);
        return bonificacao;
    }
    
    public String imprime(){
        String str = super.imprime() + 
                "\nBonificação: " 
                + getBonificacao((int) this.horasTrabalho, this.salario);
        return str;
    } 
}
