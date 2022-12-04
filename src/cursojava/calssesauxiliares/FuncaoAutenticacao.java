package cursojava.calssesauxiliares;

import cursojava.interfaces.PermitirAcesso;

// serve para quem somente receber e tem o contrato da interface de PermitirAcesso e chamar o Autenticar
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		 this.permitirAcesso = acesso;
		
	}
	
	
	

}
