package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// DEFINIR AGÊNCIA
		Agencia mainAgencia = new Agencia();
		mainAgencia.setNumeroAgencia("4214-9");
		
		
		
		// CRIAR A CLIENTE MARIA
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("Maria@ig.com.br");
		clienteMaria.setSalario(1500.00);
		
		
		// CRIAÇÃO DA CONTA DA MARIA
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(mainAgencia);
		contaMaria.depositar(500.0);
		contaMaria.setTipo(TipoConta.CORRENTE);
		System.out.println("----->" + contaMaria.getTipo()); 
		
		
		// CRIAR O CLIENTE PEDRO
		
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("Pedro@ig.com.br");
		clientePedro.setSalario(2500.00);
		
		// CRIAÇÃO DA CONTA DO PEDRO
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200.0);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(mainAgencia);
		System.out.println("----->" + contaPedro.getTipo());
		
		// CRIAR A CLIENTE ANA
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("Ana@ig.com.br");
		clienteAna.setSalario(5000.00);
		
		// CRIAÇÃO DA CONTA DA ANA
		Conta contaAna = new Conta("23145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000.0);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(mainAgencia);
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
