package br.com.tibdeventos.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.tibdeventos.dao.EventoDAO;
import br.com.tibdeventos.model.Evento;
import br.com.tibdeventos.util.CLIUtils;

public class MenuCadastraEvento extends Menu {
	
	public MenuCadastraEvento() {
		this.menuEmExibicao = true;
	}
	
	@Override
	public void apresentarMenuDeOpcoes() {
		while(this.menuEmExibicao) {
			CLIUtils.limpaTela();
			System.out.println("*******************************************");
			System.out.println("*           CADASTRO DE EVENTO            *");
			System.out.println("*******************************************\n\n");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(">> INSIRA O NOME DO EVENTO:");
			String nomeEvento = sc.nextLine();
			
			System.out.println(">> INFORME A CIDADE DO EVENTO:");
			String cidadeEvento = sc.nextLine();
			
			System.out.println(">> INFORMA O ESTADO (UF), POR FAVOR:");
			String ufEvento = sc.nextLine();
			
			Evento evento = new Evento(nomeEvento, ufEvento, cidadeEvento, null);
			
			System.out.println("\n" + evento);
			System.out.println(">> DESEJA CONFIRMAR O CADASTRO?\n[1] SIM [2] NÃO");
			int op = sc.nextInt();
			if(op == 1) {
				this.menuEmExibicao = false;
				EventoDAO eventoDao = new EventoDAO();
				
				try {
					eventoDao.cadastrarEvento(evento);
					CLIUtils.exibirMensagemTemporaria("Evento cadastrado com sucesso!!!");
				} catch (SQLException e) {
					CLIUtils.exibirMensagemTemporaria("Erro ao cadastrar o evento...");
				}
			}
			else {
				System.out.println(">> DESEJA RECOMEÇAR O CADASTRO OU SAIR?\n[1] SAIR [2] RECOMEÇAR");
				op = sc.nextInt();
				if(op == 1) {
					this.menuEmExibicao = false;
				}
			}
		
		}
	}

	@Override
	public void exibirMensagemDespedida() {
		// TODO Auto-generated method stub
		
	}

	
}
