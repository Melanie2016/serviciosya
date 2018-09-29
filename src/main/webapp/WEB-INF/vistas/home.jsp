<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
	    <!-- css de estilos -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		  	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
		  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
			<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
			
			<div id="wrapper">

				<!-- Sidebar -->
				<div id="sidebar-wrapper">
					<ul class="sidebar-nav">
						<li class="sidebar-brand">
							<a href="#">
								Menú
							</a>
						</li>
						<li>
							<a href="#entrada">Entrada Producto</a>
						</li>
						<li>
							<a href="#salida">Salida Producto</a>
						</li>
						<li>
							<a href="#stock"> Mi Stock</a>
						</li>
						<!--
						<li>
							<a href="#venta">Mi Venta</a>
						</li>
						-->
					</ul>
				</div>
				<!-- /#sidebar-wrapper -->

				<!-- Menu hamburgesa icono -->
				<div class="img">
					<!--  --><a href="#menu-toggle2" id="menu-toggle2"><img src="menu.png"></a>
				</div>
				<!-- /Menu hamburguesa -->
				
				
				
				<!-- Page Content -->
				
				<div id="page-content-wrapper">
					
					<!-- FIRST Container -->
					<div class="container-fluid bg-1 text-center" id="home">
						<h1 class="margin">Bienvenido</h1>
						
						<img src="fondo1.jpg"  class="img-responsive img-circle margin" style="display:inline" alt="Bird" width="250" height="-50">
						<br>
						<br>
						<a href="#menu-toggle" class="btn btn-default btn-lg" id="menu-toggle">Comenzar</a>
					</div>
					
					
					
					<!-- SECOND Container (ENTRADA) -->
					<div class="container-fluid bg-2 text-center" id="entrada">
						<h3 class="margin"  >Entrada Producto</h3>
						<div class="form">
							<form method="POST" action="index.php" >
								<div class="form-group">
									<label for="exampleFormControlSelect1">Producto</label>
									
									<select class="form-control form-control-lg" name="idProducto" >
  										<option value="no" selected  >Seleccione su producto</option>
										<option value="1" >Bermudas</option>
										<option value="2" >Boxer</option>
									  	<option value="3" >Buzos</option>
									  	<option value="4" >Calza capri</option>
									  	<option value="5" >Calza estampada</option>
									  	<option value="6" >Calza micro</option>
										<option value="7" >Calza micro frizada</option>
										<option value="8" >Calza minibloque</option>
										<option value="9" >Calza tobillo</option>
										<option value="10" >Camperas</option>
										<option value="11" >Camperas inflables</option>
										<option value="12" >Jogging </option>
										<option value="13" >Jogging acetato</option>
										<option value="14" >Medias</option>
										<option value="15" >Musculosa top</option>
										<option value="16" >Musculosa under</option>
										<option value="17" >Pijamas</option>
										<option value="18" >Remera lisa</option>
										<option value="19" >Remera estampada</option>
										<option value="20" >Remeron</option>
										<option value="21" >Ropa interior</option>
										<option value="22" >Short</option>
										<option value="23" >Trajes de baño</option>
									</select>
									  
			
								</div>
								<br>
								<div class="form-group">
									<label for="exampleFormControlSelect2">Vendedor</label>
									<select class="form-control form-control-lg" id="exampleFormControlSelect2" name="idVendedor">
										<option value="no" selected >Seleccione</option>
									  	<option value="1" >Isa</option>
									  	<option value="2" >Juli</option>
									  	<option value="3" >Yo</option>
									</select>
								</div> 
								<br>
								<div class="form-group">
									<label for="exampleFormControlSelect2">Género</label>
									<select class="form-control form-control-lg" id="exampleFormControlSelect2" name="idGenero">
										<option value='no' selected >Seleccione</option>
									  	<option value='1' >Hombre</option>
									  	<option value='2' >Mujer</option>
									  	<option value='3' >Unisex</option>
									</select>
								</div>
								<br>
								<div class="form-group">
									<label for="exampleFormControlInput1">Cantidad</label>
									<input type="text" name="cantidad" class="form-control form-control-lg" id="exampleFormControlInput1" placeholder="Ingresar cantidad numerica">
								</div>
								
								<br>
														  
								<BR><BR>	
								<div class="form-group">
									<button type="submit" class="btn btn-default btn-lg" name="btnGuardar">Guardar</button>
								</div>
							</form>
						
						
						</div>

					</div>
					
						
							
					<!-- THIRD Container (SALIDA) -->
					<div class="container-fluid bg-3 text-center" id="salida">   
						<h3 class="margin"  >Salida Producto</h3>
						<div class="form">
							<form action="index.php" method="POST">
								<div class="form-group">
									<label for="exampleFormControlSelect1">Producto</label>
									
									<select class="form-control form-control-lg" name="idProducto" >
  										<option value="no" selected  >Seleccione su producto</option>
										<option value="1" >Bermudas</option>
										<option value="2" >Boxer</option>
									  	<option value="3" >Buzos</option>
									  	<option value="4" >Calza capri</option>
									  	<option value="5" >Calza estampada</option>
									  	<option value="6" >Calza micro</option>
										<option value="7" >Calza micro frizada</option>
										<option value="8" >Calza minibloque</option>
										<option value="9" >Calza tobillo</option>
										<option value="10" >Camperas</option>
										<option value="11" >Camperas inflables</option>
										<option value="12" >Jogging </option>
										<option value="13" >Jogging acetato</option>
										<option value="14" >Medias</option>
										<option value="15" >Musculosa top</option>
										<option value="16" >Musculosa under</option>
										<option value="17" >Pijamas</option>
										<option value="18" >Remera lisa</option>
										<option value="19" >Remera estampada</option>
										<option value="20" >Remeron</option>
										<option value="21" >Ropa interior</option>
										<option value="22" >Short</option>
										<option value="23" >Trajes de ba&ntilde;o</option>
									</select>
									  
			
								</div>
								<br>
								<div class="form-group">
									<label for="exampleFormControlSelect2">Vendedor</label>
									<select class="form-control form-control-lg" id="exampleFormControlSelect2" name="idVendedor">
										<option value="no" selected >Seleccione</option>
									  	<option value="1" >Isa</option>
									  	<option value="2" >Juli</option>
									  	<option value="3" >Yo</option>
									</select>
								</div> 
								<br>
								<div class="form-group">
									<label for="exampleFormControlSelect2">Género</label>
									<select class="form-control form-control-lg" id="exampleFormControlSelect2" name="idGenero">
										<option value="no" selected>Seleccione</option>
									  	<option value="1">Hombre</option>
									  	<option value="2">Mujer</option>
									  	<option value="3">Unisex</option>
									</select>
								</div>
								<br>
								<div class="form-group">
									<label for="exampleFormControlInput1">Cantidad</label>
									<input type="text" class="form-control form-control-lg" name="cantidad" id="exampleFormControlInput1" placeholder="Ingresar cantidad numerica">
								</div>
								 
								<BR><BR>	
								<div class="form-group">
									<button type="submit" class="btn btn-default btn-lg" name ="btnGuardar2" >Guardar</button>
	
								</div>
									
									
							</form>
						
						
						</div>

					</div>
									
					
							
					<!-- FOUR Container (STOCK) -->
					<div class="container-fluid bg-4 text-center" id="stock">   
						<h3 class="margin"  > Mi Stock</h3>
						<div>
					
							

							<table class="table table-hover">
								<thead>
								  <tr>
									
									<th>Producto</th>
									
									<th>Cantidad Total</th>
									
									  

								  </tr>
								</thead>

								<tbody id="renglon">
								
										<?PHP 
										include_once("conexion.php");
										$link= Conectarse();
										$result=mysqli_query($link,
										"SELECT  p.idProducto, p.nombre, SUM(cantidad) cantidad 
										FROM producto p join stock s on p.idProducto = s.idProducto 
										GROUP BY p.nombre	");
										$output=array();
										
									
									
										while($fila=mysqli_fetch_array($result)){ // tabla con los datos cargados por el admin
											echo"<tr>";
												"<td>".$fila["idProducto"]."</td>";
												echo"<td>".$fila["nombre"]."</td>";
												echo"<td>".$fila["cantidad"]."</td>";
												

												//botones 
												
												echo"<td><a href='elegirVendedor.php?nombre=" . $fila["nombre"] . "'> <button class=btn  type=button>Ver Detalle </button></a></th>";
												echo"<td><a href='#salida'> <button class=btn  type=button>Eliminar</button></a></td>";
												echo"</tr>";
												
										  }
										 ?>   	   
								</tbody>

							</table>	
							
							
							
						</div>

					</div>
					
												
					<!-- FIVE Container (VENTA) -->
					<!--
					<div class="container-fluid bg-5 text-center" id="venta">   
						<h3 class="margin" > Mis Ventas</h3>
						<div>
							<table class="table table-hover">
								<thead>
								  <tr>
									<th>Id</th>
									<th>Stock general</th>
									<th>Cantidad general</th>
									<th>Mis ventas</th>
								  </tr>
								</thead>

								<tbody>
									
									<?PHP 
									/*
									include_once("conexion.php");
									$link= Conectarse();
									$result=mysqli_query($link,"SELECT * FROM producto GROUP BY idProducto");
									$output=array();

									while($fila=mysqli_fetch_array($result)){ // tabla con los datos cargados por el admin
										echo"<tr>";
											echo"<td>".$fila["idProducto"]."</td>";
											echo"<td>".$fila["nombre"]."</td>";
											echo"<td>".$fila["genero"]."</td>";
											echo"<td>".$fila["cantidad"]."</td>";
											
											
											//botones
											echo"<td><a href='generador_pdf.php?idViaje=" . $fila["id_viaje"] . "'> <button class=btn  type=button>PDF </button></a></td>";
											echo"<td><a href='abm_viaje.php?accion=datos_modificacion&idviaje=".$fila["id_viaje"]."'><button class=btn  type=button> Modificar </button></a></td>";
											echo"<td><a href='abm_viaje.php?accion=baja&idviaje=".$fila["id_viaje"]."'><button class=btn  type=button >Eliminar </button></a></td>";
											
										echo"</tr>";
									  }
										*/
									 ?>      
								</tbody>

							</table>							
						</div>

					</div>
					-->
					
					
					<!-- Footer -->
					<footer class="container-fluid bg-6 text-center">
					  <p>Facebook : Mel Lugones <a href="https://www.facebook.com/mel.lugones">www.facebook.com/mel.lugones</a></p> 
						
						
					</footer>		
					
				
						

				</div>
				<!-- /#page-content-wrapper -->

						
						
			</div>
			<!-- /#wrapper -->



			
			<!-- Bootstrap core JavaScript 
			<script src="vendor/jquery/jquery.min.js"></script>
			<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>	
			-->
			<!-- Menu Toggle Script -->
			<script>
				$("#menu-toggle").click(function(e) {
					e.preventDefault();
					$("#wrapper").toggleClass("toggled");
				});
				
				
			</script>
							
			<script>
				$("#menu-toggle2").click(function(e) {
					e.preventDefault();
					$("#wrapper").toggleClass("toggled");
				});
				
				
			</script>
		</body>

</html>