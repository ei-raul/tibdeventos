package br.com.tibdeventos.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.tibdeventos.util.CLIUtils;

public class MenuPrincipal extends Menu {

	public MenuPrincipal() {
		this.menuEmExibicao = true;
	}
	
	@Override
	public void apresentarMenuDeOpcoes() {
		while (this.menuEmExibicao) {

			CLIUtils.limpaTela();
			System.out.println("*******************************************");
			System.out.println("*    BEM-VINDO AO SISTEMA DE EVENTOS!     *");
			System.out.println("*******************************************\n\n");

			System.out.println("[1] EVENTOS");
			System.out.println("[2] USUÁRIOS");

			System.out.println("\n\n*******************************************");
			System.out.println("[0] SAIR");

			Scanner sc = new Scanner(System.in);
			try {				
				int op = sc.nextInt();
				if (op == 0) {
					this.menuEmExibicao = false;
					this.exibirMensagemDespedida();
				} else if (op == 1) {
					MenuEventos menuEventos = new MenuEventos();
					menuEventos.apresentarMenuDeOpcoes();
				} else if (op == 2) {
					
				} else {
					CLIUtils.exibirMensagemTemporaria("Opção inválida... Vamos tentar novamente?");
				}
			}
			catch (InputMismatchException e) {
				CLIUtils.exibirMensagemTemporaria("Opção inválida... Vamos tentar novamente?");
			}

		}
	}

	@Override
	public void exibirMensagemDespedida() {
		CLIUtils.exibirMensagemTemporaria("Até logo! ;)");
	}

}
