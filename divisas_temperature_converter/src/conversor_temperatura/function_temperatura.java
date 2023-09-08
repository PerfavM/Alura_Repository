package conversor_temperatura;

import javax.swing.JOptionPane;

public class function_temperatura {
  conversor_temperatura temperatura = new conversor_temperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Grados Celcius a Grados Farenheit", "De Grados Celcius a Kelvin", "De Grados Farenheit a Grados Celcius", "De Grados Farenheit a Grados Kelvin","De Kelvin a Grados Celcius","De Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "De Grados Celcius a Grados Farenheit":
        	temperatura.celcius_2_farenheit(Minput);
        	break;
        case "De Grados Celcius a Kelvin":
            temperatura.celcius_2_kelvin(Minput);
            break;
        case "De Grados Farenheit a Grados Celcius":
           temperatura.farenheit_2_celcius(Minput);
           break;
        case "De Grados Farenheit a Grados Kelvin":
           temperatura.farenheit_2_kelvin(Minput);
           break;
        case "De Kelvin a Grados Celcius":
           temperatura.kelvin_2_celcius(Minput);
           break;
        case "De Kelvin a Grados Farenheit":
        	temperatura.kelvin_2_farenheit(Minput);
        	break;
        }
	}
}
