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
        <%ServletContext context= getServletContext();
        List libros=(List)context.getAttribute("LibroList");
            %>
        <h3>Actualmente tiene<b><%= libros.size() %></b> LIBROS  en su coleccion<br><br><br></h3>
        
        <table border='4' cellspacing='0' cellpadding='5'>
           <tr>
              <th>TITULO</th>
              <th>AUTOR</th>
              <th>GENERO</th>
              <th>AÑO</th>
              <th>VALOR</th>
           </tr>

           <%Iterator it = libros.iterator();
             while (it.hasNext()) {
                Libro item = (Libro) it.next();%>
                <tr>
                    <td><%=item.getTitulo() %></td>
                    <td><%=item.getAutor()%></td>
                    <td><%=item.getGenero()%></td>
                    <td><%=item.getAgno()%></td>
                    <td><%=item.getValor()%></td>
                </tr>
            <%
             }
             %>
           </table>
           <br><br><br><h4>Fin del listado...</h4>   
    </body>
</html>
