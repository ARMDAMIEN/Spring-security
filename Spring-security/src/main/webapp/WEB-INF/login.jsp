<%@page import="java.util.Date" session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"   %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="${pageContext.request.contextPath}/styles/style.css rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Examples Servlet</title>
    <style>
    
    </style>
</head>

<body>
<div style="text-align: center;padding:5px 0;margin:0;">
       <a href="${pageContext.request.contextPath}/index?lang=en">Login (English)</a>
       &nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/index?lang=fr">Login (French)</a>
       
    </div>

<div class="sidenav">
         <div class="login-main-text">
            <h2>Application<br> JAVA EE</h2>
            <p>Example Servlet.</p>
            <br>
            <%= new Date() %>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form action="home" method="post">
                  <div class="form-group">
                     
                     <input type="text" class="form-control" placeholder="User Name" name="login" required="true">
                  </div>
                  <div class="form-group">
                     <label><s:message code="label.password" /></label>
                     <input type="password" class="form-control" placeholder="Password" name="password" required="true">
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                  <button type="submit" class="btn btn-secondary">Register</button>        
               </form>
            </div>
         </div>
      </div>
</body>

</html>