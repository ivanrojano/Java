package tema3;

public class Libro {

	//Propiedades de instancia
	private String isbn;
	private String titulo;
	private String autor;
	private int numerosPaginas;
	
	/**
	 * Constructor de la clase Libro
	 * @param isbnL
	 * @param titulo
	 * @param autor
	 * @param numerosPaginas
	 */
	public Libro(String isbn, String titulo, String autor, int numerosPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numerosPaginas = numerosPaginas;
	}
	
	public void mostrar() {
		System.out.printf("El %s con %s creado por el %s tiene %d páginas\n", titulo, isbn, autor, numerosPaginas);
	}
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("0-7645-2641-3", "La Casa", "Pio Baroja", 200);
		Libro libro2 = new Libro("0-7879-3421-5", "Los rosales", "Baroja", 300);
		
		libro1.mostrar();
		libro2.mostrar();
	}
	
	
}
