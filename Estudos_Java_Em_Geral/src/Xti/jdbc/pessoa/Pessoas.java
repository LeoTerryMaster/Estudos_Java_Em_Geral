package Xti.jdbc.pessoa;

public class Pessoas{

	private long codigo;
	private String login;
	private long password;
	private String email;

	public Pessoas(){
	}

	public Pessoas(long codigo,String login,long password,String email){
		this.codigo = codigo;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public long getCodigo(){
		return codigo;
	}

	public void setCodigo(long codigo){
		this.codigo = codigo;
	}

	public String getLogin(){
		return login;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public long getPassword(){
		return password;
	}

	public void setPassword(long password){
		this.password = password;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	@Override
	public String toString(){
		return "Pessoas [codigo=" + codigo + ", login=" + login + ", password=" + password + ", email=" + email + "]";
	}


}
