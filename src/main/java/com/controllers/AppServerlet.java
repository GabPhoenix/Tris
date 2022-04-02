package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.models.PacienteModel;
import com.models.ProfissionalModel;
import com.models.UsuarioModel;
import com.repositories.Conexao;
import com.repositories.PacienteDao;
import com.repositories.ProfissionalDao;

/**
 * Servlet implementation class AppServerlet
 */
@WebServlet(urlPatterns =  { "/app", "/signin", "/login", "/create" })
public class AppServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PacienteDao pacienteDao = new PacienteDao();
	private ProfissionalDao profissionalDao =  new ProfissionalDao();
    private PacienteModel paciente = new PacienteModel();
    private ProfissionalModel profissional = new ProfissionalModel();
    private UsuarioModel user = new UsuarioModel();
    
    private final String loginPage = "login.html";
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppServerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if(action.equals("/signin")) {
			this.signin(request, response);
		} else if(action.equals("/login")) {
			this.login(request, response);
		} else if(action.equals("/create")) {
			this.createNewPatiente(request, response);
		} else if(action.equals("update_patient")) {
			this.updatePatient(request, response);
		} else if(action.equals("delete_patient")) {
			this.deletePatient(request, response);
		} else if(action.equals("list_patients")) {
			this.listPatients(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/*
	 * THIS METHOD IS TO CREATE NEW PROFESSIONALS 
	 * AND AFTER REDIRECT THEM TO LOGIN PAGE 
	 */
	protected void signin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		profissional.setCpf(request.getParameter("cpf"));
		profissional.setNome(request.getParameter("realname"));
		profissional.setLogin(request.getParameter("username"));
		profissional.setSenha(request.getParameter("user_password"));
		profissional.setGrupo(request.getParameter("group"));

		boolean sign = profissionalDao.insertProfissional(profissional);
		if(sign) {
			System.out.println("Cadastrado");
			response.sendRedirect(loginPage);
		} else {
			System.out.println("Não cadastrado");
			response.sendRedirect("signin.html");
		}
	
		
	}
	
	/*
	 * THIS METHOD IS TO LOGIN (FOR PROFESSIONALS)
	 * AND AFTER, REDIRECT THEM TO THE PAGE 'CREATE NEW PATIENT'
	 */
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user.setLogin(request.getParameter("username"));
		user.setSenha(request.getParameter("password"));
		
		boolean log = profissionalDao.login(user);
		if(log) {
			System.out.println("Logado");
			request.getRequestDispatcher("/WEB-INF/newPatient.html").forward(request, response);
		} else {
			System.out.println("Não logado");
			response.sendRedirect(loginPage);
		}
		
	}
	
	/*
	 * THIS METHOD IS TO CREATE NEW PATIENT AND AFTER 
	 * REDIRECT TO 'LIST PATIENTS PAGE'
	 */
	protected void createNewPatiente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		paciente.setCpf(request.getParameter("cpf"));
		paciente.setNome(request.getParameter("nome"));
		paciente.setSus(request.getParameter("sus"));
		paciente.setEmail(request.getParameter("email"));
		paciente.setQuadro(request.getParameter("triage"));
		paciente.setDescricao(request.getParameter("descrição"));
		boolean cad = pacienteDao.insertPaciente(paciente);
		
		if(cad) {
			System.out.println("Paciente cadastrado com sucesso!");
			request.getRequestDispatcher("/WEB-INF/listPatients.html").forward(request, response);
		} else {
			System.out.println("Não foi possível cadastrar");
			response.sendError(0, "Impossível cadastrar");
		}
	}
	
	/*
	 * TODO UPDATE PATIENT METHOD
	 */
	public void updatePatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	/*
	 * TODO DELETE PATIENT METHOD
	 */
	public void deletePatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}

	/*
	 * TODO LIST PATIENTS METHOD
	 */
	public void listPatients(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}
