package br.senai.sp.jandira.model;

public class Conta {

	public String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;
	
	//Método construtor 
	
	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	public void depositar(double valorDeposito) {

		if (valorDeposito <= 0) {

			System.out.println("Valor incorreto, impossível efetuar esse depósito !!");
		
		} else {

			System.out.println("Depósito realizado !!");
			saldo += valorDeposito;

		}

	}

	public boolean sacar(double valorSaque) {
		
		if (valorSaque < 0) {
			
			System.out.println("Valor incorreto, impossível sacar essa quantia !!");
			return false;
			
		}else if (valorSaque > saldo) {
			
			System.out.println("Saldo insuficiente, impossível sacar essa quantia !!");
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
			System.out.println("Transferência efetuada !!");
		}else {
			System.out.println("Não foi possível efetuar a transferência !!");
		}
		

	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
