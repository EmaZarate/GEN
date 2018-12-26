<% if (session.getAttribute("error") != null){
%>
	<div class="alert alert-info alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert"
			aria-label="Cerrar" >
			<span aria-hidden="true">&times;</span>
		</button>
		<strong>Error: </strong> <%= session.getAttribute("error").toString()%>   
	</div>
<%}%>