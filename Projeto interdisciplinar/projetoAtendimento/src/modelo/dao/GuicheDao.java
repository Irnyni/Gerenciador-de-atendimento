package modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.entidade.Guiche;
import modelo.entidade.Senha;

public class GuicheDao{

	public void salvar(Guiche guiche) {    	
		Conexao conexao = new Conexao();
		String sql = "INSERT INTO " +
				"guiche (descricao, Servico_idServico, Categoria_idCategoria1, Funcionario_idFuncionario) " +
				"VALUES (?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, guiche.getDescricao());
			stmt.setLong(2, guiche.getCategoria());
			stmt.setLong(3, guiche.getServico());;
			stmt.setLong(4, guiche.getFuncionario());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public ArrayList<Guiche> consulta() {
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ArrayList<Guiche> guiches;

		try {
			stmt = conexao.getConn().prepareStatement("select * from guiche");

			ResultSet rs = stmt.executeQuery();
			guiches = new ArrayList<Guiche>();
			while (rs.next()) {
				// criando o objeto Contato
				Guiche guiche = new Guiche();
				guiche.setServico(Integer.parseInt(rs.getString("Servico_idServico")));
				guiche.setCategoria(Integer.parseInt(rs.getString("Categoria_idCategoria1")));
				guiche.setDescricao(rs.getString("descricao"));
				guiche.setFuncionario(Integer.parseInt(rs.getString("Funcionario_idFuncionario")));
				guiche.setId(Integer.parseInt(rs.getString("idGuiche")));

				// adicionando o objeto lista
				guiches.add(guiche);
			}

			rs.close();
			stmt.close();
			return guiches;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
		
	}	
		
		public Guiche pesquisa(int guiche) {
			Conexao conexao = new Conexao();
			PreparedStatement stmt;


			try {
				stmt = conexao.getConn().prepareStatement("select * from guiche where idGuiche = ?");

				stmt.setLong(1,guiche);
				ResultSet rs = stmt.executeQuery();
				Guiche guiche1 = new Guiche();
				while (rs.next()) {
					// criando o objeto Contato
	
					guiche1.setServico(Integer.parseInt(rs.getString("Servico_idServico")));
					guiche1.setCategoria(Integer.parseInt(rs.getString("Categoria_idCategoria1")));
					guiche1.setDescricao(rs.getString("descricao"));
					guiche1.setFuncionario(Integer.parseInt(rs.getString("Funcionario_idFuncionario")));
					guiche1.setId(Integer.parseInt(rs.getString("idGuiche")));

					// adicionando o objeto lista
				}

				rs.close();
				stmt.close();
				return guiche1;	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}	

	}


}
