package paquete;

public class Obrero extends Persona {
	
	protected String origen;
	
	public Obrero(int edad, int peso, String origen)
	{
		super(edad, peso);
		this.origen=origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	
	
	@Override
	public String toString()
	{
		return origen + " es el país de origen de donde proviene";
	}
}
