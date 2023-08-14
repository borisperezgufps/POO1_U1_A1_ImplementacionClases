package poo1.u1.a1.negocio;

public class Libro {

	/*
	 * -----------------------------------
	 * ATRIBUTOS
	 * -----------------------------------
	 */
	private String id;
	private String titulo;
	private boolean prestado;
	private boolean coleccion;
	
	/*
	 * Lo ideal es manejarlo como fecha, pero la implementación siempre
	 * se probará el mismo día, entonces no tendría sentido.
	 */
	// private Calendar fechaPrestamo;
	
	/*
	 * -----------------------------------
	 * MÉTODOS
	 * -----------------------------------
	 */
	
	public Libro(String id, String titulo, boolean coleccion) {
		this.id = id;
		this.titulo = titulo;
		this.coleccion = coleccion;
	}
	
	public boolean isColeccion() {
		return coleccion;
	}
	
	public void setColeccion(boolean coleccion) {
		this.coleccion = coleccion;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
	
}
