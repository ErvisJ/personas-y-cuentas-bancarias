package com.ervisjelvez;
import com.ervisjelvez.clases.Persona;
import com.ervisjelvez.clases.CuentaBancaria;

public class Aplicacion {

	public static void main(String[] args) {
		
		/*int numeroCuentaAleatorio = 0;
		numeroCuentaAleatorio = (int)(Math.random()*999999)+100000;*/
		
		Persona persona1 = new Persona("Luis", 20);
		Persona persona2 = new Persona("Cody", 21);
		Persona persona3 = new Persona("Maximus", 22);
		
		persona1.despliegaInformacion();
		persona2.despliegaInformacion();
		persona3.despliegaInformacion();
		System.out.println("-----------");
		
		CuentaBancaria cuenta1 = new CuentaBancaria(5000, persona1);
		CuentaBancaria cuenta2 = new CuentaBancaria(6000,persona2);
		CuentaBancaria cuenta3 = new CuentaBancaria(7000,persona3);
		
		cuenta1.depositar(5000);
		cuenta2.depositar(2000);
		cuenta3.retirar(4000);
		
		cuenta1.despliegaInformacion();
		cuenta2.despliegaInformacion();
		cuenta3.despliegaInformacion();
		System.out.println("-------------");
		// Imprimir información de todas las cuentas
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
		
	}
	
}
