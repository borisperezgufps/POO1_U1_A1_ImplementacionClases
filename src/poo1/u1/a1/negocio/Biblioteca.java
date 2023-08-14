package poo1.u1.a1.negocio;

public class Biblioteca {

	/*
	 * -----------------------------------
	 * ATRIBUTOS
	 * -----------------------------------
	 */	
	private Libro[] libros;
	private final int DIASPRESTAMO = 7;
	
	/*
	 * -----------------------------------
	 * MÉTODOS
	 * -----------------------------------
	 */
	
	public Biblioteca() {
		libros = new Libro[6];
		// Para qué se invoca este método?
		llenarBiblioteca();		
	}
	
	/**
	 * Se encarga de buscar el libro, revisar si está disponible, 
	 * y prestarlo.
	 * @param idLibro
	 */
	public void prestarLibro(String idLibro) throws Exception {
		
		boolean seHizoPrestamo = false; // Para qué se usa esta variable? Revise el código.
		
		for(int t=0;t<libros.length;t++) {			
			if(libros[t]!=null) { // Por qué debe hacerse esta pregunta?
				Libro lib = libros[t];
				if(lib.getId().equals(idLibro)) {
					if(!lib.isPrestado()) {
						lib.setPrestado(true);
						seHizoPrestamo = true;
						break;
					}else {
						throw new Exception("El libro se encuentra prestado. Espere que sea devuelto.");
					}
				}
			}
		}
		
		if(!seHizoPrestamo)
			throw new Exception("El libro no se encontró. Por favor, verifique el identificador.");
		
	}
	
	/**
	 * Se encarga de buscar un libro que se prestó, validar si es de colección, y calcular
	 * la multa, en caso de que haya.
	 * @param idLibro
	 * @param diasPrestado
	 * @throws Exception
	 */
	public void devolverLibro(String idLibro, int diasPrestado) throws Exception {
		for(int t=0;t<libros.length;t++) {			
			if(libros[t]!=null) { // Por qué debe hacerse esta pregunta?
				Libro lib = libros[t];
				if(lib.getId().equals(idLibro)) {
					if(lib.isPrestado()) {
						lib.setPrestado(false);
						
						if(diasPrestado>DIASPRESTAMO) {
							double valorMulta = 0;
							
							int diasMulta = diasPrestado - DIASPRESTAMO;
							
							if(lib.isColeccion()) 
								valorMulta = diasMulta * 3000;
							else
								valorMulta = diasMulta * 1000;
							
							// Por qué se lanzó un mensaje? Se hubiera podido retornar el valor de la multa?
							// Cuándo es necesario retornar el valor?
							throw new Exception("Este libro generó multa por vencimiento de días. El valor a pagar es: "+valorMulta);
						}
							
					}else
						throw new Exception("Este libro no está prestado. Verifique el identificador.");
				}
			}
		}		
		
	}
	
	/*
	 * -----------------------------------
	 * MÉTODOS AUXILIARES
	 * -----------------------------------
	 */
	
	public void llenarBiblioteca() {
		
		Libro lib = new Libro("001", "La ausencia de un profesor", true);		
		libros[0] = lib;
		
		lib = new Libro("002", "Aprenda programación en 2 días", false);		
		libros[1] = lib;
		
		lib = new Libro("003", "Por qué quise estudiar esto?", false);		
		libros[2] = lib;
		
		lib = new Libro("004", "Un enfoque práctico para superar el curso", true);		
		libros[3] = lib;
		
		lib = new Libro("005", "Una luz al final. Mi experiencia luego de casi perder el curso", false);		
		libros[4] = lib;
		
		lib = new Libro("006", "Ahora soy mejor persona", false);		
		libros[5] = lib;
	}
	
}
