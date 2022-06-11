package Loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    ArrayList <Produto> produtos;
    ArrayList <Cliente> clientes;
    ArrayList <NotaFiscal> notas;

    public Loja(){
        produtos = new ArrayList<>();
        clientes = new ArrayList<>();
        notas = new ArrayList<>();
    }

    void cadastrarCliente() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os dados do cliente:" + "\n Nome:");
        String nome = s.nextLine();

        System.out.println("CPF: ");
        String cpf = s.nextLine();

        System.out.println("telefone: ");
        String tel = s.nextLine();

        Cliente c = new Cliente (cpf, nome, tel);
        this.clientes.add(c);
    }

    void cadastrarProduto() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os dados do produto:" + "\n Codigo:");
        int codigo = s.nextInt();

        s.nextLine();
        System.out.println("Nome:");
        String nome = s.nextLine();

        System.out.println("Preco: ");
        double preco = s.nextDouble();

        s.nextLine();
        System.out.println("Categoria: ");
        String categoria = s.nextLine();

        System.out.println("Desconto: ");
        double desconto = s.nextDouble();

        System.out.println("Estoque: ");
        int estoque = s.nextInt();

        Produto p = new Produto(codigo, nome, preco, categoria, desconto, estoque);
        this.produtos.add(p);
    }

    void cadastrarNota() {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite os dados da nota:" + "\n Codigo:");
        int codigo = s.nextInt();

        System.out.println("CPF do cliente que está buscando:");
        s.nextLine();
        String cpf = s.nextLine();
        Cliente c = buscarCliente(cpf);

        if(c == null){
            System.out.println("Esse cliente não existe");
            cadastrarCliente();
            c = buscarCliente(cpf);
        }

        System.out.println("Método de Pagamento: ");
        String pagamento = s.nextLine();

        NotaFiscal n = new NotaFiscal(codigo, c, pagamento);
        this.notas.add(n);
    }

    void listarClientes() {

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%20s %20s %20s", "CPF", "NOME", "TELEFONE");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Cliente cliente: clientes){
            System.out.format("%20s %20s %20s", cliente.getCpf(), cliente.getNome(), cliente.getTelefone());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");

        if (clientes.isEmpty()){
            System.out.println("Não existem clientes cadastrados");
        }
    }

        void listarProdutos() {
        for(int i=0; i < produtos.size(); i++)
        {
            System.out.println(produtos.get(i));
        }

        if (produtos.isEmpty()){
            System.out.println("Não existem produtos cadastrados");
        }
    }

    void listarNotas() {
        for(int i=0; i < notas.size(); i++)
        {
            NotaFiscal aux = notas.get(i);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%10s %10s %10s %10s %10s", "CODIGO NOTA", "NOME PRODUTO", "PREÇO UNITARIO", "PREÇO TOTAL PRODUTO", "PREÇO TOTAL NOTA");
            System.out.println("-----------------------------------------------------------------------------");
            for (int j=0; j < aux.itens.size(); j++){
                ItemCompra h = aux.itens.get(j);
                System.out.format("%u %10s %10d %10d %10d", aux.codigo, h.produto.nome, h.custoUnidade, h.custoTotal(), aux.custoTotal());
            }
            System.out.println("-----------------------------------------------------------------------------");
        }

        if (notas.isEmpty()){
            System.out.println("Não existem notas fiscais cadastradas");
        }
    }

    Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes){
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }

        return null;

    }
    Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCod() == codigo) {
                return produto;
            }
        }
        return null;
    }

    NotaFiscal buscarNota(int codigo) {
        for (NotaFiscal nota : notas) {
            if (nota.getCod() == codigo) {
                return nota;
            }
        }
        return null;
    }
    void removerCliente(String cpf) {
        Cliente excluido = buscarCliente(cpf);
        clientes.remove(excluido);
    }
    void removerProduto(int codigo) {
        Produto excluido = buscarProduto(codigo);
        produtos.remove(excluido);
    }

    void removerNota(int codigo) {
        NotaFiscal excluida = buscarNota(codigo);
        notas.remove(excluida);
    }

    void adicionarItemNota() {
        Scanner s = new Scanner (System.in);

        System.out.println("Codigo do produto:");
        int codp = s.nextInt();
        System.out.println(buscarProduto(codp));

        Produto p = buscarProduto(codp);

        if (p == null){
            System.out.println("Esse produto nao existe.");
            cadastrarProduto();
            p = buscarProduto(codp);
        }

        System.out.println("Codigo da nota:");
        int codn = s.nextInt();

        System.out.println("Quantidade de itens que deseja adicionar:");
        int qtd = s.nextInt();

        ItemCompra item = new ItemCompra(buscarProduto(codp), qtd);
        System.out.println(item.produto);
        System.out.println(item.custoUnidade);

        for (int i = 0; i < notas.size(); i++){
            NotaFiscal aux = notas.get(i);
            if (aux.codigo == codn){
                aux.itens.add(item);

                qtd = p.estoque;
                qtd = qtd - 1;
                p.atualizarEstoque(qtd);
            }
        }


    }
    void exibirRelatorio() {
        System.out.println("Quantidade de produtos na loja: " + produtos.size());
        System.out.println("Quantidade de usuários cadastrados na loja: " + clientes.size());
        System.out.println("Quantidade de compras feitas na loja: " + notas.size());

        double total = 0;
        System.out.println("Valor total de todas as compras (jeito 1):");
        for(NotaFiscal nota : notas){

            System.out.println(nota.custoTotal());
            total += nota.custoTotal();

        }
        System.out.println("Valor total de todas as compras (jeito 2):" + total);
    }
    void listarItensCategoria() {
        Scanner s = new Scanner (System.in);
        String categoria = s.nextLine();

        for (Produto produto : produtos){
            if(produto.categoria == categoria){
                System.out.println(produto.nome);
            }
        }
    }
}

