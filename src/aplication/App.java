package aplication;

import javax.swing.*;

import entities.InterfaceGrafica;

public class App {

	public static void main(String[] args) {

		InterfaceGrafica conversorDeMoedas = new InterfaceGrafica();

		boolean verifica = true;

		while(verifica) {

			String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", 
					"Conversor de Moedas Desafio Alura", JOptionPane.INFORMATION_MESSAGE, 
					null, new Object[]{"Conversor de Moeda"}, "Escolha").toString();

			if(opcoes == "Conversor de Moeda") {

				String valor = JOptionPane.showInputDialog("Entre com um valor monetário ($): ");

				try {
					double valorRecebido = Double.parseDouble(valor);

					if(valorRecebido >= 0) {
						conversorDeMoedas.converte(valorRecebido);

						int escolha = JOptionPane.showConfirmDialog(null, "Deseja converter mais algum valor?");
						if (JOptionPane.OK_OPTION == escolha) {
							verifica = true;
						} else {
							JOptionPane.showMessageDialog(null, "Fim do programa!");
							verifica = false;
						}      
					}

					else {
						JOptionPane.showMessageDialog(null, "Erro!", "Digite um valor monetário positivo.", JOptionPane.ERROR_MESSAGE);
					} 

				}catch (NumberFormatException e) {
					System.out.println("numero invalido " + e);
					JOptionPane.showMessageDialog(null, "Erro! Digite um valor monetário.", "Valor inválido!", JOptionPane.ERROR_MESSAGE);
					verifica = true;
				}


			}
		}	//fim while
	}	

}
