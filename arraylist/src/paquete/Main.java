package paquete;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Obrero obrero1= new Obrero(50, 98, "paraguay");
		
		Obrero obrero2= new Obrero(70, 65, "Bolivia");
		
		Artista artista1= new Artista(70, 65, "Marisa");
		
		Artista artista2= new Artista(70, 65, "Raquel");
		
		
		
		System.out.println(obrero1.toString());
		System.out.println(obrero2.toString());
		System.out.println(artista1.toString());
		System.out.println(artista2.toString());
		
		System.out.println("El obrero más pesado es: \n");
		
		ListaEdad();
		ListaPeso();
		
	}
	
	public static ArrayList<Persona> crearPersonas(){
		ArrayList<Persona> personas= new ArrayList<>(); 
		
		
		personas.add(new Obrero(65, 65,"Paraguay"));
		personas.add(new Obrero(45, 56,"Argentina"));
		personas.add(new Obrero(92, 78,"Bolivia"));
		personas.add(new Obrero(45, 56,"Russia"));
		personas.add(new Obrero(45, 12,"Ecuador"));
		personas.add(new Obrero(45, 78,"Brasil"));
		personas.add(new Obrero(45, 40,"México"));

		return personas;
	}

	
	public static Persona masGrande(ArrayList<Persona> personas){
		Persona masGrande;
		masGrande= personas.get(0);
		for(Persona individuo: personas){if(individuo.getEdad()>personas.get(0).getEdad()){masGrande= individuo;
			}
		
		}
		return masGrande;
		
	}
	
	public static Persona masPesado(ArrayList<Persona> personas){
		Persona masGrande;
		masGrande= personas.get(0);
		for(Persona individuo: personas){if(individuo.getPeso()>personas.get(0).getPeso()){masGrande= individuo;
			}
		
		}
		return masGrande;
		
	}
	
	
	public static void ListaEdad(){
		ArrayList<Persona> personas= crearPersonas();
		
		for(Persona individuo: personas)
		{
			
			
		}
		System.out.println(personas.toString());
		
		System.out.println("La persona más antigua es:      "+masGrande(personas)+"\n");
	}
	
	public static void ListaPeso(){
		ArrayList<Persona> personas= crearPersonas();
		
		for(Persona individuo: personas)
		{
			
			
		}
		
		System.out.println("La persona más pesada es:      "+masPesado(personas)+"\n");
	}
}
