package conversor_moneda;

import javax.swing.JOptionPane;

public class conversor_moneda {
  public void pesos_2_dolar(double valor) {
		double valor_dolar = valor / 0.059;
		valor_dolar = (double) Math.round(valor_dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valor_dolar + " Dolares Estadounidenses.");
	}
	
	public void pesos_2_euro(double valor) {
		double valor_euro = valor / 0.055;
		valor_euro = (double) Math.round(valor_euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valor_euro + " Euros.");
	}
	
	public void pesos_2_libras(double valor) {
		double valor_libras = valor / 0.047;
        valor_libras = (double) Math.round(valor_libras *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valor_libras + " Libras Esterlinas.");
	}
	
	public void pesos_2_yen(double valor) {
		double valor_yen = valor / 8.62;
        valor_yen = (double) Math.round(valor_yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valor_yen + " Yens Japones.");
	}
	
	public void pesos_2_won(double valor) {
		double valor_won = valor / 78.43;
        valor_won = (double) Math.round(valor_won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valor_won + " Wons Coreanos.");
	}
		public void pesos_2_argp(double valor) {
		double valor_argp = valor / 20.69;
        valor_argp = (double) Math.round(valor_argp *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valor_argp + " Pesos Argentinos.");
	}
	
	public void pesos_2_yuan(double valor) {
		double valor_yuan = valor / 48.06;
        valor_yuan = (double) Math.round(valor_yuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valor_yuan + " Yuan Chino.");
	}
}
