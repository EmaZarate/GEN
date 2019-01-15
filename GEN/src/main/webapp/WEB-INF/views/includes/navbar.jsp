              
<!--Navbar-->
<nav class="navbar sticky-top navbar-expand-lg navbar-dark indigo">

  <a class="navbar-brand" href="/GEN">
        <img src="resources/img/GEN/huracanes-tifones-019.png" height="30" class="d-inline-block align-top" alt="">
        GEN
    </a>

    <!-- Collapse button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
        aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>

    <!-- Collapsible content -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <!-- Links -->
        <ul class="navbar-nav mr-auto">
                        
             <!-- Dropdown -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Riesgos</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="nuevoRiesgo">Nuevo Riesgo</a>
                    <a class="dropdown-item" href="nuevoTipoRiesgo">Nuevo Tipo de Riesgo</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Acciones</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="nuevaAccion">Nueva Accion</a>
                    <a class="dropdown-item" href="nuevoTipoAccion">Nuevo Tipo de Accion</a>
                </div>
            </li>
            <!-- Dropdown -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Mapas</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="mapaInteractivo">Mapas</a>
                    <a class="dropdown-item" href="aviacion">Mapas para aviacion</a>
                </div>
            </li>

        </ul>
        <!-- Links -->

        <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="modal"  data-target="#modalContacto"><i class="fa fa-envelope"></i> Contacto <span class="sr-only">(current)</span></a>
                        </li>
                        
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user"></i>
                             ${usuario.getUsuario()}</a>
                            <div class="dropdown-menu dropdown-menu-right dropdown-cyan" aria-labelledby="navbarDropdownMenuLink-4">
                             	<% if (session.getAttribute("usuario") == null){%>
                             	<a class="dropdown-item" href="login">Login</a>
                             	<%}%>
                             	<% if (session.getAttribute("usuario") == null){%>
                             	<a class="dropdown-item" href="nuevoUsuario">Crear cuenta</a>
                             	<%}%>
                             	<% if (session.getAttribute("usuario") != null){%>
                                <a class="dropdown-item" href="micuenta">Mi cuenta</a>
                                <%}%>
                                <% if (session.getAttribute("usuario") != null){%>
                                <a class="dropdown-item" href="finsesion">cerrar sesion</a>
                                <%}%>
                            </div>
                        </li>
        </ul>
    </div>
    <!-- Collapsible content -->

<!-- Button trigger modal -->

</nav>
<!--/.Navbar-->
                