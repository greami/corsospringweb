package it.corsospring.web.model;

public class Cliente
{
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String telefono;
	private String email;
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getCognome()
	{
		return cognome;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
	public String getCodiceFiscale()
	{
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale)
	{
		this.codiceFiscale = codiceFiscale;
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	
	

}