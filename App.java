package Loja;

import java.util.Scanner;

public class App {
	  public static void main(String[] args) {
		  	Loja l = new Loja();       
	        menu(l);
	  }
	  
	  public static void menu(Loja l) {

		 int i, aux;
		 
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Qual operacao deseja realizar?\n1- Cadastro\n2- Listar\n3- Exclusao\n4- Visualizar relatorios\n5- Visualizar itens de uma categoria\n6- Sair");
		 i = s.nextInt();
		 
		 switch(i) {
		 case 1:
			 System.out.println("O que deseja cadastrar?\n1- Cadastrar Cliente\n2- Cadastrar Produto\n3- Cadastrar Nota\n4- Retornar ao menu\n");
			 aux = s.nextInt();
			 if(aux == 1) {
				 l.cadastrarCliente();
				 menu(l);
			 }
			 else if(aux == 2){
				 l.cadastrarProduto();
				 menu(l);
			 }
			 else if(aux == 3){
				 l.cadastrarNota();
				 menu(l);
			 }
			 else if(aux == 4) {
				 menu(l);
			 }
			 else {
				 System.out.println("Opcao invalida, retornando ao Menu");
				 menu(l);
			 }
			 break;
		 case 2:
			 System.out.println("O que deseja Listar?\n1- Listar Clientes\n2- Listar Produtos\n3- Listar Notas\n4- Retornar ao menu\n");
			 aux = s.nextInt();
			 if(aux == 1) {
				 l.listarClientes();
			 }
			 else if(aux == 2){
				 l.listarProdutos();
			 }
			 else if(aux == 3){
				 l.listarNotas();
			 }
			 else if(aux == 4) {
				 menu(l);
			 }
			 else {
				 System.out.println("Opcao invalida, retornando ao Menu");
				 menu(l);
			 }
			 break;
		 case 3:
			 System.out.println("O que deseja excluir?\n1- Excluir Cliente\n2- Excluir Produto\n3- Excluir Nota\n4- Retornar ao menu\n");
			 aux = s.nextInt();
			 switch(aux) {
			 case 1:
				 System.out.println("Insira o cpf do cliente que deseja excluir: ");
				 s.nextLine();
				 String cpf = s.nextLine();
				 l.removerCliente(cpf);
				 menu(l);
				 break;
			 case 2:
				 System.out.println("Insira o codigo do produto que deseja excluir: ");
				 int cod = s.nextInt();
				 l.removerProduto(cod);
				 menu(l);
				 break;
			 case 3:
				 System.out.println("Insira o codigo da nota que deseja excluir: ");
				 int codn = s.nextInt();
				 l.removerNota(codn);
				 menu(l);
				 break;
			 case 4:
				 menu(l);
				 break;
			 default:
				 System.out.println("Opcao invalida, retornando ao Menu");
				 menu(l);			 
			 }
			 break;
		 case 4:
			 System.out.println("Visualizar relatorios");
			 break;
		 case 5:
			 System.out.println("Visualizar itens de uma categoria");
			 break;
		 case 6:
			 System.exit(0);
			 break;
		 default:
			 System.out.println("Por favor insira uma opcao valida\n");
			 menu(l);
		 }
		 		 	  
	  }
}











