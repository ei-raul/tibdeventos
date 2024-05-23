package br.com.tibdeventos.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.tibdeventos.util.CLIUtils;

public class MenuEventos extends Menu {

	public MenuEventos() {
		this.menuEmExibicao = true;
	}
	
	@Override
	public void apresentarMenuDeOpcoes() {
		while(this.menuEmExibicao) {
			CLIUtils.limpaTela();
			System.out.println("*******************************************");
			System.out.println("*                 EVENTOS                 *");
			System.out.println("*******************************************\n\n");
			
			System.out.println("[1] CADASTRAR EVENTOS");
			System.out.println("[2] LISTAR EVENTOS CADASTRADOS");
			System.out.println("[3] VER INFORMAÇÕES DE UM EVENTO ESPECÍFICO");
			System.out.println("[4] DELETAR UM EVENTO");
			
			System.out.println("\n\n*******************************************");
			System.out.println("[0] VOLTAR");
			
			Scanner sc = new Scanner(System.in);
			try {
				int op = sc.nextInt();
				
				if(op == 0) {
					this.menuEmExibicao = false;
					this.exibirMensagemDespedida();
				}
				else if(op == 1) {
					MenuCadastraEvento menuCadastraEvento = new MenuCadastraEvento();
					menuCadastraEvento.apresentarMenuDeOpcoes();
				}
				else {
					CLIUtils.exibirMensagemTemporaria("Opção inválida... Vamos tentar novamente?");
				}				
			}
			catch(InputMismatchException e) {
				CLIUtils.exibirMensagemTemporaria("Opção inválida... Vamos tentar novamente?");
			}
		}
		
	}

	@Override
	public void exibirMensagemDespedida() {
		// TODO Auto-generated method stub
	}

}
