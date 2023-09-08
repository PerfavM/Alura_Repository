package conversor_moneda;

import javax.swing.JOptionPane;

public class conversor_moneda_pesos {
  public void dolar_2_pesos(double valor) {
		double dolar_valor = valor * 16.78;
		dolar_valor = (double) Math.round(dolar_valor *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolar_valor + " Pesos Mexicanos.");
	}
	
	public void euro_2_pesos(double valor) {
		double euro_valor = valor * 18.20;
		euro_valor = (double) Math.round(euro_valor *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + euro_valor + " Pesos Mexicanos.");
	}
	
	public void libras_2_pesos(double valor) {
		double libra_valor = valor * 21.43;
        libra_valor = (double) Math.round(libra_valor *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + libra_valor + " Pesos Mexicanos.");
	}
	
	public void yen_2_pesos(double valor) {
		double yen_valor = valor * 0.12;
        yen_valor = (double) Math.round(yen_valor *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + yen_valor+ " Pesos Mexicanos.");
	}
	
	public void won_2_pesos(double valor) {
		double won_valor = valor * 0.013;
        won_valor = (double) Math.round(won_valor *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + won_valor + " Pesos Mexicanos.");
	}
		public void argp_2_pesos(double valor) {
		double argp_valor = valor * 0.048;
        argp_valor = (double) Math.round(argp_valor *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argp_valor + " Pesos Mexicanos.");
	}
		public void yuan_2_pesos(double valor) {
		double yuan_valor = valor * 2.32;
        yuan_valor = (double) Math.round(yuan_valor *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + yuan_valor + " Pesos Mexicanos.");
	}
}