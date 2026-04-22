package app;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();

	public static void main(String[] args) {
		
		

	}
	
	public static void addContact() {
		
	}
	
	public static void buscarContacto() {
		
	}
	
	public static void eliminarContacto() {
		System.out.println("Nommbre de la persona que quieres eliminar");
		String nombre = null;
		Iterator<Contacto> it = listaContactos.iterator();
		while (it.hasNext()) {
			Contacto contacto =it.next();
			if(contacto.getNombre()==nombre) {
				it.remove();
			}
		}
		
		
	}
	
	public static void modificarContacto() {
		
	}

}
