package LojaVirtual;

public class Cliente {
    String cpf;
    String nome;
    String telefone;

    Cliente (String cpf, String nome, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }


    //public Cliente(String cpf) {
    //	super();
    //	this.cpf = cpf;
    //}


    public String toString() {
        return "Cliente(" + nome + ", cpf=" + cpf + ", tel=" + telefone + ")";
    }
}
