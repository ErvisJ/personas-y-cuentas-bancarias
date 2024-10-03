package com.ervisjelvez.clases;

public class Persona {
	private String nombre;
	private int edad;
	//constructor
	public Persona(String nombre, int edad) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
	}
	//mostrar info
	public void despliegaInformacion(){
	System.out.println("Nombre:" + this.nombre);
	System.out.println("Edad:" + this.edad);
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
