<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="frammenti/stili.frammento"></jsp:include>

<title>MyChef-registrazione dati</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style type="text/css">
.navbar {
	min-height: 100px
}
</style>
</head>
<body>
<jsp:include page="frammenti/navbar.html"></jsp:include>
	<%--<div class="navbar navbar-primary bg-primary"
		style="background-color: #ffa200 !important;">
		<h2>
			
			 <button type="button"  class="btn  btn-sm "><img src ="logo2.PNG"></img></button>
		</h2>					
		<br> <br>
		<div class="fixed-bottom col-sm-5 col-lg-5">
			
				
			
		</div>


			<a class="nav-item nav-link disabled" href="#">Registrazione dati</a>
		 	<a class="nav-item nav-link disabled" href="#">Contatti</a>
			<a class="nav-item nav-link disabled" href="#">Disabled</a>
		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0 btn-secondary" type="submit">Search</button>
		</form>

	</div> --%>

	<br>
	<div class="w-50 p-3 card " style="background-color: #eee; text-align:center; position: relative; left: 25%">
		<input class="form-control form-control-lg" type="text" placeholder="Nome">
		<input class="form-control form-control-lg" type="text" placeholder="Cognome">
		<form>
  			<div class="row">
   			 <div class="col">
    			 <input type="text" class="form-control" placeholder="Città">
  			 </div>
   			<div class="col">
      			<input type="text" class="form-control" placeholder="Provincia">
    		</div>
  			</div>
		</form>
		<input class="form-control form-control-lg" type="text" placeholder="Indirizzo">
		<input class="form-control form-control-lg" type="text" placeholder="Email">
		<input class="form-control form-control-lg" type="password" placeholder="Password">
		<input class="form-control form-control-lg" type="password" placeholder="Conferma Password">
	</div><br>
	<div style="text-align:center;">
		<button type="button" href ="#" class="btn btn btn-outline-success">Clicca per Registrarti</button>
	</div>
	
	


</body>
</html>