package connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnetionDB {
	private String url, usuario, senha;
	private Connection con;
	
	
	public ConnetionDB() {
		url = "jdbc:postgresql://localhost:5432/AtendimentoHospitalar";
		usuario = "postgres";
		senha = "admin123";
	
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void AlterandoDadosSQL(String sql) {
		
		try {
			
			Statement stm = (Statement) con.createStatement();
			int res = ((java.sql.Statement) stm).executeUpdate(sql);
			con.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ResultSet Buscar(String sql) {
		
		try {
			
			Statement stm = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) stm).executeQuery(sql);
			con.close();			
			return rs;
			
		}catch(Exception e) {
			e.getMessage();
			return null;
		}
	}
}
