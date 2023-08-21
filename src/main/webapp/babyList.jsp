
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.register.ConnectDB" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel ="stylesheet" type ="text/css" href="./Sytle.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Baby Registered in System</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-secondary navbar-dark">
    <div class="container">
      <div class="text-white text-center">
        <h1><a class="navbar-brand" href="#">
    </a>Now they are registered!!!</h1>
      </div>
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp"><i class="fa fa-home"></i>Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Home.jsp">Signup</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="Login.jsp"> Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact Us</a>
        </li>
      </ul>
    </div>
  </nav>

    <div class="container mt-5">
        <h1>Baby List</h1>
        
        <table class="table">
            <thead>
                <tr>
                
                  <th>ID</th>
                
                    <th>Baby_Name</th>
                    <th>Gender</th>
                    <th>Date_of_Birth</th>
                    <th>Parent_Name</th>
                    <th>Contact_Number</th>
                    <th>Adddress</th>
                </tr>
            </thead>
            
            <tbody>
                <%
                try {
                    ConnectDB db = new ConnectDB();
                    db.DBconnection();
                    ResultSet rs = db.getAllbabyList();
                   
                 
                    while (rs.next()) {
                %>
                <tr>
                   
                   <td><%=rs.getInt("ID") %></td>
                   
                    <td><%= rs.getString("Baby_Name") %></td>
                    <td><%= rs.getString("Gender") %></td>
                    <td><%= rs.getString("Date_of_Birth") %></td>
                    <td><%= rs.getString("Parent_Name") %></td>
                    <td><%= rs.getString("Contact_Number") %></td>
                     <td><%= rs.getString("Adddress") %></td>
                    <td>
                        <a href="edit.jsp?id=<%= rs.getString("ID") %>">Edit</a>
                        <a href="Delete.jsp?id=<%= rs.getString("ID") %>">Delete</a>
                    </td>
                </tr>
                <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                %>
            </tbody>
        </table>
        
    </div>
    
    <footer class="bg-secondary text-white mt-4 py-3">
        <div class="container text-center">
            <p>Have you seen your baby on this list?? </p>
        </div>
        
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        
    </footer>
</body>
</html>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 