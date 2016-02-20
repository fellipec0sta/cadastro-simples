package cadastro;

public class Senha {
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha, String repetirSenha) throws Exception{
		this.senha = senha;
		if(senha.length() < 6){
			throw new Exception("A senha nao deve contrar menos que 6 caracteres");
		}
		else if(senha.compareTo(repetirSenha) != 0){
			throw new Exception("As senhas são diferentes");
		}
		
	}
	
	public Senha(String senha, String repetirSenha) throws Exception{
		
		this.setSenha(senha, repetirSenha);
		
	}
	
	

}
