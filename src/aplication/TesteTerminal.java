package aplication;

import java.io.IOException;
import java.util.Scanner;

import entities.ConversorTerminal;

public class TesteTerminal {

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);
		ConversorTerminal converte = new ConversorTerminal();
		
		boolean verifica = true;
		int entrada = 0;
				
		while(verifica) {
			
			menuDeOpcoes();
			entrada = sc.nextInt();
			double valor;
			
			switch (entrada) {
				case 1:
					limpaTela();
					System.out.println("Convertendo real para dólar");
					System.out.println("Insira um valor: ");
					valor = sc.nextDouble();
					converte.converterRealDolares(valor);
					
				break;
				
				case 2:
					limpaTela();
					System.out.println("Convertendo Dólar para Real");
					System.out.println("Insira um valor: ");
					valor = sc.nextDouble();
					converte.converterDolaReal(valor);
					
					
				break;
				
				case 3:
					limpaTela();
					System.out.println("Convertendo Real para Euro");
					System.out.println("Insira um valor: ");
					valor = sc.nextDouble();
					converte.converterRealEuro(valor);
					
				break;
				
				/* ... e mais */
				
				case 11:
					System.out.println("Programa Finalizado.");
					limpaTela();
					verifica = false;
				break;
			
				default:
					System.out.println("Digite uma opção válida (1-10) ");
					
				break;
				
			}
			
			
		}
		
		sc.close();
	}
	
	public static void menuDeOpcoes() {
		System.out.println("*****************************************************");
		System.out.println("ESCOLHA UMA OPÇÃO PARA CONVERTER UM VALOR ($)");
		System.out.println("*****************************************************");
		System.out.println("1- Converter de Real para Dólar");
		System.out.println("2- Converter de Dólar para Real");
		System.out.println("3- Converter de Real para Euro");
		System.out.println("4- Converter de Euro para Real");
		System.out.println("5- Converter de Real para Libras");
		System.out.println("6- Converter de Libras para Real");
		System.out.println("7- Converter de Real para Peso Argentino");
		System.out.println("8- Converter de Peso Argentino para Real");
		System.out.println("9- Converter de Real para Peso Chileno");
		System.out.println("10- Converter de Peso Chileno para Real");
		System.out.println("11 - Sair do Sistema");
		
	}
	
	public static void limpaTela() throws InterruptedException, IOException {
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	}
	
	
	
}
