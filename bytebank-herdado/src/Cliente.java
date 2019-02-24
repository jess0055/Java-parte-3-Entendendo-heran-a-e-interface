//implementa interface - devo implementar metodos abstract
public class Cliente implements Autenticavel {
	
	//composi��o
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		//composi��o - tem um: Cliente tem um AutenticacaoUtil
		this.autenticador = new AutenticacaoUtil ();
	}
	
	//Manter somente as assinatura e eliminar a l�gica dos m�todos
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
    //Isso significa que delegamos a chamada - o m�todo n�o foi embora, mas a implementa��o, que era concreta, agora foi delegada
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}


}
