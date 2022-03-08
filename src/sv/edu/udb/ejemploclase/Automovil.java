package sv.edu.udb.ejemploclase;

public class Automovil {
	//Describimos las propiedades
	private String Marca;
	private String Modelo;
	private int Anio;
	private String Placa;
	private String Color;
	
	//Un constructor para inicializar
	public Automovil() {
		this.Marca = "";
		this.Modelo = "";
		this.Anio = 0;
		this.Placa = "";
		this.Color = "";
	}
	
	//Setter y Getter para acceder a mis propiedades
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public String getMarca() {
		return Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getAnio() {
		return Anio;
	}

	public void setAnio(int anio) {
		Anio = anio;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	
}
