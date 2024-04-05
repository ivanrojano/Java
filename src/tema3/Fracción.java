package tema3;

public class Fracción {

	//Propiedades de instancia
	private int numerador;
	private int denominador;
	
	/**
	 * Constructor de la clase Fracción
	 * @param numerador
	 * @param denominador
	 */
	public Fracción(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	/**
	 * @return the numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * @param numerador the numerador to set
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/**
	 * @return the denominador
	 */
	public int getDenominador() {
		return denominador;
	}
	
	/**
	 * @param denominador the denominador to set
	 */
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	//MÉTODOS DE INSTANCIA
	
	/**
	 * Métodos que invierte el denominador por el numerador  
	 * y el numerador por el denominador.
	 */
	public void invierte() {
		int aux = numerador;
		numerador = denominador;
		denominador = aux;
	}
	
	/**
	 * EL método multiplicar numerador * numeroMultiplicar
	 */
	public void multiplicar(int numeroMultiplicar) {
		int resultado;
		
		resultado = numerador * numeroMultiplicar;
		
		System.out.printf("El resultado de la multiplicación es: %d/%d\n", resultado, denominador);
		
	}
	
	public float división() {
		
		return (float) numerador / denominador;
		
	}
	
	
	public static void main(String[] args) {
		
		Fracción fraccionUno = new Fracción(10, 5);
		
		fraccionUno.invierte();
		fraccionUno.multiplicar(4);
		fraccionUno.división();

		
	}
	
	
	
	
	
	
}
