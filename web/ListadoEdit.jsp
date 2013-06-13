<%-- 
    Document   : ListadoEdit
    Created on : 09-05-2013, 02:30:15 AM
    Author     : Tommy
--%>

<%@page import="Model.Editorial"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de editoriales</h1>
        
        <% ServletContext context= getServletContext();
        List edits=(List) context.getAttribute("editList");%>
        
        
        
        <table border='3'>
            <tr>
                <th>Nombre</th>
                <th>Direccion</th>
                <th>año</th>
                
            </tr>
            
            <%Iterator it= edits.iterator();
            while(it.hasNext()){
               Editorial item= (Editorial) it.next();%>
               
               <tr>
                   <td><%=item.getNombre() %></td>
                   <td><%=item.getDirec() %></td>
                   <td><%=item.getAno() %></td>
               </tr>
           <%    
            }
            %>
            
        </table>
            
        
        
    </body>
</html>
