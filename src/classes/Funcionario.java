package classes;

abstract class Funcionario extends Pessoa{  
    protected float horasTrabalho;
    protected float salario;
    
    public Funcionario(){
        super();
        this.horasTrabalho = -1;
        this.salario = -1;       
    }
    
    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario){
        super.preencher(nome, sexo, idade);
        this.horasTrabalho = horasTrabalho;
        this.salario = salario;
    }
    
    public String imprime(){
        String str = super.imprime() 
              + "\nHoras Trabalhadas: " + this.horasTrabalho + "\n"
              + "Salário: " + this.salario;
        
        return str;
    }
    
    protected double getBonificacao(int horasTrabalho, float salario, float taxa){
        double bonificacao = 0;
        int horasExtras = horasTrabalho - 44;
        taxa = taxa/100;
        if(horasExtras > 0){
            bonificacao = salario*taxa*horasExtras;
        }else{
            bonificacao = 0;
        }
        
        return bonificacao;
    }
    
    public float getHorasTrabalho(){
        return horasTrabalho;
    }

    public void setHorasTrabalho(float horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}