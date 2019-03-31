package ejercicio1;

import javax.swing.JOptionPane;

public class Saludo {
		// es un construtor
		public Saludo(){
			
		}

	public	void mensaje() {
		//asigno variable
		String saludo1 =("Hola mi primer saludo :)");
		//sirve para imprimir en pantalla
	System.out.print("Hola mi primer saludo ");
		// sirve para imprimir en una venta 
	JOptionPane.showMessageDialog(null, saludo1);
	}
}
