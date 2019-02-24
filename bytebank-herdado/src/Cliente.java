//implementa interface - devo implementar metodos abstract
public class Cliente implements Autenticavel {
	
	//composição
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		//composição - tem um: Cliente tem um AutenticacaoUtil
		this.autenticador = new AutenticacaoUtil ();
	}
	
	//Manter somente as assinatura e eliminar a lógica dos métodos
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
    //Isso significa que delegamos a chamada - o método não foi embora, mas a implementação, que era concreta, agora foi delegada
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}


}
