package modelo.dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import modelo.entidade.Artigo;

public class MonitorDao{

	public void pesquisar() {    	
		Conexao conexao = new Conexao();
		String sql = "Select nome from guiche where id = 1";
		try {
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
