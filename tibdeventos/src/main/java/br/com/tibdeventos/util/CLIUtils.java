package br.com.tibdeventos.util;

import java.util.concurrent.TimeUnit;

public class CLIUtils {
	
	public static void limpaTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void exibirMensagemTemporaria(String msg) {
		limpaTela();
		System.out.println(">>> " + msg);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
