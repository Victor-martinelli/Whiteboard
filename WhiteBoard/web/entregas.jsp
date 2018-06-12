<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WhiteBoard - Entregas</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <s:head/>
    </head>
    <body>

        <s:include value="header.jsp"/>
        <!-- Sidebar/menu -->
        <s:include value="sidebar.jsp"/>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px;margin-top:43px;">
            <!-- Header -->
            <header class="w3-container" style="padding-top:22px">
                <span class="w3-button w3-hide-large w3-xxlarge w3-hover-text-grey" onclick="w3_open()"><i class="fa fa-bars"></i></span>
                <h2 class="w3-container w3-center"><b><u>Entregas de la actividad - <s:property value="#session.currentActividad.nombre"/></u></b></h2>

            </header>

            <div class="w3-container">
                <ul class="w3-ul w3-card-4">
                    <s:iterator status="stat" value="#session.allEntregas" var="entrega">

                        <li class="w3-bar">
                            <div class="w3-bar-item">
                                <span class="w3-large">Nombre del Alumno: <s:property value="%{#entrega.alumnos.nombre}"/></span><br>
                                <span class="w3-large">Nota Actual: <s:property value="%{#entrega.nota}"/>/<s:property value="%{#entrega.actividades.notaMax}"/></span><br>
                            </div>
                            <h4 class="w3-padding-16">
                                <a href='../<s:property value="rutaArchivo"/>' download>
                                    <button class="fa fa-download w3-button">Descargar Entrega</button>
                                </a>
                            </h4>
                            <div class="w3-bar-item">
                                
                                <s:form namespace="/entregas" action="calificarEntrega">
                                    <s:hidden name="alumnoId" value="%{#entrega.alumnos.idUsuario}"/>
                                    <s:hidden name="actividadId" value="%{#session.currentActividad.actividadId}"/>
                                    <s:textfield name="nota" id="nota" label="Calificación"/>
                                    <s:submit name="Calificar" value="Calificar" id="Calificar"/>
                                </s:form>
                            </div>
                        </li>
                    </s:iterator>
                </ul>
            </div>
            <s:include value="scripts.jsp"/>

    </body>
</html>
