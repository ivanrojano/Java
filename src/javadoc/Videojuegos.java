package javadoc;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

/**
 * Clase basada en un videojuego con los métodos basicos para almacenar y gestionar un <strong>videoclub</strong>.
 * 
 * @author usuario
 * @version 0.1
 * @see Ejercicio1
 */
public class Videojuegos {

	/**
	 * El título en el formato texto en el videojuego (máx. dieciseis letras).
	 */
	public String titulo;
	
	/**
	 * El género de clasificación al que pertenece el videojuego (FPS, RPG, BATTLE...).
	 */
	 public String genero;
	
	/**
	 * Puntuación ponderada sobre páginas de prensa ponderadas especializada con un peso entre un 50%-50% jugadores - opiniones.
	 */
	 public float puntuacionMedia;
	
	/**
	 * La fecha de lazamiento oficial en nuetsra región.
	 */
	public Date fechaLanzamiento;

	/**
	 * @return el titulo del videojuego
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the puntuacionMedia
	 */
	public float getPuntuacionMedia() {
		return puntuacionMedia;
	}

	/**
	 * @param puntuacionMedia the puntuacionMedia to set
	 */
	public void setPuntuacionMedia(float puntuacionMedia) {
		this.puntuacionMedia = puntuacionMedia;
	}

	/**
	 * @return the fechaLanzamiento
	 */
	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	/**
	 * @param fechaLanzamiento the fechaLanzamiento to set
	 */
	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	/**
	 * Incremento la puntuación global en una unidad.
	 * @return el valor actualizado de la puntución media.
	 */
	public float incPuntuacion() {
		puntuacionMedia++;
		return puntuacionMedia;
	}
	
	/**
	 * Comparamos dos juegos en base a su puntuacion media y se devuelve el juego con mayor calificación/puntucación.
	 * @param juegosAComparar un juego diferente al mio para compararlo.
	 * @return el juego con mayor calificación
	 */
	public Videojuegos comparar(Videojuegos juegosAComparar) {
		if (juegosAComparar.puntuacionMedia > this.puntuacionMedia) {
			return juegosAComparar;
			
		}
		else
			return this;
	}
	
	/**
	 * Verificar si el videojuego es reciente basandose en la fecha de lanzamiento
	 * Se considera reciente un videojuego lanzado en nuestra región en los últimos 6 meses.
	 * @return true si el videojuego es reciente, false si no lo es.
	 */
	public boolean esReciente() {
		LocalDate fechaAntigua = LocalDate.of(2020, Month.APRIL, 31);
		LocalDate fechaNueva = LocalDate.of(2023, Month.DECEMBER, 15);
		Period period = Period.between(fechaAntigua, fechaNueva);
		System.out.println(period.getMonths());

		if (period.getMonths() >=  6) {
			return true;
		}
		else {
			return false;

		}
	}
	
	/**
	 * Verificar si el videojuego es reciente basandose en la fecha de lanzamiento
	 * Se considera reciente un videojuego lanzado en nuestra región en los últimos 6 meses.
	 * @return true si el videojuego es reciente, false si no lo es.
	 */
	public boolean esNuevo(){
		Date fechaActual = new Date();
		long fechaACtual = fechaActual.getTime();
		long fechaLanzamientoConvertida = fechaLanzamiento.getTime();
		long fechaRestada = fechaACtual - fechaLanzamientoConvertida;
		long seisMesesMillis = 6 * 30 * 24 * 60 * 60 * 1000;
		
		if (fechaRestada > seisMesesMillis ) {
			return false;
		}
		else {
			return true;
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		Videojuegos videojuegoUNo;
		
		videojuegoUNo = new Videojuegos();

		System.out.println(videojuegoUNo.esNuevo());
	}
}

