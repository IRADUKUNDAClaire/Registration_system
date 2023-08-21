<%@ page import="javax.swing.JOptionPane" %>
<%@ page import="com.register.ConnectDB" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
try {
    int userIDToDelete = Integer.parseInt(request.getParameter("id"));
    ConnectDB db = new ConnectDB();
    db.DBconnection();
    boolean deleted = db.deleteuser(userIDToDelete);
    if (deleted) {
         response.sendRedirect("adminDashboard.jsp"); 
    } else {
        out.println("Deletion failed. Please try again");
    }
} catch (Exception e) {
    e.printStackTrace();
    System.out.println("Failed" + e.getMessage());
}
%>
