package conversor_moneda;

import javax.swing.JOptionPane;

public class function {
  	conversor_moneda monedas = new conversor_moneda();
	conversor_moneda_pesos pesos = new conversor_moneda_pesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas","De Pesos a Yen Japones","De Pesos a Won Coreano", "De Pesos a Pesos Arg.", "De Pesos a Yuan Chino", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos","De Yen Japones a Pesos","De Won Coreano a Pesos", "De Pesos Arg. a Pesos", "De Yuan a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.pesos_2_dolar(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.pesos_2_euro(Minput);
        	break;
        case "De Pesos a Libras Esterlinas":
        	monedas.pesos_2_libras(Minput);
        	break;
        case "De Pesos a Yen Japones":
        	monedas.pesos_2_yen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.pesos_2_won(Minput);
        	break;
				case	"De Pesos a Pesos Arg.":
					monedas.pesos_2_argp(Minput);
					break;
				case	"De Pesos a Yuan Chino":
					monedas.pesos_2_yuan(Minput);
					break;
/* <---------------------Valor a la inversa------------------------------> */
        case "De Dólar a Pesos":
        	pesos.dolar_2_pesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.euro_2_pesos(Minput);
        	break;
        case "De Libras Esterlinas a Pesos":
        	pesos.libras_2_pesos(Minput);
        	break;
        case "De Yen Japones a Pesos":
        	pesos.yen_2_pesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.won_2_pesos(Minput);
            break;
        case "De Pesos Arg. a Pesos":
            pesos.argp_2_pesos(Minput);
            break;
        case "De Yuan Chino a Pesos":
            pesos.yuan_2_pesos(Minput);;
            break;
        }      
    }
}
