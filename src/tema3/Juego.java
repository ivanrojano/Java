package tema3;

public class Juego {

	//Propiedades de instancia
	private int numeroVidas;
	private static int vidasRecord = 0;
	private  int vidasIniciales = 5;

	/**
	 * Constructor de la clase Juego
	 * @param numeroVidas
	 */
	public Juego(int numeroVidas, int vidasRecord) {
		super();
		this.numeroVidas = numeroVidas;
		this.vidasIniciales = numeroVidas;
	}

	/**
	 * Método que indica el número de vida iniciales
	 * @return el número de vida
	 */
	public int getNumeroVidas() {
		return numeroVidas;
	}
	
	//OTROS MÉTODOS DE INSTANCIA
	
	/**
	 * sumaVida que aumente en 1 las vidas del jugador.
	 */
	public void sumaVida() {
		numeroVidas++;
		this.actualizaRecord();
	}
	
	/**
	 * Resta una vida al valor del atributo con las vidas y vuelve a
	 * llamar a muestraVidasRestantes.
	 */
	public boolean restaVida() {
		
		if (numeroVidas > 0) {
			numeroVidas--;
			return true;
		}
		else {
			System.out.print("JUEGO TERMINADO ");
		}
		return false;
	}
	
	public void reiniciarPartida() {
		this.numeroVidas = vidasIniciales;
		
	}
	
	public void actualizaRecord() {
		
		if(vidasRecord < this.numeroVidas){	
			System.out.println("RECORD BATIDO");
			vidasRecord = numeroVidas;
		}
		else if( vidasRecord == this.numeroVidas) {
			System.out.println("RECORD ALCANZADO");
		}
	}
	
	public static void main(String[] args) {
		
		Juego jugador1 = new Juego(5, 20);
		Juego jugador2 = new Juego(1, 34);
		
		System.out.println(jugador1.getNumeroVidas());
		
		jugador1.restaVida();
		System.out.println(jugador1.getNumeroVidas());

		System.out.println(jugador2.getNumeroVidas());
		System.out.println(jugador1.getNumeroVidas());

		
	}
	
	
	
	
}
