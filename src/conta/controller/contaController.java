package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class contaController implements ContaRepository{
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		
			var contas = buscarNaCollection(numero);
		
		if(contas != null) {
			contas.visualizar();
		}else {
				System.out.println("A conta número"+ numero +" não foi encontrado");
			}
		}
		
	

	@Override
	public void listarTodas() {
		
		for (var contas : listaContas ) {
			
			contas.visualizar();
		}
		
		
	}

	@Override
	public void cadastrar(Conta conta) {
		
		listaContas.add(conta);
		System.out.println("A conta: "+conta.getNumero()+ " Foi criado com sucesso!");
	
		
	}

	@Override
	public void atualizar(Conta conta) {
		
		var buscaConta = buscarNaCollection(numero);
		
		if(buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("A conta "+ conta.getNumero()+ " Foi atualizada com sucesso!");
		}else {
			System.out.println("A conta" + conta.getNumero()+ " Não foi encontrado");
		}
		
	}

	@Override
	public void deletar(int numero) {
		
		var conta = buscarNaCollection(numero);
		if (conta != null) {
			if(listaContas.remove(conta) == true) {
				System.out.println("A conta numero: "+numero+" Foi deletada com sucesso!");
			}else {
				System.out.println("A conta numero: "+numero+" Não foi encontrada");
			}
		}
		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if(conta.sacar(valor) == true) {
				System.out.println("\n O saque na conta "+ numero+" foi realizado com sucesso");
			}else {
				System.out.println("A conta: "+ numero +"Não foi encontrada");
			}
		}
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if(conta != null) {
			conta.depositar(valor);
				System.out.println("\n O saque na conta "+ numero+" foi realizado com sucesso");
			}else {
				System.out.println("A conta: "+ numero +"Não foi encontrada");
			}
		}

		
																							
	

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
			
		if(contaOrigem != null && contaDestino != null) {
			
			if(contaOrigem.sacar(valor)==true) {
				contaDestino.depositar(valor);
				System.out.println("\n a transferencia foi realizada com sucesso");
			}else {
				System.out.println("A conta: "+ numero +"Não foi encontrada");
			}
				
			}
		}
	
	public int gerarNumero() {
		
		return ++ numero;
	}
			
		
	
	
	public Conta buscarNaCollection(int numero) {
		for (var contas : listaContas) {
			if (contas.getNumero() == numero) {
				return contas;
			}
			
		}
		return null;

}}
