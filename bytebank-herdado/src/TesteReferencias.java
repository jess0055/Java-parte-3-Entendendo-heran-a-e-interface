
public class TesteReferencias {

	public static void main(String[] args) {

		// Funcionario g1 = new Gerente(); o contrario n�o funciona
		// polimorfismo > temos um mesmo objeto, do tipo Gerente,
		// duas formas poss�veis de chegarmos a este objeto, dois tipos diferentes de refer�ncia.

		// g1.autentica(1234);
		// Quem define o que podemos chamar � a refer�ncia, que � do tipo Funcionario, e
		// a classe Funcionario n�o tem esse m�todo.

		Gerente g1 = new Gerente();
		g1.setNome("Van Gogh");
		g1.setSalario(5000.0);

		// Funcionario f = new Funcionario(); n�o deveria funcionar - classe abstrata
		// Funcionario f = new Gerente(); assim tambem � possivel

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);

		Designer d = new Designer();
		d.setSalario(2000.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);

		System.out.println(controle.getSoma());

	}

}
