
public class TesteReferencias {

	public static void main(String[] args) {

		// Funcionario g1 = new Gerente(); o contrario não funciona
		// polimorfismo > temos um mesmo objeto, do tipo Gerente,
		// duas formas possíveis de chegarmos a este objeto, dois tipos diferentes de referência.

		// g1.autentica(1234);
		// Quem define o que podemos chamar é a referência, que é do tipo Funcionario, e
		// a classe Funcionario não tem esse método.

		Gerente g1 = new Gerente();
		g1.setNome("Van Gogh");
		g1.setSalario(5000.0);

		// Funcionario f = new Funcionario(); não deveria funcionar - classe abstrata
		// Funcionario f = new Gerente(); assim tambem é possivel

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
