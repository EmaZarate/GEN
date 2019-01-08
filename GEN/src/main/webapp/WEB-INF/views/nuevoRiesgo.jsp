<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="includes/head.jsp" %>
<%@ include file="includes/navbar.jsp" %>
<body>

<div class="container margentop">    
	<h4>Alta de nuevo riesgo</h4>
	<br>
	<form:form class="border border-light p-5" role="form" id="crearRiesgo" action="crearRiesgo" method="post" modelAttribute="rie">
	<!--First row-->
	    <div class="row">
	        <!--First column-->
	        <div class="col-md-6">
	            <div class="md-form">
	            	<i class="fa fa-fire prefix"></i>
	                <form:input type="text" path="nombre" class="form-control"/>
	    			<label for="nombre" class="textcontrol">Nombre del riesgo</label>
	            </div>
	        </div>
	    
	        <!--Second column-->
	        <div class="col-md-4">
	               <div class="md-form">
                      <div class="form-group">
					    <form:select path="tipo_riesgo" class="browser-default custom-select form-control">
						  <option selected>Tipo de riesgo</option>
						  <option value=1>Inundacion</option>
						  <option value=2>Incendio</option>
						  <option value=3>Otro</option>
						</form:select>
					  </div>
	            </div>
	        </div>
	        </div>
	     
	    <!--/.First row-->
	    <!--second row-->
	    <div class="row">
	
	       
	     <div class="col-md-4">
	               <div class="md-form">
                      <div class="form-group">
					    <form:select id="cmciu" path="prv" class="form-control">
    					  <form:option value="0" label="Selecciona Provincia" />
						  <form:options items="${prvs}" itemValue="id_provincia" itemLabel="nombre" />
						</form:select>
					  </div>
	            </div>
	        </div>
	
	      <div class="col-md-4">
	               <div class="md-form">
                      <div class="form-group">
					    <form:select id="cmciu" path="ciu" class="form-control">
    					  <form:option value="0" label="Selecciona Ciudad" />
					 <!--/ <form:options items="${cius}" itemValue="id_ciudad" itemLabel="nombre" />-->
						</form:select>
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
	                <form:input type="textarea" id="desc" path="descripcion" class="md-textarea "/>
	                <label for="desc" class="textcontrol">Descripción del riesgo</label>
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
	            <button type="submit" class="btn btn-success">Guardar</button>
	    	 </div>
	        </div>
	    </div>
	    <!--/.Fourth row-->
	</form:form>
</div>

 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
