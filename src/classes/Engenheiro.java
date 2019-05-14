package classes;

public class Engenheiro extends Funcionario {

    private final static float ALIQUOTA_BONIFICACAO = 8;  // Fixando a alíquota de bonificação para clarear

    public Engenheiro() {
        super();
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario) {
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
    }

    public String imprime() {
        
        String str = super.imprime() + "\nBonificação: "
//                + getBonificacao((int) this.horasTrabalho, this.salario);
                + this.getBonificacao();
        
        return str;
    }

    public double getBonificacao(int horasTrabalho, float salario) {
        double bonificacao = super.getBonificacao(horasTrabalho, salario, 8);
        return bonificacao;
    }

    public double getBonificacao() {

        double bonificacao = 0;

//        int horasExtras = horasTrabalho - 44;
        float horasExtras = this.getHorasTrabalho() - Funcionario.CH_MAXIMA_SEMANAL_CLT; // Tive que colocar como float pois o código está todo implementado em float

//        taxa = taxa / 100;
//        float taxa = Funcionario.ALIQUOTA_BONIFICACAO / 100;
        float taxa = Engenheiro.ALIQUOTA_BONIFICACAO / 100;

        if (horasExtras > 0) {
            bonificacao = salario * taxa * horasExtras;
        } else {
            bonificacao = 0;
        }

        return bonificacao;
    }
}
