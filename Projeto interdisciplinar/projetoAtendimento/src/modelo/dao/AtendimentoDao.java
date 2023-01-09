package modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.entidade.Atendimento;
import modelo.entidade.Senha;

public class AtendimentoDao{

	public void salvar(Atendimento atendimento) {    	
		Conexao conexao = new Conexao();
		String sql = "INSERT INTO " +
				"Atendimento (descricao, inicio, fim, data, Servico_idServico, Funcionario_idFuncionario, Senha, CategoriaIdCategoria, GuicheIdGuiche, ClienteIdCliente) " +
				"VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, atendimento.getDescricao());
			stmt.setString(2, atendimento.getInicio());
			stmt.setString(3, atendimento.getFinal());
			stmt.setString(4, atendimento.getData());
			stmt.setInt(5, atendimento.getServico());
			stmt.setInt(6, atendimento.getAtendente());
			stmt.setString(7, atendimento.getSenha());
			stmt.setInt(8, atendimento.getCategoria());
			stmt.setInt(9, atendimento.getGuiche());
			stmt.setInt(10, atendimento.getCliente());


			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public ArrayList<Atendimento> consulta() {
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ArrayList<Atendimento> atendimentos;

		try {
			stmt = conexao.getConn().prepareStatement("select * from atendimento");

			ResultSet rs = stmt.executeQuery();
			atendimentos = new ArrayList<Atendimento>();
			while (rs.next()) {
				// criando o objeto Contato
				Atendimento atd = new Atendimento();
				atd.setDescricao(rs.getString("descricao"));
				atd.setInicio(rs.getString("inicio"));
				atd.setFinal(rs.getString("fim"));
				atd.setData(rs.getString("data"));
				atd.setServico(Integer.parseInt(rs.getString("Servico_idServico")));
				atd.setAtendente(Integer.parseInt(rs.getString("Funcionario_idFuncionario")));
				atd.setSenha(rs.getString("senha"));
				atd.setCategoria(Integer.parseInt(rs.getString("CategoriaIdCategoria")));
				atd.setGuiche(Integer.parseInt(rs.getString("GuicheIdGuiche")));
				atd.setCliente(Integer.parseInt(rs.getString("ClienteIdCliente")));

				// adicionando o objeto lista
				atendimentos.add(atd);
			}

			rs.close();
			stmt.close();
			return atendimentos;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	

	}
}










