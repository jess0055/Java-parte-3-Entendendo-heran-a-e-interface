//n�o posso mais instacinar objetos dessa classe
public abstract class Funcionario {//abstract relacionado com heran�a
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; visivel(publico) para classes flihas
	
	//metodo sem corpo - obriga filhos concretos a ter implementa��o
	public abstract double getBonificacao();//n�o existe implementa��o padr�o
	
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
