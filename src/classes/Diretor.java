package classes;

public class Diretor extends Funcionario {
    private String senha;
    
    private final static float ALIQUOTA_BONIFICACAO = 15;  // Fixando a alíquota de bonificação para clarear
    
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
//                + getBonificacao((int) this.horasTrabalho, this.salario);
                + this.getBonificacao();
                
        return str;
    }
    
//    public double getBonificacao(int horasTrabalho, float salario){
//        double bonificacao = super.getBonificacao(horasTrabalho, salario, 15);
//        return bonificacao;
//    }
    
    @Override
    public double getBonificacao() {
        
        double bonificacao = 0;
        
//        int horasExtras = horasTrabalho - 44;
        float horasExtras = this.getHorasTrabalho() - Funcionario.CH_MAXIMA_SEMANAL_CLT; // Tive que colocar como float pois o código está todo implementado em float
        
//        taxa = taxa / 100;
//        float taxa = Funcionario.ALIQUOTA_BONIFICACAO / 100;
        float taxa = Diretor.ALIQUOTA_BONIFICACAO / 100;
        
        
        if (horasExtras > 0) {
            bonificacao = salario * taxa * horasExtras;
        } else {
            bonificacao = 0;
        }

        return bonificacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
