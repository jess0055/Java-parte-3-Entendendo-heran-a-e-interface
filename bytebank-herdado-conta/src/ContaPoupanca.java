
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);//podemos utilizar o super para chamar um construtor específico, passando os parâmetros específicos para ele
    }
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}


}
