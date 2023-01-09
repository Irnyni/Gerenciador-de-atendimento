package modelo.dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import modelo.entidade.Cargo;

public class CargoDao{

	public void salvar(Cargo cargo) {    	
		Conexao conexao = new Conexao();
		String sql = "INSERT INTO " +
				"cargo (descricao, hierarquia) " +
				"VALUES (?,?)";
		try {
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, cargo.getDescricao());
			stmt.setString(2, cargo.getHierarquia());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

