
<%@ include file="includes/head.jsp" %>
<body>
<%@ include file="includes/navbar.jsp" %>
    
<div class="container">
	<div class="col-md-6 login">
	 <!-- Default form login -->
	<form class="text-center border border-light p-5">
	
	    <p class="h4 mb-4">Ingresar a GEN</p>
	
	    <!-- Email -->
	    <input type="email" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail">
	
	    <!-- Password -->
	    <input type="password" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Password">
	
	    <div class="d-flex justify-content-around">
	        <div>
	            <!-- Forgot password -->
	            <a href="">¿Olvidaste tu contraseña?</a>
	        </div>
	    </div>
	
	    <!-- Sign in button -->
	    <button class="btn btn-info btn-block my-4" type="submit">Ingresar</button>
	
	    <!-- Register -->
	    <p>¿No eres miembro?
	        <a href="">Pedir cuenta</a>
	    </p>

	
	</form>
	<!-- Default form login -->
	</div>
</div>


 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
