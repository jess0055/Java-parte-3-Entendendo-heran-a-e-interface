/*
package code.smells;

//	há três métodos que executam a mesma função, sendo que para cada tipo, temos um método específico, 
//	o que nos resulta em um código verboso. Cada vez que um novo tipo de funcionário for inserido, 
//	um novo método específico será criado - não queremos que isto aconteça	
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