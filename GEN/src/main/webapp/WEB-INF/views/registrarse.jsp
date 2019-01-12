<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="includes/head.jsp" %>
<%@ include file="includes/navbar.jsp" %>

<body>
	<form:form class="border border-light p-5" role="form" id="registrarse" action="registrarse" method="post" modelAttribute="nu">
	<!--First row-->
	    <div class="row">
	        <!--First column-->
	        <div class="col-md-6">
	            <div class="md-form">
				<i class="fas fa-signature prefix"></i>
	                <form:input type="text" path="nombre" class="form-control"/>
	    			<label for="nombre" class="textcontrol">Nombre</label>
	            </div>
	        </div>
	           <div class="col-md-6">
	            <div class="md-form">
				<i class="fas fa-signature prefix"></i>	   
                <form:input type="text" path="apellido" class="form-control"/>
	    		<label for="apellido" class="textcontrol">Apellido</label>
	            </div>
	        </div>
	    </div>
	    <!--/.First row-->
	    
	    <div class="row">
	    <div class="col-md-6">
	            <div class="md-form">
				<i class="fas fa-user prefix"></i>	   
	               <form:input type="text" path="usuario" class="form-control"/>
	    			<label for="usuario" class="textcontrol">Usuario</label>
	            </div>
	        </div>
	           <div class="col-md-6">
	            <div class="md-form">
				<i class="fas fa-key prefix"></i>
               	 <form:input type="password" path="clave" class="form-control"/>
	    			<label for="clave" class="textcontrol">Password</label>
	            </div>
	        </div>
	    </div>
	    
	    <div class="row">
	      <div class="col-md-6">
	            <div class="md-form">
				<i class="fas fa-envelope-square prefix"></i>
	                <form:textarea type="email" path="email" aria-describedby="emailHelp" class="md-textarea form-control"/>
	    			<label for="email" class="textcontrol">Email</label>
	            </div>
	      </div>
	   </div>
	   
		<!--Fourth row-->
	    <div class="row">
	    <div class="col-md-4">
	    </div>
	     	<div class="col-md-2">
	            <div class="md-form">
	            <button type="button" class="btn btn-blue-grey">Cancelar</button>
	    	 </div>
	        </div>
	        <div class="col-md-2">
	            <div class="md-form">
	            <button type="submit" class="btn btn-success">Registrarse</button>
	    	 </div>
	        </div>
	    </div>
	    <!--/.Fourth row-->
	</form:form>
</div>


 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
