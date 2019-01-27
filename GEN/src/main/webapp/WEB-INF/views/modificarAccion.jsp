<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="includes/head.jsp" %>
<%@ include file="includes/navbar.jsp" %>
<body>

<div class="container margentop">    
	<h4>Alta de nuevo riesgo</h4>
	<br>
	<form:form class="border border-light p-5" role="form" id="modiAcc" action="modiAcc" method="post" modelAttribute="acc">
	<<!--First row-->
	    <div class="row">
	        <!--First column-->
	        <div class="col-md-6">
	            <div class="md-form">
	            	<i class="fa fa-fire prefix"></i>
	            	<form:input type="hidden" path="id_Accion" class="form-control" />
	                <form:input type="text" path="nombre" class="form-control" required="true"/>
	    			<label for="nombre" class="textcontrol">Nombre de la Accion</label>
	            </div>
	        </div>
	    </div>
	    
	    <div class="row">
	    <div class="col-md-6">
	               <div class="md-form">
                      <div class="form-group">
					    <form:select id="cmtr" path="estado" class="form-control" required="true">
					  	 	 <form:option value="Iniciado" label="Iniciado" />
					  	 	 <form:option value="Finalizado" label="Finalizado" />
					  	 	 <form:option value="Cancelado" label="Cancelado" />
						</form:select>
					  </div>
	            </div>
	        </div>
	    
	        <!--Second column-->
	        <div class="col-md-4">
	               <div class="md-form">
                      <div class="form-group">
					    <form:select id="cmta" path="id_tipo_Accion" class="browser-default custom-select form-control" required="true">
						   	 <form:option value="1" label="Seleccione el tipo de riesgo" />
					  	  	 <form:options items="${ta}" itemValue="idTipo_accion" itemLabel="descripcion" />
						</form:select>
					  </div>
	            </div>
	        </div>
	        </div>
	     
	    <!--/.First row-->
	    
	    <div class="row">
	        <!--First column-->
	        <div class="col-md-12">
	            <div class="md-form">
	            	<i class="fa fa-font prefix"></i>
	                <form:textarea type="text" id="descripcion" path="descripcion" class="md-textarea " required="true"/>
	                <label for="desc" class="textcontrol">Descripción de la accion</label>
	            </div>
	
	        </div>
	    </div>
	   
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
