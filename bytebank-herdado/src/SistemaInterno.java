
public class SistemaInterno {
	
	private int senha = 2222;
	
	//posso usar interface para definir um tipo
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("pode entrar");
		}else{
			System.out.println("não pode entrar");
		}
	}
}
