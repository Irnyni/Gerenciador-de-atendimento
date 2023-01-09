package modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.entidade.Servico;

public class ServicoDao{

	public void salvar(Servico servico) {    	
		Conexao conexao = new Conexao();
		String sql = "INSERT INTO " +
				"servico (descricao) " +
				"VALUES (?)";
		try {
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, servico.getDescricao());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	public ArrayList<Servico> consulta() {
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ArrayList<Servico> servicos;

		try {
			stmt = conexao.getConn().prepareStatement("select * from servico");

			ResultSet rs = stmt.executeQuery();
			servicos = new ArrayList<Servico>();
			while (rs.next()) {
				// criando o objeto Contato
				Servico servico = new Servico();
				servico.setId(Integer.parseInt(rs.getString("idServico")));
				servico.setDescricao(rs.getString("descricao"));


				// adicionando o objeto lista
				servicos.add(servico);
			}

			rs.close();
			stmt.close();
			return servicos;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	

	}
}
