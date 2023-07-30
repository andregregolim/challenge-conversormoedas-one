package entities;

import javax.swing.*;

public class InterfaceGrafica {
	
	ConversorMoedas conversorMoedas = new ConversorMoedas();
	
	 public void converte(double valor) {
		 
	        String opt = (JOptionPane.showInputDialog(null,
	                "Escolha uma moeda para converter ", 
	                "Escolha a moeda de conversão", 
	                JOptionPane.PLAIN_MESSAGE, null, 
	                new Object[]{"De Reais para Dólares", "De Dólares para Reais", "De Reais para Euro", "De Euro para Reais",
	                			 "De Libras para Real", "De Real para Libras", "De Real para Peso Argentino", "De Peso Argentino Para Real", 
	                			 "De Real para Peso Chileno", "De Peso Chileno para Real"}, "Escolha")).toString();

	        switch (opt) {
	            case "De Reais para Dólares":
	            	conversorMoedas.converterRealDolares(valor);
	                break;
	            case "De Dólares para Reais":
	                conversorMoedas.converterDolaReal(valor);
	                break;
	            case "De Reais para Euro":
	            	conversorMoedas.converterRealEuro(valor);
	                break;
	            case "De Euro para Reais":
	            	conversorMoedas.converterEuroReal(valor);
	                break;
	            case "De Libras para Real":
	            	conversorMoedas.converterLibrasReal(valor);
	                break;
	            case "De Real para Libras":
	            	conversorMoedas.converterRealLibras(valor);
	                break;
	            case "De Real para Peso Argentino":
	            	conversorMoedas.converterRealPesoArgentino(valor);
	                break;
	            case "De Peso Argentino Para Real":
	            	conversorMoedas.converterPesoArgentinoReal(valor);
	                break;
	            case "De Real para Peso Chileno":
	            	conversorMoedas.converterRealPesoChileno(valor);
	                break;
	            case "De Peso Chileno para Real":
	            	conversorMoedas.converterPesoChilenoReal(valor);
	                break;
	        }
	    }
	
	   
}
