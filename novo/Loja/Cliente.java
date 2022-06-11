package Loja;

public class Cliente {
    String cpf;
    String nome;
    String telefone;

    Cliente (String cpf, String nome, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf () {
    	return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String toString() {
        return "Cliente(" + nome + ", cpf=" + cpf + ", tel=" + telefone + ")";
    }
}
