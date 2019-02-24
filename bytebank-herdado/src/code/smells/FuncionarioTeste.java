package code.smells;
//Esta abordagem, de termos todas as informações concentradas em uma única classe, não consegue ser sustentada por muito tempo
//a partir do momento que nosso sistema ganha complexidade, ela para de funcionar.

public class FuncionarioTeste {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0;//0-comum 1-gerente 2-diretor
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() { //para controlar o tipo de função temos muitos ifs, e isto também não é uma boa prática
		if(this.tipo ==0) {
			 return this.salario * 0.1;
		}else if(this.tipo ==1) {
			return this.salario;
		}else {
			 return this.salario + 1000;
		}
		
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getTipo() {//se quisermos criar um getTipo que nos retorne um String Teríamos que repetir todos os ifs criados 
		return tipo;   //em getBonificacao no corpo do getTipo, para podermos devolver o String adequado para cada tipo
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}