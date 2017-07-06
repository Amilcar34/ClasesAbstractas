
public abstract class Persona {

	String nombre, pais;
	int edad;
	
	Persona(String nom, String pais, int edad){
		nombre = nom;
		this.pais = pais;
		this.edad = edad;
	}
	
	abstract String getDatos();
}
