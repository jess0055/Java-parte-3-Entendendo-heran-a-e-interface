/*
package code.smells;

//	h� tr�s m�todos que executam a mesma fun��o, sendo que para cada tipo, temos um m�todo espec�fico, 
//	o que nos resulta em um c�digo verboso. Cada vez que um novo tipo de funcion�rio for inserido, 
//	um novo m�todo espec�fico ser� criado - n�o queremos que isto aconte�a	
public class ControleBonificacao {

	private double soma;
	
	public void registra (Gerente g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public void registra (EditorTexto e) {
		double boni = e.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
*/