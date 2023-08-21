<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateServlet"method="post">
   <div class="form-group">
       <label for="fullname">ID:</label>
          <input type="number" name="id" id="id" class="form-control"value="<%=  request.getParameter("id") %>" readonly placeholder="Enter your id" required>
    </div>
     <div class="form-group">
          <label for="fullname">Fullname:</label>
          <input type="text" name="fullname" id="fullname" class="form-control" value="<%=  request.getParameter("fullname") %>" placeholder="Enter your fullname" required>
        </div>
        <div class="form-group">
          <label for="email">email:</label>
          <input type="email" name="email" id="email" class="form-control" value="<%=  request.getParameter("email") %>" placeholder="Enter your email" required>
        </div>
         <div class="form-group">
       <label for="role">role:</label>
          <input type="text" name="role" id="role" class="form-control" value="<%=  request.getParameter("role") %>" placeholder="Enter your role" required>
        </div>
       
 <button type="submit" class="button">Edit</button>

        
        
</form>
</body>
</html>