package classes;

public class Engenheiro extends Funcionario{
    
    public Engenheiro(){
        super();       
    }
    
    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario){
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
    }
    
    public String imprime(){
        String str = super.imprime() + "\nBonificação: " 
                    + getBonificacao((int) this.horasTrabalho, this.salario);
        return str;
    }
    
    public double getBonificacao(int horasTrabalho, float salario){
        double bonificacao = super.getBonificacao(horasTrabalho, salario, 8);
        return bonificacao;
    }
}
