package modelo.entidade;

import java.sql.Date;
import java.util.Calendar;

public class Senha {
	private int key;
	private String senha;
	private int categoria;
	private int servico;
	private String data;
	private String ultimasenha;
	
	public String getUltimasenha() {
		return ultimasenha;
	}
	public void setUltimasenha(String ultimasenha) {
		this.ultimasenha = ultimasenha;
	}
	public Senha() {
		// TODO Auto-generated constructor stub
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getServico() {
		return servico;
	}
	public void setServico(int servico) {
		this.servico = servico;
	}
	public String getData() {
		return data;
	}
	public void setData(String a) {
		this.data = a;
	}
	@Override
	public String toString() {
		return "Senha [senha=" + senha + ", categoria=" + categoria + ", servico=" + servico + ", data=" + data + "]";
	}
		

	

}
