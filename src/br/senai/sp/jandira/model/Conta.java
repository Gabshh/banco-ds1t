package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public Cliente titular;
	private double saldo;
	
	//M�todo construtor 
	
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	public void setTipo (TipoConta tipo) {
		this.tipo = tipo; 
	 }
	
	public TipoConta getTipo () {
		return tipo;
	}
	
	public void setNumeroAgencia (String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public void getNumeroAgencia (String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	
	public void depositar(double valorDeposito) {

		if (valorDeposito <= 0) {

			System.out.println("Valor incorreto, imposs�vel efetuar esse dep�sito !!");
		
		} else {

			System.out.println("");
			saldo += valorDeposito;

		}

	}

	public boolean sacar(double valorSaque) {
		
		if (valorSaque < 0) {
			
			System.out.println("Valor incorreto, imposs�vel sacar essa quantia !!");
			return false;
			
		}else if (valorSaque > saldo) {
			
			System.out.println("Saldo insuficiente, imposs�vel sacar essa quantia !!");
			return false;
			
		}else {
			System.out.println("Saque realizado !!");
			saldo -= valorSaque;
			return true;
		}
		
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
			System.out.println("\nTransfer�ncia efetuada !!");
		}else {
			System.out.println("N�o foi poss�vel efetuar a transfer�ncia !!");
		}
		

	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
