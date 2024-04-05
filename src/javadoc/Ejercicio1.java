package javadoc;

/**
 * @author usuario
 * @version
 */
public class Ejercicio1 {

	//Propiedades de la instancia
	private String nombreCompleto;
	private int numeroFavorito;
	private String signoZodiaco;
	private String colorFavorito;
	
	/**
	 * Constructor del registro del concursante
	 * @param nombre del concursante
	 * @param numeroFavorito del concursante
	 * @param signoZodiaco del concursante
	 * @param colorFavorito del concursante
	 */
	public Ejercicio1(String nombreCompleto, int numeroFavorito, String signoZodiaco, String colorFavorito) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.numeroFavorito = numeroFavorito;
		this.signoZodiaco = signoZodiaco;
		this.colorFavorito = colorFavorito;
	}

	/**
	 * Getters
	 * @return
	 */
	public String getnombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * Setters
	 * @param nombre
	 */
	public void setnombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * Getters
	 * @return
	 */
	public int getNumeroFavorito() {
		return numeroFavorito;
	}

	/**
	 * Setters
	 * @param numeroFavorito
	 */
	public void setNumeroFavorito(int numeroFavorito) {
		this.numeroFavorito = numeroFavorito;
	}

	/**
	 * Getters
	 * @return
	 */
	public String getSignoZodiaco() {
		return signoZodiaco;
	}

	/**
	 * Setters
	 * @param signoZodiaco
	 */
	public void setSignoZodiaco(String signoZodiaco) {
		this.signoZodiaco = signoZodiaco;
	}

	/**
	 * Getters
	 * @return
	 */
	public String getColorFavorito() {
		return colorFavorito;
	}

	/**
	 * Setters
	 * @param colorFavorito
	 */
	public void setColorFavorito(String colorFavorito) {
		this.colorFavorito = colorFavorito;
	}

	@Override
	//ToString
	public String toString() {
		return "Ejercicio1 [nombre=" + nombreCompleto + ", numeroFavorito=" + numeroFavorito + ", signoZodiaco=" + signoZodiaco
				+ ", colorFavorito=" + colorFavorito + "]";
	}
	
	
	//Otros métodos de la instancia
	
	

}
