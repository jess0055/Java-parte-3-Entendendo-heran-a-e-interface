
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);//podemos utilizar o super para chamar um construtor espec�fico, passando os par�metros espec�ficos para ele
    }
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}


}
