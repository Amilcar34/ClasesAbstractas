
public final class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Pais1(37808410, false, " carlos ", " A ", 34);
		lasPersonas[1] = new Pais2(" pepe ", " B ", 45);
		
		for(Persona x : lasPersonas){
			
			System.out.println(x.getDatos());
		}

	}

}
