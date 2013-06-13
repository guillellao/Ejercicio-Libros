<%-- 
    Document   : ListadoLibro
    Created on : 06-05-2013, 01:49:59 AM
    Author     : Tommy
--%>

<%@page import="Model.Libro"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Libros</title>
    </head>
    <body>
        <H1>Listado Libros</H1>
        <%ServletContext context= getServletContext();
        List libros=(List)context.getAttribute("LibroList");
            %>
        
        
        <table border='4' cellspacing='0' cellpadding='5'>
           <tr>
              <th>TITULO</th>
<th>GENERO</th>
              <th>VALOR</th>
           </tr>

           <%Iterator it = libros.iterator();
             while (it.hasNext()) {
                Libro item = (Libro) it.next();%>
                <tr>
                    <td><%=item.getTitulo() %></td>
                
                    <td><%=item.getGenero() %></td>
                    <td><%=item.getValor()%></td>
                </tr>
            <%
             }
             %>
           </table>
           <br><br><br><h4>Fin del listado...</h4>   
    </body>
</html>
