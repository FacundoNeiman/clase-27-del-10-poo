
public class Perro extends Animal {
	private String trucha;

	public Perro(String nombre, String color, String trucha) {
		super(nombre, color);
		this.trucha=trucha;
		// TODO Auto-generated constructor stub
	}

	public String getTrucha() {
		return trucha;
	}

	public void setTrucha(String trucha) {
		this.trucha = trucha;
	}

	@Override
	public String toString() {
		return "Perro [trucha=" + trucha + ", Nombre()=" + getNombre() + ", Color()=" + getColor() + "]";
	}

	@Override
	public void hacerSonido() {
		System.out.println("GUAU!");
	}

	public double multiplicar (double n1 , double n2) {
	return n1*n2;	
	}
	public double multiplicar (double n1 , double n2, double n3) {
		return n1*n2 *n3;	
		}
	
	public void saludar() {
		System.out.println("Hola a todos!");
	}
	
	public void saludar(String nombre) {
		System.out.println("Hola, " + nombre);
	}
	
	public void caminar () {
		System.out.println("Estoy caminando");
		
	}
	
	
}
