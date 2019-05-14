package classes;

abstract class Pessoa {
    protected String nome;
    protected char sexo;
    protected int idade;
    
    public Pessoa(){
        this.nome = "";
        this.sexo = '-';
        this.idade = -1;
    }
    
    public String imprime(){
        String str = "Nome: " + this.nome + "\n"
                    + "Sexo: " + this.sexo + "\n"
                    + "Idade: " + this.idade;
        
        return str;
    }
    
    public void preencher(String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    } 
}
