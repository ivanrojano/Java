package javadoc.practicar;

import java.util.Scanner;

/**
 * Tenemos que crear una aplicación simple para gestionar una biblioteca de libros.
 * @author Ivan Rojano
 * @version
 * @see Ejercicio 1
 */
public class Ejercicio1 {

	//Propiedades de instancia
	private String tituloLibro;
	private String autorLibro;
	private int añoPublicacionLibro;
	
	/**
	 * Constructor de la clase Ejercicio 1 ( Libro ).
	 * @param tituloLibro.
	 * @param autorLibro.
	 * @param añoPublicacion
	 */
	public Ejercicio1(String tituloLibro, String autorLibro, int añoPublicacionLibro) {
		super();
		this.tituloLibro = tituloLibro;
		this.autorLibro = autorLibro;
		this.añoPublicacionLibro = añoPublicacionLibro;
	}

	/**
	 * Getters del titulo del Libro.
	 * @return the tituloLibro.
	 */
	public String getTituloLibro() {
		return tituloLibro;
	}

	/**
	 * Setters del titulo del libro.
	 * @param tituloLibro the tituloLibro to set.
	 */
	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	/**
	 * Getters del autor del libro.
	 * @return the autorLibro.
	 */
	public String getAutorLibro() {
		return autorLibro;
	}

	/**
	 * Setters autor del libro.
	 * @param autorLibro the autorLibro to set.
	 */
	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}

	/**
	 * Getters año de publicación del libro.
	 * @return the añoPublicacionLibro.
	 */
	public int getAñoPublicacionLibro() {
		return añoPublicacionLibro;
	}

	/**
	 * Setters año de publicación del libro.
	 * @param añoPublicacionLibro the añoPublicacionLibro to set.
	 */
	public void setAñoPublicacionLibro(int añoPublicacionLibro) {
		this.añoPublicacionLibro = añoPublicacionLibro;
	}

	@Override
	//toString
	public String toString() {
		return "Ejercicio1 [tituloLibro=" + tituloLibro + ", autorLibro=" + autorLibro + ", añoPublicacionLibro="
				+ añoPublicacionLibro + "]";
	}
	
	/**
	 * Método main, donde vamos a ver los aspectos de libro.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creamos un numero Libro
		Ejercicio1 libroUno;
		libroUno = new Ejercicio1("LA ROSA", "CERVANTES", 1982);
		
		//Salida por pantalla
		System.out.printf("El autor del libro es: %s \n", libroUno.autorLibro);
		System.out.printf("El titulo  del libro es: %s \n", libroUno.tituloLibro);
		System.out.printf("El año de publicación del libro es: %d \n ", libroUno.añoPublicacionLibro);
		System.out.println(libroUno);
	}
		
}
/*
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	IvanRojanoAnguita numero;
	numero = new IvanRojanoAnguita();
	
	System.out.println(numero.numeroAleatorio(2, 4));
	
	IvanRojanoAnguita  persona;
	persona = new IvanRojanoAnguita();
	int edadPersona;

	
	
	System.out.println("Hola, ¿Cuantos años tienes?");
	edadPersona = Integer.parseInt(s.nextLine());
	
	System.out.println(persona.esMayorDeEdad(edadPersona));
	
	
	s.close();
}
*/
