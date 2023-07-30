package entities;

import javax.swing.*;

public class ConversorMoedas {
	
	private double realDolar = 0.21;
	private double realEuro = 0.19;
	private double realLibras = 0.16;
	private double realPesoArgentino = 57.73;
	private double realPesoChileno = 174.80;
	
	
	public ConversorMoedas() {
		
	}
	
	public void converterRealDolares(double valor){
        double valorConvertido = (double) Math.round(this.realDolar * valor);
        JOptionPane.showMessageDialog(null, "Seu valor convertido de Real para Dólar é " + valorConvertido + " $ Dólares");
    }
	
	public void converterDolaReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realDolar);
		JOptionPane.showMessageDialog(null, "Seu valor convertido de Dólar para Real é R$ " + valorConvertido + " R$ Reais");
	}
	
	public void converterRealEuro(double valor) {
		double valorConvertido = (double) Math.round(this.realEuro * valor);
        JOptionPane.showMessageDialog(null, "Seu valor convertido de Real para €  é " + valorConvertido + " € Euros");
	}
	
	public void converterEuroReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realEuro);
		JOptionPane.showMessageDialog(null, "Seu valor convertido de Euro para R$ é " + valorConvertido + " R$ Reais");
	}
	
	public void converterRealLibras(double valor) {
		double valorConvertido = (double) Math.round(this.realLibras * valor);
		JOptionPane.showMessageDialog(null, "Seu valor em convertido de Real para Libras é " + valorConvertido + " £ Libras");
	}
	
	public void converterLibrasReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realLibras);
		JOptionPane.showMessageDialog(null, "Seu Valor convertido de libras para Reais é "+ valorConvertido + " R$ Reais");
	}
	
	public void converterRealPesoArgentino(double valor) {
		double valorConvertido = (double) Math.round(this.realPesoArgentino * valor);
		JOptionPane.showMessageDialog(null, "Seu Valor convertido de Real Para peso é "+ valorConvertido + " $ Pesos Argentinos");
	}
	
	public void converterPesoArgentinoReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realPesoArgentino);
		JOptionPane.showMessageDialog(null, "Seu Valor convertido de Peso Argentino para Real é "+ valorConvertido + " R$ Reais");
	}
	
	public void converterRealPesoChileno(double valor) {
		double valorConvertido = (double) Math.round(this.realPesoChileno * valor);
		JOptionPane.showMessageDialog(null, "Seu Valor convertido de Real Para peso chileno é "+ valorConvertido + " $ Pesos Chileno");
	}
	
	public void converterPesoChilenoReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realPesoChileno);
		JOptionPane.showMessageDialog(null, "Seu Valor convertido de Peso Chileno para Real é "+ valorConvertido + " R$ Reais");
	}
	

}
