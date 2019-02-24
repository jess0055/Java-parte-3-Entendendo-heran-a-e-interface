/*
 * É assim que funciona o polimorfismo, é possível comunicarmos com o Gerente a partir de uma referência genérica
 * Ao executarmos o código, sempre será chamado o método específico, é esta a real vantagem do polimorfismo.
 */
public class ControleBonificacao {

	private double soma;
	
	
	public void registra (Funcionario f) {//recebe uma referência do tipo Funcionario, como todos são funcionários, podemos utilizar a referência mais genérica
		double boni = f.getBonificacao();//será chamado metodo especifico do objeto
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
