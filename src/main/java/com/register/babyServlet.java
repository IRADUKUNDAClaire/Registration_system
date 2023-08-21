package com.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class babyServlet
 */
@WebServlet("/babyServlet")
public class babyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public babyServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		String Baby_Name=request.getParameter("baby-name");
		String Gender=request.getParameter("gender");
		String Date_of_Birth=request.getParameter("date-of-birth");
		String Parent_Name=request.getParameter("parent-name");
		String Contact_Number=request.getParameter("contact-number");
		String Address=request.getParameter("address");
		Babby user2=new Babby(Baby_Name,Gender,Date_of_Birth,Parent_Name,Contact_Number,Address);
		ConnectDB db=new ConnectDB();
		db.DBconnection();
		db.addBabby(user2);
		response.sendRedirect("babyRegister.jsp");
		
	}

}
