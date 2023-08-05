package com.java;

public class TesteConta {

	public static void main(String[] args) {

		Conta cc = new Conta();   // (CC) = CONTA CORRENTE 
		Conta contaPoupança = new Conta();
		Conta contaInvestimento = new Conta();

		cc.numero = 11;
		cc.saldo = 20.5;
		cc.agencia = 13;
		cc.cliente.nome = "Leandro";
		cc.cliente.idade = 36;


		contaPoupança.numero = 22;
		contaPoupança.saldo = 30;
		contaPoupança.cliente.nome = "Isabela";
		contaPoupança.cliente.idade = 24;


		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Joana";
		contaInvestimento.cliente.idade = 40;



		System.out.println("Bem vindo, aqui nessa plataforma voçê terá acesso a sua conta bancaria");

		cc.depositar(500);

		cc.retirar(40); 

		System.out.println(cc.verificarSaldo());



	}
}
