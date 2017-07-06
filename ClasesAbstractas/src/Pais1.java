
public final class Pais1 extends Persona{
	
	int dni;
	boolean auto;

	Pais1(int dni, boolean auto,String nom, String pais, int edad){
		super(nom, pais, edad);
		this.dni = dni;
		this.auto = auto;
	}

	@Override
	String getDatos() {
		// TODO Auto-generated method stub
		return "los datos son: " + this.dni + 
				nombre + pais + edad + " años " + 
		" y " + this.auto + " auto.";
	}
	
	
}
