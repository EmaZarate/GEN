
<%@ include file="includes/head.jsp" %>
<body>
<%@ include file="includes/navbar.jsp" %>
        
                     
<div class="container-fluid" style="height:100%;">
  <div class="row">
	<div id="mapid"></div>
	 <!--llamada Leaflet-->
	    <script src="https://unpkg.com/leaflet@1.2.0/dist/leaflet.js"></script>   
  </div>
</div> 
    



<script>
	var mymap = L.map('mapid').setView([-32.955096650, -60.655925274], 14);
	L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
		maxZoom: 18,
		id: 'mapbox.streets'
	}).addTo(mymap);

	<c:forEach items="${ries}" var="rie">
	
	var lon = ${rie.getLongitud()}
	var lat = ${rie.getLatitud()}
	var tamaño = ${rie.getTamaño()}
	var color = '${rie.getColor()}'
	//var circle = L.circle([-32.955096650, -60.625925274], {
	var circle = L.circle([lon,lat], {
	    color:color,
	    fillColor: color,
	    fillOpacity: 0.3,
	    radius: tamaño
	}).addTo(mymap);
	 var customOptions =
     {
     'maxWidth': '500',
     'className' : 'custom'
     }
	 
	 var customPopup ="<p><h2>Riesgo:${rie.getNombre()} </h2></p><p><img src='${rie.getImagen()}' alt='maptime logo gif' width='350px'/></p><p>Descripcion:${rie.getDescripcion()}</p><p>Estado:${rie.getEstado()}</p>" ;
	circle.bindPopup(customPopup,customOptions);
	
	var popup = L.popup();

	</c:forEach>
	
</script>

 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
