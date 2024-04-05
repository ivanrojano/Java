package javadoc.practicar;

/**
 * @author Iván Rojano Anguita
 * @version
 */
public class IvanRojanoAnguita {


	/**
	 * Método que devuelve un número aleatorio enterro entre dos pasados por argumentos del método.
	 * @param numeroUno
	 * @param numeroDos
	 * La suma de los numeroUno y numeroDos será el número final ( multiplicado por math.random ).
	 * @return el número aleatorio expresado entre los dos números.
	 */
	public int numeroAleatorio(int numeroUno, int numeroDos) {
		
		int numeroSuma;
		numeroSuma = numeroUno + numeroDos;
		
		int numeroAleatorio = (int) (Math.random() * numeroSuma);
		
		return numeroAleatorio;
		
	}
	
	/**
	 * Método que devuelve si la edad indicada de la persona por el teclado es mayor de edad o menor de edad.
	 * @param edadPersona - Edad de la persona expresada por el teclado
	 * @param nombrePersona - Nombre de la persona 
	 * @return si es mayor de edad devuelve true, si es menor de edad devuelve false
	 */
	public boolean esMayorDeEdad(int edadPersona, String nombrePersona) {
		
		if (edadPersona >= 18) {
			System.out.println("Eres mayor de edad");
			return true;
		}
		
		System.out.println("Eres menor de edad");
		return false;
	}
	
}
