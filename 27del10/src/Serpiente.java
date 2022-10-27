
public class Serpiente extends Animal{
	
	private String veneno;
	
	public Serpiente(String nombre, String color, String veneno) {
		super(nombre, color);
		this.veneno = veneno;
	}



	@Override
	public String toString() {
		return "Serpiente [veneno=" + veneno + ", getNombre()=" + getNombre() + ", getColor()=" + getColor() + "]";
	}



	@Override
	public void hacerSonido() {
	System.out.println("SZSZSZSZZZS");
		
	}

	@Override
	public void caminar() {
		System.out.println("Me arrastro");
		
	}

	
}
