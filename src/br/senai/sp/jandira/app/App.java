package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Cria��o da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.getNumeroAgencia("4214-9");
		contaMaria.depositar(500.0);
		contaMaria.setTipo(TipoConta.CORRENTE);
		System.out.println("----->" + contaMaria.getTipo()); 
		
		// Cria��o da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";

		contaPedro.depositar(200.0);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.getNumeroAgencia ("4214-9");
		System.out.println("----->" + contaPedro.getTipo());
		
		// Cria��o da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(2000.0);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.getNumeroAgencia ("4214-9");
		System.out.println("----->" + contaAna.getTipo());
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		// Depositar 100 reais na conta da Maria :)
		
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		// Sacar 100 reais da conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		// Transferir 200 reais da conta da Maria para a conta do Pedro
		
		contaMaria.transferir(contaPedro, 200);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		
		
	}

}
