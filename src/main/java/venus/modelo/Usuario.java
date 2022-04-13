package venus.modelo;

public class Usuario {
	private String login;
	private String password;
	
	public Usuario(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public boolean verificarAcesso(String login, String password) {
		return this.login.equals(login) && this.password.equals(password);
	}	
}
