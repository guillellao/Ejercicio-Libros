<%-- 
    Document   : SucesoEdit
    Created on : 09-05-2013, 03:17:51 AM
    Author     : Tommy
--%>

<%@page import="Model.Editorial"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%Editorial editItem=(Editorial) request.getAttribute("editItem"); %>
        
        
        <h1>Suceso agregar Editorial!</h1>
        Se agrego la sgte editorial:<br/><br/>
        
        NOMBRE: <%=editItem.getNombre() %><br/>
        DIRECCION:<%=editItem.getDirec() %><br/>
        AÑO:<%=editItem.getAno() %><br/>
        
        <a href="index.jsp">HOME</a>
    </body>
</html>
