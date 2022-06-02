package Loja;

public class ItemCompra {
	Produto produto;
	int quantidade;
	double custoUnidade;
	
	ItemCompra (Produto p, int q, double c){
		produto = p;
		quantidade = q;
		custoUnidade = c;
	}
	
	public String toString() {
		return "Produto (" + produto + ", qtd = " + quantidade + ", custo = " + custoUnidade + ")";
	}
	
	double custoTotal() {
		
		return
	}
}
