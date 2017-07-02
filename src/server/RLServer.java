package server;

import java.util.Scanner;

import base.Habilidade;
import server.telas.TelaHabilidades;

public class RLServer implements Runnable {

	public void iniciar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int op;
		Scanner ler = new Scanner(System.in);
		for (Habilidade h : HabilidadesDAO.getListaHabilidades()) {
			System.out.println(h);
		}
		
		do {
			TelaHabilidades t = new TelaHabilidades();
			t.criar();
			System.out.println("1 - Para continuar criando \n0 - Para sair");
			op = ler.nextInt();
		} while (op == 1);
		ler.close();
		System.out.println("########################################");
		for (Habilidade h : HabilidadesDAO.getListaHabilidades()) {
			System.out.println(h);
		}
	}

}
