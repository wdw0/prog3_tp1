package Loja;

import java.util.ArrayList;

public class NotaFiscal {
	int codigo;
	Cliente comprador;
	String data;
	String metodoPagamento;
	ArrayList<ItemCompra> itens;
	
	NotaFiscal (int cod, Cliente com, String mP){
		codigo = cod;
		comprador = com;
		metodoPagamento = mP;
	}
	
	public String toString() {
		return "Nota Fiscal (" + codigo + ", comprador = " + comprador + ", data = " + data + ", pagamento = " + metodoPagamento +")";
	}
	
	void adicionarItem(ItemCompra item) {
		this.itens.add(item);
	}
	
	void custoTotal() {
		double custoTotal = 0;
		
		for(ItemCompra item : this.itens)
		    custoTotal += item.custoTotal();
		
		return custoTotal;
	}
	
}
