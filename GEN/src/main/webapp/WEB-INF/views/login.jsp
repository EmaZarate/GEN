<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="includes/head.jsp" %>
<body>
<%@ include file="includes/navbar.jsp" %>

    
<div class="container">
	<div class="col-md-6 login">
	 <!-- form login -->
	 
	<form:form class="text-center border border-light p-5" role="form" id="valida" action="validar" method="POST" modelAttribute="usu">
	
	    <p class="h4 mb-4">Ingresar a GEN</p>
	    <!-- Email -->
		<form:input path="usuario" class="form-control mb-4" type="text" placeholder="Usuario"/>	
	    <!-- Password -->
	    <form:input  path="clave"  class="form-control mb-4"  type="password" placeholder="Password"/>
	
	    <div class="d-flex justify-content-around">
	        <div>
	            <!-- Forgot password -->
	            <a href="">¿Olvidaste tu contraseña?</a>
	            <div class='error'><c:out value="${error}"></c:out></div>
	        </div>
	    </div>
	
	    <!-- Sign in button -->
	    <button class="btn btn-info btn-block my-4" type="submit">Ingresar</button>
	
	    <!-- Register -->
	    <p>¿No eres miembro?
	        <a href="">Pedir cuenta</a>
	    </p>

	
	</form:form>
	<!-- Default form login -->
	</div>
</div>


 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
