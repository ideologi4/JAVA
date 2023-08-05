package com.java;

public class Conta {

	int agencia;
	int numero;
	double saldo;


	public Conta () {

	}


	Cliente cliente = new Cliente();



	public Conta ( int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo; 


	}


	public void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}


	public void retirar (int valor) {
		this.saldo = this.saldo - valor;	
	}


	public double verificarSaldo() {
		return saldo;

	}

	public void retirar (double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
}	




