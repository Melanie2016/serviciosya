<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <meta name="description" content="">
	    <meta name="author" content="">
	
	    <title>PAISES</title>
	
	    <!-- Bootstrap core CSS -->
	    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	
	    <!-- Custom fonts for this template -->
	    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
	    <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
	    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
	
	    <!-- Custom styles for this template -->
	    <link href="css/landing-page.min.css" rel="stylesheet">
	   	
	</head>
	<body>
		<!-- Navigation -->
	    <nav class="navbar navbar-expand-lg  navbar-light" style="background-color: #18a2b8;" >
		  <a class="navbar-brand" style="color: white; text-align: center;" href="<c:url value="/home"/>">ServiciosYa !</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNav" >
		    <ul class="navbar-nav" style = "float: right; margin-left:65%;" >
		    
		      <li class="nav-item active"  class="active">
		        <a class="nav-link" href="<c:url value="/home"/>" style="color: white; font-size: 20px;">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link"  href="#" style="color: white; font-size: 20px;">Consumidor</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#" style="color: white; font-size: 20px;">Proveedor</a>
		      </li>
		      
		    </ul>
		  </div>
		</nav>
		
		
		
		<div class="container">
		
		<br><br>
		<p class="h4 mb-4">Paises</p>
		
			
			<table class="table table-hover" >
			  <thead style="background-color: #18a2b8; color:white;">
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">Id</th>
			      <th scope="col">Name</th>

			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach items="${countries}" var="countries">
						
							<tr>

								<th scope="row"></th>
									<td>${countries.id}</td>
 									<td>${countries.name}</td> 
								

							</tr> 
				</c:forEach>
			    
			    
			  </tbody>
			</table>
		</div>
		
		
		
		
		
		<!-- Footer -->
	    <footer class="footer bg-light">
	      <div class="container">
	        <div class="row">
	          <div class="col-lg-6 h-100 text-center text-lg-left my-auto">
	            <ul class="list-inline mb-2">
	              <li class="list-inline-item">
	                <a href="#">About</a>
	              </li>
	              <li class="list-inline-item">&sdot;</li>
	              <li class="list-inline-item">
	                <a href="#">Contact</a>
	              </li>
	              <li class="list-inline-item">&sdot;</li>
	              <li class="list-inline-item">
	                <a href="#">Terms of Use</a>
	              </li>
	              <li class="list-inline-item">&sdot;</li>
	              <li class="list-inline-item">
	                <a href="#">Privacy Policy</a>
	              </li>
	            </ul>
	            <p class="text-muted small mb-4 mb-lg-0">&copy; Your Website 2018. All Rights Reserved.</p>
	          </div>
	          <div class="col-lg-6 h-100 text-center text-lg-right my-auto">
	            <ul class="list-inline mb-0">
	              <li class="list-inline-item mr-3">
	                <a href="#">
	                  <i class="fab fa-facebook fa-2x fa-fw"></i>
	                </a>
	              </li>
	              <li class="list-inline-item mr-3">
	                <a href="#">
	                  <i class="fab fa-twitter-square fa-2x fa-fw"></i>
	                </a>
	              </li>
	              <li class="list-inline-item">
	                <a href="#">
	                  <i class="fab fa-instagram fa-2x fa-fw"></i>
	                </a>
	              </li>
	            </ul>
	          </div>
	        </div>
	      </div>
	    </footer>
	
	    <!-- Bootstrap core JavaScript -->
	    <script src="vendor/jquery/jquery.min.js"></script>
	    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
			
		
				
				
				
	
	
	</body>
</html>