package com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;

import com.models.PacienteModel;
import com.models.ProfissionalModel;
import com.repositories.PacienteDao;
import com.repositories.ProfissionalDao;

/**
 * Servlet implementation class AppServerlet
 */
@WebServlet(urlPatterns =  { "/app", "/signin" })
public class AppServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PacienteDao pacienteDao;
	private ProfissionalDao profissionalDao =  new ProfissionalDao();
    private PacienteModel paciente = new PacienteModel();
    private ProfissionalModel profissional = new ProfissionalModel();
    
    private String loginPage = "login.html";
    
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
			signin(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void signin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		profissional.setCpf(request.getParameter("cpf"));
		profissional.setNome(request.getParameter("realname"));
		profissional.setLogin(request.getParameter("username"));
		profissional.setSenha(request.getParameter("user_password"));
		profissional.setGrupo(request.getParameter("Grupo"));

		profissionalDao.insertProfissional(profissional);
	
		response.sendRedirect(loginPage);
	}

}
