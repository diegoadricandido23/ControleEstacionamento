/**
 * 
 */
package br.com.diego.geranciaestacionamento.domain;

/**
 * @author dcandido
 *
 */
public class Motorista {
	
	private Integer idade;
	private Boolean habilitado;
	private Boolean habilitacaoValida;
	
	public Motorista(Integer idade, Boolean habilitado, Boolean habilitacaoValida) {
		super();
		this.idade = idade;
		this.habilitado = habilitado;
		this.habilitacaoValida = habilitacaoValida;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	public Boolean isHabilitacaoValida() {
		return habilitacaoValida;
	}
	public void setHabilitacaoValida(Boolean habilitacaoValida) {
		this.habilitacaoValida = habilitacaoValida;
	}
	@Override
	public String toString() {
		return "Motorista [idade=" + idade + ", habilitado=" + habilitado + ", habilitacaoValida="
				+ habilitacaoValida + "]";
	}
}
