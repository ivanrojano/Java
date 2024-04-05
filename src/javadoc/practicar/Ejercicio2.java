package javadoc.practicar;

/**
 * Tenemos que crear una aplicación simple con las operaciones de multiplicación y división, potencia y raíz cuadrada y redondear.
 * @author Ivan Rojano
 * @version
 * @see Ejercicio 1
 */
public class Ejercicio2 {

	//Propiedades de instancia
	private double numeroUno;
	private double numeroDos;
	
	/**
	 * Constructor del ejercicio dos ( Calculadora )
	 * @param numeroUno (parámetros del número uno)
	 * @param numeroDos (parámetros del número dos)
	 */
	public Ejercicio2(double numeroUno, double numeroDos) {
		super();
		this.numeroUno = numeroUno;
		this.numeroDos = numeroDos;
	}
	
	/**
	 * @return the numeroUno
	 */
	public double getNumeroUno() {
		return numeroUno;
	}

	/**
	 * @param numeroUno the numeroUno to set
	 */
	public void setNumeroUno(double numeroUno) {
		this.numeroUno = numeroUno;
	}

	/**
	 * @return the numeroDos
	 */
	public double getNumeroDos() {
		return numeroDos;
	}

	/**
	 * @param numeroDos the numeroDos to set
	 */
	public void setNumeroDos(double numeroDos) {
		this.numeroDos = numeroDos;
	}

	//Otros métodos de instancia
	
	/**
	 * Multiplicación de los dos números anteriores.
	 * @return la solución de la multiplicación.
	 */
	public double multiplicacionNumeros() {
		double multiplicacion = numeroUno * numeroDos;
		return multiplicacion;
	}
	
	/**
	 * División de los dos números anteriores.
	 * @return la solucion de a división.
	 */
	public double divisionNumeros() {
		double division = numeroUno / numeroDos;
		if (numeroUno < numeroDos) {
			System.out.println("No se puede hacer la division, resultado = 0");
		}
		return division;
	}
	
	/**
	 * Potencia de los dos números.
	 * @return el resultado de la potencia.
	 */
	public double potenciaNumeros() {
		double potencia = Math.pow(numeroUno, numeroDos);
		return potencia;
	}
	
	/**
	 * Raiz cuadrada de los dos números anteriores.
	 * @return la solucion de la raiz cuadrada, con la multiplicación de los dos números.
	 */
	public double raizCuadradaNumeros() {
		double raizCuadrada = Math.sqrt(multiplicacionNumeros());
		return raizCuadrada;
	}
	
	/**
	 * Redondea a la cifra mas cercana de la multiplicación de los dos números.
	 * @return el resultado del redondeo
	 */
	public double redondearNumeros() {
		double redondear = Math.round(multiplicacionNumeros());
		return redondear;
	}
	
	/**
	 * Método main, donde ejecutaremos la calculadora.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Nueva caluladora
		Ejercicio2 calculadora;
		calculadora = new  Ejercicio2(8, 10);
		
		//Salida por pantalla de los resultados
		System.out.println(calculadora.multiplicacionNumeros());
		System.out.println(calculadora.divisionNumeros());
		System.out.println(calculadora.potenciaNumeros());
		System.out.println(calculadora.raizCuadradaNumeros());
		System.out.println(calculadora.redondearNumeros());
	}
}
