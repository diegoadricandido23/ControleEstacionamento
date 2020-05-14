/**
 * 
 */
package br.com.diego.geranciaestacionamento.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.geranciaestacionamento.domain.Carro;
import br.com.diego.geranciaestacionamento.domain.Motorista;
import br.com.diego.geranciaestacionamento.service.Estacionamento;

/**
 * @author dcandido
 *
 */
public class ExcutaTestes {
	
	public void iniciaTestes() {
		System.out.println("*********************");
		System.out.println("Iniciando Suite Teses");
		System.out.println("*********************\n");
		
		System.out.println("Iniciando -cadastraCarroComSucesso");
		cadastraCarroComSucesso(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroComSucesso\n");
		
		System.out.println("Iniciando -cadastraCarroMotoistaComTodosMaiores55Sucesso");
		cadastraCarroMotoistaComTodosMaiores55Sucesso(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroMotoistaComTodosMaiores55Sucesso\n");
		
		System.out.println("Iniciando -cadastraCarroMotoistaComUmMaior55Sucesso");
		cadastraCarroMotoistaComUmMaior55Sucesso(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroMotoistaComUmMaior55Sucesso\n");
		
		System.out.println("Iniciando -cadastraCarroMotoistaMaior55Sucesso");
		cadastraCarroMotoistaMaior55Sucesso(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroMotoistaMaior55Sucesso\n");
		
		System.out.println("Iniciando -cadastraCarroSemMotorista");
		cadastraCarroSemMotorista(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroSemMotorista\n");
		
		System.out.println("Iniciando -cadastraCarroSemPlaca");
		cadastraCarroSemPlaca(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroSemPlaca\n");
		
		System.out.println("Iniciando -cadastraCarroPlacaVazia");
		cadastraCarroPlacaVazia(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroPlacaVazia\n");
		
		System.out.println("Iniciando -cadastraCarroSemCor");
		cadastraCarroSemCor(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroSemCor\n");
		
		System.out.println("Iniciando -cadastraCarroCorVazia");
		cadastraCarroCorVazia(new Estacionamento());
		System.out.println("Finalizando -cadastraCarroCorVazia\n");
		
		System.out.println("Iniciando -cadastraMotoristaSemIdade");
		cadastraMotoristaSemIdade(new Estacionamento());
		System.out.println("Finalizando -cadastraMotoristaSemIdade\n");
		
		System.out.println("Iniciando -cadastraMotoristaSemHab");
		cadastraMotoristaSemHab(new Estacionamento());
		System.out.println("Finalizando -cadastraMotoristaSemHab\n");
		
		System.out.println("Iniciando -cadastraMotoristaHabInvalida");
		cadastraMotoristaHabInvalida(new Estacionamento());
		System.out.println("Finalizando -cadastraMotoristaHabInvalida\n");
		
	}
	
	private void cadastraCarroEstacionamentoLotadoSemIdadeMaior(final Estacionamento estacionamento) {
		retornaListaCarros(18, 10)
		.stream().forEach(t -> {
			try {
				estacionamento.estacionar(t);
			} catch (Exception e) {
				System.out.println("cadastraCarroEstacionamentoLotadoSemIdadeMaior: " + e.getMessage());
			}
		});
	}
	
	private void cadastraCarroEstacionamentoLotadoCom1IdadeMaior(final Estacionamento estacionamento) {
		retornaListaCarros(46, 10)
		.stream().forEach(t -> {
			try {
				estacionamento.estacionar(t);
			} catch (Exception e) {
				System.out.println("cadastraCarroEstacionamentoLotadoCom1IdadeMaior: " + e.getMessage());
			}
		});
	}
	
	private void cadastraCarroEstacionamentoLotadoComTodosIdadeMaior(final Estacionamento estacionamento) {
		retornaListaCarros(55, 10)
		.stream().forEach(t -> {
			try {
				estacionamento.estacionar(t);
			} catch (Exception e) {
				System.out.println("cadastraCarroEstacionamentoLotadoCom1IdadeMaior: " + e.getMessage());
			}
		});
	}
	
	private void cadastraCarroComSucesso(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(18, true, true);
			Carro carro = new Carro("AAA-0009", "Branco", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroComSucesso: " + e.getMessage());
		}
	}
	
	private void cadastraCarroMotoistaComTodosMaiores55Sucesso(final Estacionamento estacionamento) {
		try {
			cadastraCarroEstacionamentoLotadoComTodosIdadeMaior(estacionamento);
			Motorista motorista = new Motorista(20, true, true);
			Carro carro = new Carro("BBB-1111", "Preto", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroComSucesso: " + e.getMessage());
		}
	}
	
	private void cadastraCarroMotoistaComUmMaior55Sucesso(final Estacionamento estacionamento) {
		try {
			cadastraCarroEstacionamentoLotadoCom1IdadeMaior(estacionamento);
			Motorista motorista = new Motorista(20, true, true);
			Carro carro = new Carro("BBB-1111", "Preto", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroComSucesso: " + e.getMessage());
		}
	}
	
	private void cadastraCarroMotoistaMaior55Sucesso(final Estacionamento estacionamento) {
		try {
			cadastraCarroEstacionamentoLotadoSemIdadeMaior(estacionamento);
			Motorista motorista = new Motorista(56, true, true);
			Carro carro = new Carro("BBB-1111", "Preto", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroComSucesso: " + e.getMessage());
		}
	}
	
	private void cadastraCarroSemMotorista(final Estacionamento estacionamento) {
		try {
			Carro carro = new Carro("AAA-0009", "Branco", null);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroSemMotorista: " + e.getMessage());
		}
	}
	
	private void cadastraCarroSemPlaca(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(18, true, true);
			Carro carro = new Carro(null, "Branco", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroSemPlaca: " + e.getMessage());
		}
	}

	private void cadastraCarroPlacaVazia(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(18, true, true);
			Carro carro = new Carro("", "Branco", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroPlacaVazia: " + e.getMessage());
		}
	}
	
	private void cadastraCarroSemCor(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(18, true, true);
			Carro carro = new Carro("AAA-0009", null, motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroSemCor: " + e.getMessage());
		}
	}

	private void cadastraCarroCorVazia(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(18, true, true);
			Carro carro = new Carro("AAA-0009", "", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraCarroCorVazia: " + e.getMessage());
		}
	}
	
	private void cadastraMotoristaSemIdade(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(17, false, false);
			Carro carro = new Carro("AAA-0009", "Branco", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraMotoristaSemIdade: " + e.getMessage());
		}
	}
	
	private void cadastraMotoristaSemHab(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(20, false, true);
			Carro carro = new Carro("AAA-0009", "Branco", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraMotoristaSemHab: " + e.getMessage());
		}
	}
	
	private void cadastraMotoristaHabInvalida(final Estacionamento estacionamento) {
		try {
			Motorista motorista = new Motorista(20, true, false);
			Carro carro = new Carro("AAA-0009", "Branco", motorista);
			estacionamento.estacionar(carro);
		} catch (Exception e) {
			System.out.println("cadastraMotoristaHabInvalida: " + e.getMessage());
		}
	}
	
	private List<Carro> retornaListaCarros(int idade, int qtdCarros) {
		List<Carro> carros = new ArrayList<>();
		for(int i = 0; i < qtdCarros; i++) {
			Motorista motorista = new Motorista(idade + i, true, true);
			Carro carro = new Carro("AAA-000" + i, "Branco", motorista);
			carros.add(carro);
		}
		return carros;
	}
}
