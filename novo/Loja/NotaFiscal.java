package Loja;

import java.time.LocalDate;
import java.util.ArrayList;

public class NotaFiscal {
    int codigo;
    Cliente comprador;
    private LocalDate data = LocalDate.now();
    String metodoPagamento;
    ArrayList<ItemCompra> itens;

    NotaFiscal (int cod, Cliente com, String mP){
        codigo = cod;
        comprador = com;
        metodoPagamento = mP;
        itens = new ArrayList<ItemCompra>();
    }

    public String toString() {
        return "Nota Fiscal (" + codigo + ", comprador=" + comprador + ", data=" + data + ", pagamento=" + metodoPagamento +")";
    }

    void adicionarItem(ItemCompra item) {
        this.itens.add(item);
    }

    double custoTotal() {

        double custo = 0;

        for(ItemCompra item : this.itens)
            custo += item.custoTotal();

        return custo;
    }

    public int getCod(){
        return codigo;
    }

    public ArrayList getItens(){
        return itens;
    }
}
