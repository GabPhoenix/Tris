package com.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.models.PacienteModel;

public class PacienteDao{

	
//	public List<PacienteModel> listarPacientes(){
//		String sql = "select * from Paciente";
//		List<PacienteModel> result = new ArrayList<>();
//		try {
//			ResultSet res = con.Buscar(sql);
//			while(res.next()) {
//				PacienteModel paciente = new PacienteModel();
//				paciente.setId(res.getInt("Id"));
//				paciente.setCpf(res.getString("Cpf_paciente"));
//				paciente.setNome(res.getString("Nome"));
//				paciente.setSus(res.getString("Sus"));
//				paciente.setNascimento(res.getString("Data_de_nascimento"));
//				paciente.setEmail(res.getString("Email"));
//				paciente.setQuadro(res.getString("Quadro"));
//				paciente.setDescricao(res.getString("Descricao"));
//				result.add(paciente);
//			}
//		} catch(SQLException e) {
//			Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, e);
//		}
//		return result;
//	}
//
//	public boolean insertPaciente(PacienteModel paciente) {
//		String sql = "INSERT INTO Paciente (Cpf_paciente, Nome, Sus, Data_de_nascimento, Email, Quadro, Descricao)"
//				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
//		try {
//			PreparedStatement stm = cn.prepareStatement(sql);
//			stm.setString(1, paciente.getCpf());
//			stm.setString(2, paciente.getNome());
//			stm.setString(3, paciente.getSus());
//			stm.setString(4, paciente.getNascimento());
//			stm.setString(5, paciente.getEmail());
//			stm.setString(6, paciente.getQuadro());
//			stm.setString(7, paciente.getDescricao());
//			stm.execute();
//			return true;
//			
//		} catch(SQLException e) {
//			e.printStackTrace();
//			return false;
//		} 
//	}
//
//	public boolean updatePaciente(PacienteModel paciente) {
//		try {
//			con.AlterarSQL("UPDATE Paciente SET Cpf_paciente="+ paciente.getCpf()+
//					", Nome="+ paciente.getNome() +
//					", Sus=,"+ paciente.getSus() +
//					", Data_de_nascimento=" + paciente.getNascimento() +
//					", Email="+ paciente.getEmail() + 
//					", Quadro=" + paciente.getQuadro() +
//					", Descricao="+ paciente.getDescricao() + 
//					"WHERE Id=" + paciente.getId());
//			return true;
//		} catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}	
//	}
//	
//	public boolean removePaciente(int id) {
//		String sql = "DELETE FROM Paciente WHERE Id=?";
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
//	

}
