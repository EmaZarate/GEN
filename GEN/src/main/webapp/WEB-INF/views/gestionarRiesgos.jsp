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
	<h4>Gestionar de Riesgos</h4>
	<br>
	
<table id="dtBasicExample" class="table table-striped table-bordered">
  <thead>
    <tr>
      <th class="th-sm">Nombre 
      </th>
      <th class="th-sm">Fecha inicio
      </th>
      <th class="th-sm">Estado
      </th>
      <th class="th-sm">Descripcion
      </th>
      <th class="th-sm">Tipo de Riesgo
      </th>
      <th class="th-sm">Ciudad
      </th>
      <th class="th-sm">Provincia
      </th>
      <th class="th-sm">Modificar
      </th>
      <th class="th-sm">Eliminar
      </th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${ries}" var="ries">
		<tr>
		 <td><c:out value="${ries.nombre}" /></td>
		 <td><c:out value="${ries.fecha_inicio}" /></td>
		 <td><c:out value="${ries.estado}" /></td>
		 <td><c:out value="${ries.descripcion}" /></td>
		 <td><c:out value="${ries.tipoRiesgo.nombre}" /></td>
		 <td><c:out value="${ries.ciudad.getNombre()}" /></td>
		 <td><c:out value="${ries.provincia.nombre}" /></td>				
		 <td><a href="modificarRiesgo?id=${ries.idriesgo}"><button type="button" class="btn btn-warning"><i class="fas fa-edit"></i></button></a></td>
		 <td><a href="eliminarRiesgo?id=${ries.idriesgo}"><button type="button" class="btn btn-danger"><i class="far fa-trash-alt"></i></button></a></td>			
		</tr>
	</c:forEach>
  </tbody>
</table>
	
	
</div>

<script>
$(document).ready(function () {
	$('#dtBasicExample').DataTable();
	$('.dataTables_length').addClass('bs-select');
	});
</script>

 <%@ include file="includes/footer.jsp" %>      

</body>

</html>