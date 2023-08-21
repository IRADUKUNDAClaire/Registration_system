package com.register;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
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
		
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String role=request.getParameter("role");
		
		int id=0;
		String idStr=request.getParameter("id");
		
		if(idStr!=null && !idStr.isEmpty()) {
			try {
				id=Integer.parseInt(idStr);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		
		ConnectDB db=new ConnectDB();
		db.DBconnection();
		String result=db.updateUser(fullname, email, role, id);
		if(result!=null) {
			JOptionPane.showMessageDialog(null, result);
			response.sendRedirect("adminDashboard.jsp");
		}else {
			JOptionPane.showMessageDialog(null, result);
			response.sendRedirect("edit.jsp");

		}
		
		
		
		
		
	}

}
