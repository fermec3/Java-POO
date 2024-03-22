package pessoa;

public class Pessoa {

    private String nome;
    private String cpf; 
    private int idade; 

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    String imprimirDadosDaPessoa() {
        return "O nome da pessoa é " + nome + ", a idade é " + idade + ", o documento é " + cpf;
    }


}
