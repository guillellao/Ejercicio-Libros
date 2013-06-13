<%-- 
    Document   : SucesoLib
    Created on : 06-05-2013, 01:23:01 AM
    Author     : Tommy
--%>

<%@page import="Model.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicaci&oacute;n Libros</title>
    </head>
    <body>
        
        <% Libro libroItem = (Libro) request.getAttribute("libroItem"); %>
        
        <h1>Suceso agregar libro</h1>
        
        Se agreg&oacute; el siguiente libro:<br/>
        TITULO: <%=libroItem.getTitulo() %><br/>
        AUTOR: <%=libroItem.getAutor() %><br/>
        GENERO: <%=libroItem.getGenero() %><br/>
        AÑO: <%=libroItem.getAgno() %><br/>
        VALOR: <%=libroItem.getValor() %><br/>
        
        <br/><a href='index.jsp'>HOME</a>
        
    </body>
</html>
