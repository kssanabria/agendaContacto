package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
	Scanner ent = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();

	}

	public static void addContact() {
		Contacto pedro = new Contacto("Pedro", "666777888", "pedro@ceinmark.net");
		listaContactos.add(pedro);
		Contacto jaime = new Contacto("Jaime", "888777666", "jaime@ceinmark.net");
		listaContactos.add(jaime);
		Contacto daniel = new Contacto("Daniel", "111222333", "daniel@ceinmark.net");
		listaContactos.add(daniel);
		Contacto eduardo = new Contacto("Eduardo", "333222111", "eduardo@ceinmark.net");
		listaContactos.add(eduardo);
		Contacto marco = new Contacto("Marco", "555666777", "marco@ceinmark.net");
		listaContactos.add(marco);
		Contacto chema = new Contacto("Chema", "777666555", "chema@ceinmark.net");
		listaContactos.add(chema);

	}

	public static void buscarContacto() {

	}

	public static void eliminarContacto() {

	}

	public static void modificarContacto() {

	}

}
