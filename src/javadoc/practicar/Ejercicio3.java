package javadoc.practicar;

/**
 * Tenemos que crear una aplicación que reciba un número y devuelva si es primo o no. Un número primo es aquel divisible entre sí mismo y uno solamente.
 * @author Ivan Rojano
 * @version
 * @see Ejercicio 1
 */
public class Ejercicio3 {

	//Propiedades de instancia
	private int numeroUno;

	/**
	 * Constructor del número primo.
	 * @param numeroUno
	 */
	public Ejercicio3(int numeroUno) {
		super();
		this.numeroUno = numeroUno;
	}
	
	/**
	 * Hemos creado un método donde tenemos que averiguar si el numero anterior es primo o no.
	 * @return true si es primo, y false si no es primo.
	 */
	public boolean esPrimo() {
		int numero = numeroUno;
		while(numeroUno>0){//Mientras que el numero sea mayor que 0.
			
			numeroUno--;
			
			if (numeroUno % 1 == 0 && numero / numeroUno != 0) {//Si el numero es 1 y dividido entre si mismo.
				
				System.out.print("Es número Primo\n");
				return true;//Devuelve true, debido a que el número es primo.
			}
		
		}
		
		return false;//Devuelve false, debido a que el número no es primo.
	}
	
	/**
	 * Creamos un método main para ver los aspectos de la calculadora extendida.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creamos la variable calculadora extendida.
		Ejercicio3 calculadoraExtendia;
		 calculadoraExtendia = new Ejercicio3(7);
		 
		 //Salida por pantalla si es primo o no.
		 System.out.println(calculadoraExtendia.esPrimo());
	}
}
