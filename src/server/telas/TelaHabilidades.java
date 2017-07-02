/**
 * 
 */
package server.telas;

import java.util.Scanner;

import base.Elementos;
import server.HabilidadesDAO;

/**
 * @author Luciano
 *
 */
public class TelaHabilidades {
	Scanner ler = new Scanner(System.in);

	public void criar() {
		System.out.println("Nome da Habilidade");
		String nome = ler.nextLine();
		System.out.println("Qual tipo de Elemento da Habilidade: " + nome);
		Elementos.show();
		int tipoElemento = ler.nextInt();
		System.out.println("Qual % de dano da Habilidade: " + nome);
		int valorAtaque = ler.nextInt();
		System.out.println("Qual % de acerto da Habilidade: " + nome);
		int taxaAcerto = ler.nextInt();
		if (HabilidadesDAO.criar(nome, Elementos.values()[tipoElemento], taxaAcerto, valorAtaque)) {
			System.out.println("Habilidade Criada com Sucesso");
		} else {
			System.out.println("Problema ao criar Habilidade");
		}
	}
}
