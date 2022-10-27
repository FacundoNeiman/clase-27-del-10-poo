
public class Gato extends Animal {
	private String bigote;
	
	public Gato(String nombre, String color, String bigote) {
		super(nombre, color);
		this.bigote = bigote;
	}

	@Override
	public String toString() {
		return "Gato [bigote=" + bigote + ", Nombre=" + super.getNombre() + ", Color=" + super.getColor() + "]";
	}

	public String getBigote() {
		return bigote;
	}

	public void setBigote(String bigote) {
		this.bigote = bigote;
	}

	@Override
	public void hacerSonido() {
		System.out.println("MIAU!!!!");
		
	}
	public void caminar () {
		System.out.println("Estoy caminando");
		
	}
	
}
