
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato miGato= new Gato("dukesa", "gris", "bigotes");
		
		System.out.println(miGato);
		
		Perro miPerro = new Perro("Guita", "Gris", "Trucha");
		System.out.println(miPerro);
		
		miPerro.hacerSonido();
		
		double resultadoMultiplicacionPerruna = miPerro.multiplicar(5, 10);
		System.out.println(resultadoMultiplicacionPerruna);
		
		miPerro.saludar();
		miPerro.saludar("Kevin");
		
	}

}
