package persistence;

import java.sql.SQLException;

import entity.Produto;

public class ProdutoDao extends Dao{

	public boolean incluirProdutoDB(Produto p) throws Exception {
		boolean SUCCESS = false;
		
		try {
			open();
			stmt = con.prepareStatement("insert into produto values(null,?,?,?,?,?,?,?)");
			stmt.setString(1,p.getNome());
			stmt.setInt(2,p.getCategoria());
			stmt.setInt(3,p.getQuantidade());
			stmt.setFloat(4,p.getPreco());
			stmt.setString(5,p.getTemLojaFisica());
			stmt.setString(6,UtilsBanco.convertDateToDataBase(p.getDataValidade()));
			stmt.setString(7,p.getDescricao());
			
			stmt.execute();
			SUCCESS = true;
			
			
		} catch (SQLException e)  { 
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		} finally {
			close();
		}
		
		return SUCCESS;
		
	}
	
}
