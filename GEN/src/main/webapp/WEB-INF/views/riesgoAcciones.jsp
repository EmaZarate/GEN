<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="includes/head.jsp" %>
<%@ include file="includes/navbar.jsp" %>
<body>

<c:if test="${not empty msj}">
	<div class="alert alert-success alert-dismissible text-centro" role="alert">
						<button type="button" class="close" data-dismiss="alert" aria-label="Cerrar" ><span aria-hidden="true">&times;</span>	</button>
						<strong><c:out value="${msj}"></c:out></strong>
	</div>  
</c:if>


<div class="container margentop">    
	<h4>Habilitar usuarios:</h4>
	
	

	
</div>

 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
