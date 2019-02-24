//não posso mais instacinar objetos dessa classe
public abstract class Funcionario {//abstract relacionado com herança
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; visivel(publico) para classes flihas
	
	//metodo sem corpo - obriga filhos concretos a ter implementação
	public abstract double getBonificacao();//não existe implementação padrão
	
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
