package code.smells;
//Code Smells 
//Nesta aula, foi apresentado o problema que surge e nos motiva a utilizar a herança, é ela quem nos ajudará a separar as funcionalidades
//objetivo é ter um código estável, ou seja, que uma vez escrito, não precise ser reescrito

public class Teste {

	public static void main(String[] args) {
	
		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setSalario(3000.00);
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setTipo(2);
		f2.setSalario(7000.00);
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
		

	}
}
