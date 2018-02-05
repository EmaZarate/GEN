
<%@ include file="includes/head.jsp" %>
<body>
<%@ include file="includes/navbar.jsp" %>
        
<div class="container-fliud">    
   <ul class="nav justify-content-center">
  <li class="nav-item">
    <a class="nav-link active" href="radares">Radar mas completo</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="radarMeteorologico"> Satelite meteorologico</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="radarTormentas">Tormertas activas</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled" href="radarIsobara">Cartas de isobara</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled" href="radarHumedad">Humedad</a>
  </li>
</ul>
<h2>Radar de Temperatura</h2>
<div class="separator" style="clear: both; text-align: center;">
<span style="font-family: &quot;arial&quot; , &quot;helvetica&quot; , sans-serif;"><iframe frameborder="0" height="500" src="https://embed.windyty.com/?-32.695,-61.611,5,temp,message,metric.wind.km/h" width="400"></iframe><br /></span>
<div class="separator" style="clear: both; text-align: center;"> 
   





</div> 



 <%@ include file="includes/footer.jsp" %>      

</body>

</html>
