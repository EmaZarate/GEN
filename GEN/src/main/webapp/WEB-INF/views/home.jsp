
<%@ include file="includes/head.jsp" %>
<body>
<%@ include file="includes/navbar.jsp" %>
                      
<div class="container-fluid">
	<div id="mapid"></div>
	 <!--llamada Leaflet-->
	    <script src="https://unpkg.com/leaflet@1.2.0/dist/leaflet.js"
	    integrity="sha512-lInM/apFSqyy1o6s89K4iQUKg6ppXEgsVxT35HbzUupEVRh2Eu9Wdl4tHj7dZO0s1uvplcYGmt3498TtHq+log=="
    crossorigin=""></script>   
</div> 
    
    
<div class="separator" style="clear: both; text-align: center;">
<a href="http://wwlln.net/WWLLN_movies/Movie_of_Lightning_in_Americas_BIG.gif" imageanchor="1" style="clear: left; float: left; margin-bottom: 1em; margin-right: 1em;"><img border="0" height="400" src="http://wwlln.net/WWLLN_movies/Movie_of_Lightning_in_Americas_BIG.gif" width="390" /></a></div>
<span style="font-family: &quot;arial&quot; , &quot;helvetica&quot; , sans-serif;"><span style="color: blue; font-size: large;"><b><br /></b></span></span><span style="font-family: &quot;arial&quot; , &quot;helvetica&quot; , sans-serif;"><br /></span><br />    

<div class="separator" style="clear: both; text-align: center;">
</div>
<div class="separator" style="clear: both; text-align: center;">
<a href="http://wublast.wunderground.com/cgi-bin/WUBLAST?lat=-38&amp;lon=-60&amp;width=640&amp;height=640&amp;gtt=108&amp;num=10&amp;delay=25&amp;key=sat_ir4&amp;zoom=2&amp;basemap=1&amp;borders=1&amp;theme=WUBLAST_WORLD&amp;extension=gif&amp;proj=ll" imageanchor="1" style="clear: left; float: left; margin-bottom: 1em; margin-right: 1em;"><img border="0" data-original-height="640" data-original-width="640" height="400" src="http://wublast.wunderground.com/cgi-bin/WUBLAST?lat=-38&amp;lon=-60&amp;width=640&amp;height=640&amp;gtt=108&amp;num=10&amp;delay=25&amp;key=sat_ir4&amp;zoom=2&amp;basemap=1&amp;borders=1&amp;theme=WUBLAST_WORLD&amp;extension=gif&amp;proj=ll" width="400" /></a></div>
<span style="color: #444444; font-family: &quot;arial&quot; , &quot;helvetica&quot; , sans-serif; font-size: large;"><b style="background-color: white;"><span style="color: blue;"><br /></span></b></span></div>
<div style="text-align: left;">
<span style="font-family: &quot;arial&quot; , &quot;helvetica&quot; , sans-serif;"><br /></span></div>


<script>
	var mymap = L.map('mapid').setView([-32.955096650, -60.655925274], 14);

	L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
		maxZoom: 18,
		id: 'mapbox.streets'
	}).addTo(mymap);

	var circle = L.circle([-32.955096650, -60.625925274], {
	    color: 'red',
	    fillColor: '#f03',
	    fillOpacity: 0.5,
	    radius: 500
	}).addTo(mymap);
	circle.bindPopup("Agua en la calzada");

</script>

 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
