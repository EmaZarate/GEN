
<%@ include file="includes/head.jsp" %>
<%@ include file="includes/navbar.jsp" %>
<body>

<div class="container margentop">    
	<h5 >Alta de nuevo riesgo</h5>
	<br>
	<form>
	<!--First row-->
	    <div class="row">
	        <!--First column-->
	        <div class="col-md-6">
	            <div class="md-form">
	            	<i class="fa fa-fire prefix"></i>
	                <input type="text" id="form1" class="form-control">
	    			<label for="form1" class="textcontrol">Nombre del riesgo</label>
	            </div>
	        </div>
	
	        <!--Second column-->
	        <div class="col-md-6">
	            <div class="md-form">
	                <i class="fa fa-lock prefix"></i>
	                <input type="password" id="form82" class="form-control validate textcontrol">
	                <label for="form82" data-error="wrong" class="textcontrol" data-success="right">Contraseña</label>
	            </div>
	        </div>
	    </div>
	    <!--/.First row-->
	
	  
	    <!--second row-->
	    <div class="row">
	
	        <!--First column-->
	        <div class="col-md-4">
	            <div class="md-form">
	           		<i class="fa fa-map-marker-alt prefix"></i>
	                <input type="text" id="form41" class="form-control">
	                <label for="form41" class="textcontrol">Provincia</label>
	            </div>
	        </div>
	
	        <!--Second column-->
	        <div class="col-md-4">
	            <div class="md-form">
	            <i class="fas fa-city prefix"></i>
	                <input type="text" id="form51" class="form-control">
	                <label for="form51" class="textcontrol">Ciudad</label>
	            </div>
	        </div>
	
	        <!--Third column-->
	        <div class="col-md-4">
	            <div class="md-form">
					<i class="fas fa-list-ol prefix"></i>
	                 <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown"
     					 aria-haspopup="true" aria-expanded="false" class="form-control">Tipo de Riesgo</button>
	                <div class="dropdown-menu">
				      <a class="dropdown-item" href="#">Inundacion</a>
				      <a class="dropdown-item" href="#">Incendio</a>
				      <a class="dropdown-item" href="#">Terremoto</a>
				      <a class="dropdown-item" href="#">Tornado</a>
				    </div>
	            </div>
	        </div>
	
	    </div>
	    <!--Second row-->
	    <div class="row">
	        <!--First column-->
	        <div class="col-md-12">
	            <div class="md-form">
	            	<i class="fa fa-font prefix"></i>
	                <textarea id="form76" class="md-textarea "></textarea>
	                <label for="form76" class="textcontrol">Descripción del riesgo</label>
	            </div>
	
	        </div>
	    </div>
	    <!--/.Second row-->
	    <!--/.Third row-->
	    <!--Fourth row-->
	    <div class="row">
	    	<div class="col-md-7">
	    	</div>
	     	<div class="col-md-2">
	            <div class="md-form">
	            <button type="button" class="btn btn-blue-grey">Cancelar</button>
	    	 </div>
	        </div>
	        <div class="col-md-2">
	            <div class="md-form">
	            <button type="button" class="btn btn-success">Guardar</button>
	    	 </div>
	        </div>
	    </div>
	    <!--/.Fourth row-->
	</form>
</div>

 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
