//contrato Autentcavel
	//quem assina esse contrato precisa implementar
		//metodo setSenha
		//metodo autentica
public abstract interface Autenticavel {
	
//abstra��o entre SistemaInterno e todas as pessoas que desejam acess�-lo. 
//Ainda que estas pessoas n�o tenham rela��o entre si.	
	
	public abstract void setSenha(int senha);
	public abstract boolean autentica(int senha);

//	private int senha;
//	
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
//
//	public boolean autentica(int senha) {
//		if(this.senha == senha){
//			return true;
//		} else {
//			return false;
//		}
//	}	

}
