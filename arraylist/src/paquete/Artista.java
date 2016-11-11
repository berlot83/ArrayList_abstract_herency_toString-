package paquete;

public class Artista extends Persona{
	
	protected String nombre;
	
	public Artista(int edad, int peso, String nombre)
	{
		super(edad, peso);
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		return nombre + " es el nombre del Artista";
	}

}
