package Colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
	
		int decisao;
		boolean continuar1=true;
		Collection <String> estoque = new ArrayList();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Armazenar produto no estoque");
		
		while(continuar1 == true)
		{	
			leia.nextLine();
			System.out.println("\nEntre com um produto: ");
			String produto = leia.nextLine();
			estoque.add(produto);
			System.out.println("\nDeseja continuar a armazenar produtos? \nDigite: \n0-Para parar \n1-Para continuar");
			decisao = leia.nextInt();
			System.out.println("\nEstoque atualizado: "+estoque);
			
			if(decisao==0)
			{
				continuar1=false;
			}
			else if(decisao == 1)
			{
				continuar1=true;
			}
			produto="";
		}
		continuar1 = true;
		
		System.out.println("\n---------------------------------");
				
		System.out.println("\nRemover produto do estoque");
		
		while(continuar1 == true)
		{	
			leia.nextLine();
			System.out.println("\nDigite o nome do produto a ser removido: ");
			String produto1 = leia.nextLine();
			estoque.remove(produto1);
			System.out.println("\nDeseja continuar a remover produtos? \nDigite: \n0-Para parar \n1-Para continuar");
			decisao = leia.nextInt();
			System.out.println("\nEstoque atualizado: "+estoque);
			
			if(decisao == 0)
			{
				continuar1=false;
			}
			else if(decisao == 1)
			{
				continuar1=true;
			}
		}

	}

}
