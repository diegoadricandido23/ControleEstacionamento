/**
 * 
 */
package br.com.diego.geranciaestacionamento.domain;

/**
 * @author dcandido
 *
 */
public class Carro {
	
	private String placa;
	private String cor;
	private Motorista motorista;
	
	public Carro(String placa, String cor, Motorista motorista) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.motorista = motorista;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", cor=" + cor + ", motorista=" + motorista + "]";
	}
}
