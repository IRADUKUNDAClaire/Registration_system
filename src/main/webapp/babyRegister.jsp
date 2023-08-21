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
    background-color: #f0f0f0;
    
    background-image: url("image/Babby.jpg");
    background-size: cover; 
    background-repeat: no-repeat; 
  }

  .login-container {
    max-width: 800px;
    margin: 30px auto;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    border-radius: 5px;
    background-color: #fff;
  }

  .baby-image {
  
    
    border: 1px solid black;
    width: 500px;
    margin-left: 300px;
    margin-top: 20px;
    height: 400px;
    padding: 20px;
    background-color: grey;
    background-image: url("image/Babby.jpg");
    background-size: cover; 
    background-repeat: no-repeat; 
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
  <a class="navbar-brand" href="">User Dashboard</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="Login.jsp">Home</a>
      </li>
  
      <li class="nav-item">
        <a class="nav-link" href="#">Contact</a>
      </li>
           <li class="nav-item">
        <a class="nav-link" href="Login.jsp">Help</a>
      </li>
    </ul>
  </div>
</nav>
<div class="container register-container">
  <div class="register-form">
    <h2>Register Baby</h2>
    <form action="babyServlet" method="post">
      <div class="form-group">
        <label for="baby-name">Baby Name:</label>
        <input type="text" name="baby-name" id="baby-name" class="form-control" placeholder="Enter baby's name" required>
      </div>
      <div class="form-group">
        <label for="gender">Gender:</label>
        <select name="gender" id="gender" class="form-control" required>
          <option value="" selected disabled>Select gender</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="other">Other</option>
        </select>
      </div>
      <div class="form-group">
        <label for="date-of-birth">Date of Birth:</label>
        <input type="date" name="date-of-birth" id="date-of-birth" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="parent-name">Parent's Name:</label>
        <input type="text" name="parent-name" id="parent-name" class="form-control" placeholder="Enter parent's name" required>
      </div>
      <div class="form-group">
        <label for="contact-number">Contact Number:</label>
        <input type="tel" name="contact-number" id="contact-number" class="form-control" placeholder="Enter contact number" required>
      </div>
      <div class="form-group">
        <label for="address">Address:</label>
        <textarea name="address" id="address" class="form-control" rows="3" placeholder="Enter address" required></textarea>
      </div>
      <button type="submit" class="btn btn-primary">Register</button>
      
    </form>
  </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
