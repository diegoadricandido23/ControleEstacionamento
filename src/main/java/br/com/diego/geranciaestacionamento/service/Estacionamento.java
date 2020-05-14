/**
 * 
 */
package br.com.diego.geranciaestacionamento.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang.StringUtils;

import br.com.diego.geranciaestacionamento.domain.Carro;
import br.com.diego.geranciaestacionamento.domain.Motorista;

/**
 * @author dcandido
 *
 */
public class Estacionamento {
	
	private static final Integer LOTACAO = 10;
	private List<Carro> carros = new ArrayList<Carro>();
	
	public void estacionar(final Carro carro) throws Exception {
		if(temosVagas()) {
			if(isPermiteEntrada(carro)) {
				carros.add(carro);
			}
		} else {
			tratarEstacionamentoLotado(carro);
		}
	}
	
	private void tratarEstacionamentoLotado(final Carro carro) throws Exception {
		if(isPermiteEntrada(carro)) {
//			Caso o motorista do primeiro carro estacionado tenha uma idade superior a 55 anos,
//			será escolhido o próximo motorista abaixo dos 55 anos. * Caso todos os motoristas, 
//			dentro do estacionamento, tenham mais de 55 anos e chegue um motorista, ele não 
//			conseguirá estacionar.
			carros.forEach(System.out::println);
			final boolean realizaSaida = 
					carros.stream()
						.map(Carro::getMotorista)
						.sorted(Comparator.comparingInt(Motorista::getIdade))
						.findFirst()
						.filter(c -> c.getIdade() < 55)
						.isPresent();
			if(realizaSaida) {
				carros.remove(0);
				System.out.println("Removeu =======================");
				carros.add(carro);
				carros.forEach(System.out::println);
			} else {
				throw new Exception("Estmos Lotados");
			}
		}
	}
	
	public List<Carro> listarCarrosEstacionados() {
		return this.carros;
	}
	
	public int lotacao() {
		return this.carros.size();
	}
	
	public boolean temosVagas() {
		return carros.size() < LOTACAO;
	}
	
	private boolean isPermiteEntrada(final Carro carro) throws Exception {
		return verificarDadosVeiculo(carro) && verificarDadosMotorista(carro.getMotorista());
	}
	
	private boolean verificarDadosVeiculo(final Carro carro) throws Exception {
		if( Objects.nonNull(carro) && Objects.nonNull(carro.getMotorista()) &&
			StringUtils.isNotBlank(carro.getCor()) && StringUtils.isNotBlank(carro.getPlaca())) {
			return true;
		}
		throw new Exception("Informações do Carro Inválidas");
	}
	
	private boolean verificarDadosMotorista(final Motorista motorista) throws Exception {
		if( Objects.nonNull(motorista) && motorista.getIdade() >= 18 &&
				motorista.isHabilitado() && motorista.isHabilitacaoValida()) {
			return true;
		}
		throw new Exception("Informações do Motorista Inválidas");
	}
}
