package poo1.u1.a1.cliente;

import poo1.u1.a1.negocio.Biblioteca;

public class Cliente {

	public static void main(String[] args) throws Exception  {
		Biblioteca bib = new Biblioteca();
		
		/*
		 * BLOQUE DE EJECUCIÓN EXITOSA
		 */
		
		System.out.println("Prestando libros");
		
		bib.prestarLibro("002");
		bib.prestarLibro("004");
		bib.prestarLibro("006");
		
		System.out.println("Retornando libros");
		
		bib.devolverLibro("004", 3);
		bib.devolverLibro("002", 1);
		bib.devolverLibro("006", 4);
		
		/*
		 * BLOQUE DE GENERACIÓN DE EXCEPCIONES
		 * Descomentaree el código y ejecute para ver
		 * el funcionamiento.
		 */
		
//		System.out.println("Bloque 1");
//		bib.prestarLibro("002");		
//		bib.prestarLibro("002");
		
//		System.out.println("Bloque 2");
//		bib.prestarLibro("002");		
//		bib.devolverLibro("004", 3);
		
//		System.out.println("Bloque 3");
//		bib.prestarLibro("008");		
		
//		System.out.println("Bloque 4");
//		bib.prestarLibro("001");	
//		bib.devolverLibro("001", 15);
		
		
	}
	
}
