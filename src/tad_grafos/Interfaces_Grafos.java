package tad_grafos;

import java.util.Scanner;
import interfaces.Interface;
import static interfaces.Interface.titulo2;

public class Interfaces_Grafos {
	Interface opcoes = new Interface();
	
	public void grafos() {
		
		
		titulo2("  			         ██████  ██████   █████  ███████  ██████  ███████ \r\n"
				+ "                                ██       ██   ██ ██   ██ ██      ██    ██ ██      \r\n"
				+ "                                ██   ███ ██████  ███████ █████   ██    ██ ███████ \r\n"
				+ "                                ██    ██ ██   ██ ██   ██ ██      ██    ██      ██ \r\n"
				+ "                                 ██████  ██   ██ ██   ██ ██       ██████  ███████  ");
		
		
		
		
		
		
		System.out.println("Apresentação: \r\n"
				+ "É considerado uma estrutura de dados que representa uma coleção de relacionamentos entre pares de\n"
				+ "objetos, sendo que os objetos são classificados como os vértices e os relacionamentos as arestas do\n"
				+ "grafo.  As arestas em um grafo podem ser direcionadas ou não direcionadas, as direcionadas possuem\n"
				+ "relações possuem sentido definido e as suas arestas são pares ordenados de vértices. No caso dos não\n"
				+ "direcionados as arestas não possuem sentido definido, podendo seguir qualquer direção.\n");
		
		boolean alternador = true;
		Scanner entrada = new Scanner(System.in);
		while(alternador) {
			System.out.println("[0] Sair");
			int saida = entrada.nextInt();
			if(saida != 0) {
				System.out.println("Digite 0 para voltar.");
			 	
			}
			else {
				alternador = false;
			}
			
		}
		
	}
}
