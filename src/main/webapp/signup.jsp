<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">




<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Baby Registration System</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>
  body {
   
      background-image: url("image/Babby.jpg");
      background-size: cover; 
    background-repeat: no-repeat; 
   
  }

  .login-container {
    max-width: 800px;
    margin: 30px auto;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    border-radius: 5px;
 
    background-color: green;
  }


  .login-form {
    padding: 30px;
    border-radius: 0 5px 5px 0;
  }

  .login-form h2 {
    text-align: center;
    margin-bottom: 20px;
  }

  .login-form label {
    font-weight: bold;
  }

  .login-form input {
    width: 100%;
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  .login-form button {
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }

  .login-form button:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>
<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Baby Registration System</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="signup.jsp">Home</a>
      </li>
  
      <!-- <li class="nav-item">
        <a class="nav-link" href="#">Contact</a>
      </li> -->
           <li class="nav-item">
        <a class="nav-link" href="adminDashboard.jsp">Login</a>
      </li>
    </ul>
  </div>
</nav>
<div class="container login-container">
  <div class="row">
    <div class="col-md-6 baby-image"></div>
    <div class="col-md-6 login-form">
      <div class="signup-form">
    <h2>Signup</h2>
    <form action="Registration" method="post">
      <div class="form-group">
        <label for="fullname">Full Name:</label>
        <input type="text" name="fullname" id="fullname" class="form-control" placeholder="Enter your full name" required>
      </div>
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" class="form-control" placeholder="Enter your email" required>
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" class="form-control" placeholder="Enter your password" required>
      </div>
   
      <button type="submit" class="btn btn-primary" action="signup.jsp">Signup</button>
      
<!--   <img src="./image/Baby2.jpg"alt=""style="height:700px;width:800px"> -->
            <div class="form-group">
      <span>Have Account?</span>  <a href="Login.jsp"> Login here</a>
        
      </div>
    </form>
    </div>
  </div>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
