package app;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
	static Scanner ent = new Scanner(System.in);
	public static void main(String[] args) {
		
		

	}
	
	public static void addContact() {
		
	}
	
	public static void buscarContacto() {
		System.out.println("¿Según qué vas a buscar el contacto?");
		System.out.println("1. Nombre \n 2. Número de teléfono \n 3. E-mail");
		int x = 0;
		boolean y = false;
		boolean z = false;
		while(!y && !z) {
			try {
				System.out.println("Introduce el número de tu elección:");
				x = ent.nextInt();
				ent.nextLine();
				y = true;
			}catch(InputMismatchException e) {
				System.out.println("Introduce un valor correcto.");
			}
			if(x > 3 || x < 1) {
				System.out.println("No hay tantas opciones disponibles.");
			}else {
				z = true;
			}
		}switch (x) {
			case 1: {
				System.out.println("Introduce el nombre que buscas:");
				String busqNombre = ent.nextLine().toLowerCase();
				boolean enconrtrado = false;
				for(Contacto c :listaContactos) {
					if(c.getNombre().toLowerCase().equalsIgnoreCase(busqNombre)) {
						c.toString();
						enconrtrado = true;
					}
				}if(!enconrtrado) {
					System.out.println("No se ha encontrado ningún "+ busqNombre+ ". ¿Quieres añadirlo? (S/N)");
					String elec = ent.nextLine().toLowerCase();
					if(elec.toLowerCase().equals("s")) {
						addContact();
					}else if(elec.toLowerCase().equals("n")) {
						System.out.println("Vale.");
					}
				}
			}case 2: {
				System.out.println("Introduce el número que buscas:");
				String busqNombre = ent.nextLine().toLowerCase();
				boolean enconrtrado = false;
				for(Contacto c :listaContactos) {
					if(c.getNombre().toLowerCase().equalsIgnoreCase(busqNombre)) {
						c.toString();
						enconrtrado = true;
					}
				}if(!enconrtrado) {
					System.out.println("No se ha encontrado ningún contacto con el número "+ busqNombre+ ". ¿Quieres añadirlo? (S/N)");
					String elec = ent.nextLine().toLowerCase();
					if(elec.toLowerCase().equals("s")) {
						addContact();
					}else if(elec.toLowerCase().equals("n")) {
						System.out.println("Vale.");
					}
				}
				
			}case 3: {
				System.out.println("Introduce el correo que buscas:");
				String busqNombre = ent.nextLine().toLowerCase();
				boolean enconrtrado = false;
				for(Contacto c :listaContactos) {
					if(c.getNombre().toLowerCase().equalsIgnoreCase(busqNombre)) {
						c.toString();
						enconrtrado = true;
					}
				}if(!enconrtrado) {
					System.out.println("No se ha encontrado ningún contacto con el correo "+ busqNombre+ ". ¿Quieres añadirlo? (S/N)");
					String elec = ent.nextLine().toLowerCase();
					if(elec.toLowerCase().equals("s")) {
						addContact();
					}else if(elec.toLowerCase().equals("n")) {
						System.out.println("Vale.");
					}
				}
				
			}
		}		
	}
	
	public static void eliminarContacto() {
			
	}
	
	public static void modificarContacto() {
		
	}

}
