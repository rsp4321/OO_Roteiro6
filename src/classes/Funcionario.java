package classes;

abstract class Funcionario extends Pessoa {

    protected float horasTrabalho;
    protected float salario;
    private final static float ALIQUOTA_BONIFICACAO = 5;  // Fixando a alíquota de bonificação para clarear
    protected final static int CH_MAXIMA_SEMANAL_CLT = 44;      // Fixando a carga horária máxima semanal

    public Funcionario() {
        super();
        this.horasTrabalho = -1;
        this.salario = -1;
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario) {
        super.preencher(nome, sexo, idade);
        this.horasTrabalho = horasTrabalho;
        this.salario = salario;
    }

    @Override
    public String imprime() {
        String str = super.imprime()
                + "\nHoras Trabalhadas: " + this.horasTrabalho + "\n"
                + "Salário: " + this.salario;

        return str;
    }

    protected double getBonificacao(int horasTrabalho, float salario, float taxa) {
        double bonificacao = 0;
        int horasExtras = horasTrabalho - 44;
        taxa = taxa / 100;
        if (horasExtras > 0) {
            bonificacao = salario * taxa * horasExtras;
        } else {
            bonificacao = 0;
        }

        return bonificacao;
    }
    
    /**
     * Método para calcular a bonificação utilizando a taxa fixa para funcionários tradicionais (5 %).
     * @return 
     */
//    protected double getBonificacao(int horasTrabalho, float salario, float taxa) {
    public double getBonificacao() {
        
        double bonificacao = 0;
        
//        int horasExtras = horasTrabalho - 44;
        float horasExtras = this.getHorasTrabalho() - Funcionario.CH_MAXIMA_SEMANAL_CLT; // Tive que colocar como float pois o código está todo implementado em float
        
//        taxa = taxa / 100;
        float taxa = Funcionario.ALIQUOTA_BONIFICACAO / 100;
        
        
        if (horasExtras > 0) {
            bonificacao = salario * taxa * horasExtras;
        } else {
            bonificacao = 0;
        }

        return bonificacao;
    }

    public float getHorasTrabalho() {
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
