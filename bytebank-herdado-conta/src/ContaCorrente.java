
public class ContaCorrente extends Conta implements Tributavel {

	/*os construtores n�o s�o herdados
	public ContaCorrente() { //Como estamos utilizando o construtor padr�o, ele tenta chamar o construtor padr�o da classe m�e
		super();//usar construtor padr�o da classe mae
	}*/
	
	public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);//podemos utilizar o super para chamar um construtor espec�fico, passando os par�metros espec�ficos para ele
    }
	
	
	@Override//o compilador precisa saber inten��o de sobrescrever o m�todo
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
