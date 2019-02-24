
public class TesteFuncionario {

	public static void main(String[] args) {
			
	
		//Funcionario nico = new Funcioario();//classe abstrata
		//Funcionario nico = new Gerente();
		Funcionario f = new Gerente();
		f.setNome("Jessica");
		f.setCpf("223355646-9");
		f.setSalario(2600.00);

		System.out.println(f.getNome());
		System.out.println(f.getBonificacao());
		
		//nico.salario = 300.0; funciona devido a classe Funcionario estar no mesmo pacote, atributo com modificador protected
		
	}

}
