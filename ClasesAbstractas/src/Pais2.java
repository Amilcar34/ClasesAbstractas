
public final class Pais2 extends Persona{
	
	Pais2(String nom, String pais, int edad){
		super(nom, pais, edad);
		
	}

	@Override
	String getDatos() {
		// TODO Auto-generated method stub
		return "en este pais esta persona: " + this.nombre + this.edad + this.pais;
	}

}
