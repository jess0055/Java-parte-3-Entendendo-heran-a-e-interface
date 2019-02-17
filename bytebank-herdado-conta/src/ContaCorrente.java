
public class ContaCorrente extends Conta implements Tributavel {

	/*os construtores não são herdados
	public ContaCorrente() { //Como estamos utilizando o construtor padrão, ele tenta chamar o construtor padrão da classe mãe
		super();//usar construtor padrão da classe mae
	}*/
	
	public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);//podemos utilizar o super para chamar um construtor específico, passando os parâmetros específicos para ele
    }
	
	
	@Override//o compilador precisa saber intenção de sobrescrever o método
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
