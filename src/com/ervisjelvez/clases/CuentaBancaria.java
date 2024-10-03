package com.ervisjelvez.clases;
import java.util.ArrayList;
import java.util.Random;


public class CuentaBancaria{
	private double saldo;
	private Persona titular;
	private int numeroCuenta;
	//private ArrayList<CuentaBancaria> listaCuentasBancarias;
	private static ArrayList<CuentaBancaria> listaCuentasBancarias = new ArrayList<CuentaBancaria>();
	public int generarNumeroAleatorio;

	 public CuentaBancaria(double saldo, Persona titular) {
	        this.saldo = saldo;
	        this.titular = titular;
	        this.numeroCuenta = numeroCuentaAleatorio();
	        listaCuentasBancarias.add(this);
	}
	 //numero aleatorio
	 public int numeroCuentaAleatorio(){
		 return (int)(Math.random()*999999)+1000000;
	 }
	 
	 //depositar
	 public void depositar(double monto) {
		 this.saldo += monto;
	 }
	 //retirar
	 public void retirar(double monto) {
		 this.saldo -= monto;
	 }
	 
	//despliegaInformacion()
	public void despliegaInformacion(){
		System.out.println("Número de cuenta: " + this.numeroCuenta);
        titular.despliegaInformacion();
        System.out.println("Saldo: $" + this.saldo);
	}
	
	//info de todas las cuentas
	public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("Información de todas las cuentas:");
        for (CuentaBancaria cuenta : listaCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("---------------------");
        }
    }
	
	
	
	
	//getters setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public ArrayList<CuentaBancaria> getListaCuentasBancarias() {
		return listaCuentasBancarias;
	}
	public void setListaCuentasBancarias(ArrayList<CuentaBancaria> listaCuentasBancarias) {
		this.listaCuentasBancarias = listaCuentasBancarias;
	}
	
	
}

	
	
	

	

