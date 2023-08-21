package com.register;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistersServlet
 */
@WebServlet("/RegistersServlet")
public class RegistersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String email=request.getParameter("email");
		String password=request.getParameter("password");

		LoginSetter loginuser=new LoginSetter(email,password);
		ConnectDB db=new ConnectDB();
		db.DBconnection();
		ResultSet rs=db.loginUser(loginuser);
		try {
			
		
			if(rs.next()) {
				String role=rs.getString("role");
				
				if(role.equals("user")) {
				response.sendRedirect("babyRegister.jsp");}
				else {
					response.sendRedirect("babyRegister.jsp");	
			}
			

}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}	
			
		}
			
			
			
			
			
			
			
			
			
			
	
