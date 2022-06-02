package Loja;

public class App {
	public static void main(String[] args) {
		Produto p = new Produto(123, "agua", 12, "bebida", 5, 10);
		Produto p2 = new Produto(321, "refri", 18, 20);
		
		System.out.println(p);
		
		p.atualizarEstoque(5);
		p.atualizarDesconto(2);
		p.atualizarPreco(10);
		
	
		System.out.println(p);
	}
		
}
