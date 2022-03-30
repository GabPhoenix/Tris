package com.repositories;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.models.ProfissionalModel;


public class ProfissionalDao extends DAO{


//	public List<ProfissionalModel> listarProfissionais(){
//		String sql = "select * from Profissional";
//		List<ProfissionalModel> result = new ArrayList<>();
//		try {
//			ResultSet res = con.Buscar(sql);
//			while(res.next()) {
//				ProfissionalModel profissional = new ProfissionalModel();
//				profissional.setId(res.getInt("Id"));
//				profissional.setCpf(res.getString("Cpf"));
//				profissional.setLogin(res.getString("Login"));
//				profissional.setNome(res.getString("Nome"));
//				profissional.setSenha(res.getString("Senha"));
//				profissional.setGrupo(res.getString("Grupo"));
//				result.add(profissional);
//			}
//		} catch(SQLException e) {
//			Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, e);
//		}
//		return result;
//	}

	public boolean insertProfissional(ProfissionalModel profissional) {
		String sql = "INSERT INTO Profissional (Cpf, Nome, Login, Senha, Grupo) VALUES (?, ?, ?, ?, ?)";
		try {
			Connection con = conectar();
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, profissional.getCpf());
			stm.setString(2, profissional.getNome());
			stm.setString(3, profissional.getLogin());
			stm.setString(4, profissional.getSenha());
			stm.setString(5, profissional.getGrupo());
			stm.execute();
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERRO aqui");
			return false;
		} 
	}

//	public boolean updateProfissional(ProfissionalModel profissional) {
//		try {
//			con.AlterarSQL("UPDATE Profissiobal SET Cpf="+ profissional.getCpf()+
//					", Nome="+ profissional.getNome() +
//					", Login=,"+ profissional.getLogin() +
//					", Senha=" + profissional.getSenha() +
//					", Grupo=" + profissional.getGrupo() +
//					"WHERE Id=" + profissional.getId());
//			return true;
//		} catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}	
//	}
	
//	public boolean removeProfissional(int id) {
//		String sql = "DELETE FROM Profissional WHERE Id=?";
//		try {
//			PreparedStatement stm = cn.prepareStatement(sql);
//			stm.setInt(1, id);
//			stm.execute();
//			return true;
//		} catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
	
}
