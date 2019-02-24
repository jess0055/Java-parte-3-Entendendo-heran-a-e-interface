//Gerente é um Funcionario, Gerente herda da classe Funcionario
//Assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
private AutenticacaoUtil autenticador;
	
	public Gerente() {
		
		this.autenticador = new AutenticacaoUtil ();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	
	/* REESCRITA DE METODO
	public double getBonificacao() { //método reescrito
		 return super.salario; //super ao inves de this para informar que atributo vem da classe mae
	}*/	
	/*	
	public double getBonificacao() { 
		 return super.getBonificacao() + //reaproveitar metodo classe mae deve-se usar super
				 getSalario();//usar metodos getters e setters manter atributo como privado
	} */

}
