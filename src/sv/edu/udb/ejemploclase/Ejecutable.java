package sv.edu.udb.ejemploclase;
import javax.swing.*;

public class Ejecutable {
	public static void main(String[] args) {
	
		//Declarar nuestras intancias
		Automovil automovilJuan = new Automovil();
		Automovil automovilRodrigo = new Automovil();
		
		automovilJuan.setMarca(JOptionPane.showInputDialog(null,
				"Ingrese la marca del automovil de Juan"));
		
		automovilRodrigo.setMarca(JOptionPane.showInputDialog(null,
				"Ingrese la marca del automovil de Rodrigo"));
		
		JOptionPane.showMessageDialog(null, 
				"El automovil de Juan tiene las siguientes propiedades\n"
				+ "Marca: "+automovilJuan.getMarca()+"\n"
				+ "Modelo: "+automovilJuan.getModelo()+"\n"
				+ "Anio: "+automovilJuan.getAnio()+"\n"
				+ "Color: "+automovilJuan.getColor()+"\n"
				+ "Placa: "+automovilJuan.getPlaca()+"\n");
		
		JOptionPane.showMessageDialog(null, 
				"El automovil de Juan tiene las siguientes propiedades\n"
				+ "Marca: "+automovilRodrigo.getMarca()+"\n"
				+ "Modelo: "+automovilRodrigo.getModelo()+"\n"
				+ "Anio: "+automovilRodrigo.getAnio()+"\n"
				+ "Color: "+automovilRodrigo.getColor()+"\n"
				+ "Placa: "+automovilRodrigo.getPlaca()+"\n");
	}
}
