package paquete;

public abstract class Persona {
	
	protected int edad;
	protected int peso;
	
	public Persona(int edad, int peso)
	{
		this.edad=edad;
		this.peso=peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
