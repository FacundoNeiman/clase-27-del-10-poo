
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato miGato= new Gato("dukesa", "gris", "bigotes");
		System.out.println(miGato);
		
		Perro miPerro = new Perro("Guita", "Gris", "Trucha");
		System.out.println(miPerro);
		
		Serpiente miSerpiente = new Serpiente("Ruben", "Verde", "veneno mortal X-534");
		System.out.println(miSerpiente);
		
		miPerro.hacerSonido();
		miGato.hacerSonido();
		miSerpiente.hacerSonido();
		
		miPerro.caminar();
		miGato.caminar();
		miSerpiente.caminar();
		
	}

}
