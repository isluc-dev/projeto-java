package cursojava.interfaces;

public interface PermitirAcesso {
	/*essa interface sera nosso conmtrato de autenticação */
	
	
	//primeirra forma de fazer 
	public boolean autenticar();// apenas a declaração do metodo
	
	public boolean autenticar(String login , String senha);

}
