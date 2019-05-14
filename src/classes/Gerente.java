package classes;

public class Gerente extends Funcionario {

    private String senha;
    private int quantPessoasGerenciadas;
    private final static float ALIQUOTA_BONIFICACAO = 10;  // Fixando a alíquota de bonificação para clarear

    public Gerente() {
        super();
        this.senha = "-";
        this.quantPessoasGerenciadas = -1;
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario, String senha, int quantPessoasGerenciadas) {
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
        this.senha = senha;
        this.quantPessoasGerenciadas = quantPessoasGerenciadas;
    }

    public String imprime() {

        String str = super.imprime()
                + "\nSenha: " + this.senha
                + "\nNº de pessoas gerenciadas: " + this.quantPessoasGerenciadas
                + "\nBonificação: "
//                + getBonificacao((int) this.horasTrabalho, this.salario);
                + this.getBonificacao();

        return str;
    }

//    public double getBonificacao(int horasTrabalho, float salario) {
//        double bonificacao = super.getBonificacao(horasTrabalho, salario, 10);
//        return bonificacao;
//    }

    public double getBonificacao() {

//        double bonificacao = super.getBonificacao(horasTrabalho, salario, 10);

    double bonificacao = 0;
        
//        int horasExtras = horasTrabalho - 44;
        float horasExtras = this.getHorasTrabalho() - Funcionario.CH_MAXIMA_SEMANAL_CLT; // Tive que colocar como float pois o código está todo implementado em float
        
//        taxa = taxa / 100;
        float taxa = Gerente.ALIQUOTA_BONIFICACAO / 100;
        
        
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

    public int getQuantPessoasGerenciadas() {
        return quantPessoasGerenciadas;
    }

    public void setQuantPessoasGerenciadas(int quantPessoasGerenciadas) {
        this.quantPessoasGerenciadas = quantPessoasGerenciadas;
    }
}
