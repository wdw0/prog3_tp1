package Loja;

public class Produto {
    int codigo;
    String nome;
    double preco;
    String categoria;
    double desconto;
    int estoque;

    public Produto(int codigo, String nome, double preco, String categoria, double desconto, int estoque) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.desconto = desconto;
        this.estoque = estoque;
    }

    public Produto(int codigo, String nome, double preco, int estoque) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    double custo() {
    	double descCalculado = preco * desconto;
    	return preco - descCalculado;
    }

    void atualizarEstoque(int qtd) {
        if(qtd >= 0) {
            estoque = qtd;
        }
        else {
            System.out.println("Não é possível registrar um estoque negativo");
        }
    }
    void atualizarDesconto(double v) {
        if(v >= 0) {
            desconto = v;
        }
        else {
            System.out.println("Não é possível aplicar um desconto negativo");
        }
    }
    void atualizarPreco(double v) {
        if(v >= 0) {
            preco = v;
        }
        else {
            System.out.println("Não é possível definir um preço negativo ou igual a zero");
        }
    }
    
    public int getCod() {
    	return codigo;
    }

    @Override
    public String toString() {
        return "Produto [codigo: " + codigo + ", nome: " + nome + ", preco: " + preco + ", categoria: " + categoria
                + ", desconto:" + desconto + ", estoque: " + estoque + "]";
    }
}
