/*
 * � assim que funciona o polimorfismo, � poss�vel comunicarmos com o Gerente a partir de uma refer�ncia gen�rica
 * Ao executarmos o c�digo, sempre ser� chamado o m�todo espec�fico, � esta a real vantagem do polimorfismo.
 */
public class ControleBonificacao {

	private double soma;
	
	
	public void registra (Funcionario f) {//recebe uma refer�ncia do tipo Funcionario, como todos s�o funcion�rios, podemos utilizar a refer�ncia mais gen�rica
		double boni = f.getBonificacao();//ser� chamado metodo especifico do objeto
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
