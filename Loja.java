package Loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	ArrayList <Produto> produtos;
	ArrayList <Cliente> clientes;
	ArrayList <NotaFiscal> notas;
	
	void CadastrarCliente() {
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
	
	void CadastrarProduto() {
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
	
	void CadastrarNota() {
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Digite os dados da nota:" + "\n Codigo:");
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
}
