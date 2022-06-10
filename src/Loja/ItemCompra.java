package Loja;

public class ItemCompra {
    Produto produto;
    int quantidade;
    double custoUnidade;

    ItemCompra (Produto p, int q){
        produto = p;
        quantidade = q;
        custoUnidade = p.custo();
    }

    public String toString() {
        return "Item Comprado (" + produto + ", qtd: " + quantidade + ", custo: " + custoUnidade + ")";
    }

    double custoTotal() {

        return this.quantidade * this.custoUnidade;
    }
}