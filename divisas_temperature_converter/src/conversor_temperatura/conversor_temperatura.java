package conversor_temperatura;

import javax.swing.JOptionPane;

public class conversor_temperatura {

  public double celcius_2_farenheit(double valor) {
		double celciusf = valor * 1.8 + 32;
    	celciusf = (double) Math.round(celciusf *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " + celciusf + " Grados Farenheit.");
		return celciusf;
	}
	
	public void celcius_2_kelvin(double valor){
		double celciusk = valor + 273.15;
        celciusk = (double) Math.round(celciusk *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " + celciusk + " Grados Kelvin.");
	}
	
	public void farenheit_2_celcius(double valor) {
		double farenheitc = (valor - 32) / 1.8;
      farenheitc = (double) Math.round(farenheitc *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " + farenheitc + " Grados Celcius.");
	}
	public void farenheit_2_kelvin(double valor){
		double farenheitk = 1.8*(valor - 32) + 273.15;
        farenheitk = (double) Math.round(farenheitk *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " + farenheitk + " Grados Kelvin.");
	}
	
	public double kelvin_2_celcius (double valor) {
		 double kelvinc = valor - 273.15;
         kelvinc = (double) Math.round(kelvinc *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " + kelvinc + " Celcius");
         return kelvinc ;
	}
	
	public void kelvin_2_farenheit(double valor) {
		double kelvinf = kelvin_2_celcius(valor);
		kelvinf = celcius_2_farenheit(kelvinf - 273.15);
		kelvinf	= (double) Math.round(kelvinf *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " + kelvinf + " Farenheit.");
	}
}
