package LojaVirtual;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	ArrayList <Produto> produtos;
	ArrayList <Cliente> clientes;
	ArrayList <NotaFiscal> notas;
	
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
		
		s.close();
	}
	
	void cadastrarProduto() {
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Digite os dados do produto:" + "\n Codigo:");
		int codigo = s.nextInt();
		
		System.out.println("Nome: ");
		String nome = s.nextLine();
	
		System.out.println("Preco: ");
		double preco = s.nextDouble();
		
		System.out.println("Categoria: ");
		String categoria = s.nextLine();
		
		System.out.println("Desconto: ");
		double desconto = s.nextDouble();
		
		System.out.println("Estoque: ");
		int estoque = s.nextInt();
		
		Produto p = new Produto(codigo, nome, preco, categoria, desconto, estoque);
		this.produtos.add(p);
		
		s.close();
	}
	
	void cadastrarNota() {
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Digite os dados da nota:" + "\n Codigo:");
		int codigo = s.nextInt();
		
		String cpf = s.nextLine();
		Cliente c = buscarCliente(cpf);
		
		if(c == null){
			cadastrarCliente();
		}
		
		System.out.println("Método de Pagamento: ");
		String pagamento = s.nextLine();
		
		NotaFiscal n = new NotaFiscal(codigo, c, pagamento);
		this.notas.add(n);
		
		s.close();
	}
	
	void listarClientes() {
		for(int i=0; i < clientes.size(); i++)
        {
            System.out.println(clientes.get(i));
        }		
	}
	
	void listarProdutos() {
		for(int i=0; i < produtos.size(); i++)
        {
            System.out.println(produtos.get(i));
        }
	}
	
	void listarNotas() {
		for(int i=0; i < notas.size(); i++)
        {
            System.out.println(notas.get(i));
        }
	}
	
	Cliente buscarCliente(String cpf) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite as informacoes do cliente que esta buscando: " + "\n Nome: ");
		String nome = s.nextLine();
		
		System.out.println("CPF: ");
		String c = s.nextLine();
		
		System.out.println("telefone: ");
		String tel = s.nextLine();
		
		if (cpf == c) {
			Cliente cli = new Cliente(nome, c, tel);
			return cli;
		}
		
		else {
			System.out.println("Esse cliente não existe");
			return null;
		}
		
	}
	Produto buscarProduto(int codigo) {
		return null;}
	NotaFiscal buscarNota(int codigo) {}
	void removerCliente(String cpf) {}
	void removerProduto(int codigo) {}
	void removerNota(int codigo) {}
	void adicionarItemNota() {}
	void exibirRelatorio() {}
	void listarItensCategoria() {}
}
