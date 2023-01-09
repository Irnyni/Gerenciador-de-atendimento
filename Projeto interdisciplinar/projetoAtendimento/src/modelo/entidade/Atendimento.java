package modelo.entidade;

import java.util.Date;

public class Atendimento {

	public String descricao;
	public String Inicio;
	public String Final;
	public String Data;
	public int Serviço;
	public int Atendente;
	public String Senha;
	public int Categoria;
	public int Guiche;
	public int Cliente;

	public void GerarHistorico() {

	}


	public String getInicio() {
		return Inicio;
	}
	public void setInicio(String date) {
		Inicio = date;
	}
	public String getFinal() {
		return Final;
	}
	public void setFinal(String a) {
		Final = a;
	}
	public String getData() {
		return Data;
	}
	public void setData(String date) {
		Data = date;
	}
	public int getServico() {
		return Serviço;
	}
	public void setServico(int serviço) {
		Serviço = serviço;
	}
	public int getAtendente() {
		return Atendente;
	}
	public void setAtendente(int atendente) {
		Atendente = atendente;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String string) {
		Senha = string;
	}
	public int getCategoria() {
		return Categoria;
	}
	public String getDescricao() {
		return descricao;
	}





	public void setCategoria(int categoria) {
		Categoria = categoria;
	}
	public int getGuiche() {
		return Guiche;
	}
	@Override
	public String toString() {
		return "Atendimento [descricao=" + descricao + ", Inicio=" + Inicio + ", Final=" + Final + ", Data=" + Data
				+ ", Serviço=" + Serviço + ", Atendente=" + Atendente + ", Senha=" + Senha + ", Categoria=" + Categoria
				+ ", Guiche=" + Guiche + ", Cliente=" + Cliente + "]";
	}


	public void setGuiche(int guiche) {
		Guiche = guiche;
	}
	public int getCliente() {
		return Cliente;
	}
	public void setCliente(int cliente) {
		Cliente = cliente;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



}
