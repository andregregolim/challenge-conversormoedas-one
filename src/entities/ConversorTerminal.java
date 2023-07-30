package entities;

import javax.swing.JOptionPane;

public class ConversorTerminal extends ConversorMoedas{
	
	public void converterRealDolares(double valor){
        double valorConvertido = (double) Math.round(this.realDolar * valor);
        System.out.println("Seu valor convertido de Real para Dólar é " + valorConvertido + " $ Dólares");
       
    }
	
	public void converterDolaReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realDolar);
		System.out.println("Seu valor convertido de Dólar para Real é R$ " + valorConvertido + " R$ Reais");
	}
	
	public void converterRealEuro(double valor) {
		double valorConvertido = (double) Math.round(this.realEuro * valor);
		System.out.println("Seu valor convertido de Real para €  é " + valorConvertido + " € Euros");
	}
	
	public void converterEuroReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realEuro);
		System.out.println("Seu valor convertido de Euro para R$ é " + valorConvertido + " R$ Reais");
	}
	
	public void converterRealLibras(double valor) {
		double valorConvertido = (double) Math.round(this.realLibras * valor);
		System.out.println("Seu valor em convertido de Real para Libras é " + valorConvertido + " £ Libras");
	}
	
	public void converterLibrasReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realLibras);
		System.out.println("Seu Valor convertido de libras para Reais é "+ valorConvertido + " R$ Reais");
	}
	
	public void converterRealPesoArgentino(double valor) {
		double valorConvertido = (double) Math.round(this.realPesoArgentino * valor);
		System.out.println("Seu Valor convertido de Real Para peso é "+ valorConvertido + " $ Pesos Argentinos");
	}
	
	public void converterPesoArgentinoReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realPesoArgentino);
		System.out.println("Seu Valor convertido de Peso Argentino para Real é "+ valorConvertido + " R$ Reais");
	}
	
	public void converterRealPesoChileno(double valor) {
		double valorConvertido = (double) Math.round(this.realPesoChileno * valor);
		System.out.println("Seu Valor convertido de Real Para peso chileno é "+ valorConvertido + " $ Pesos Chileno");
	}
	
	public void converterPesoChilenoReal(double valor) {
		double valorConvertido = (double) Math.round(valor / this.realPesoChileno);
		System.out.println("Seu Valor convertido de Peso Chileno para Real é "+ valorConvertido + " R$ Reais");
	}
	
	

}
