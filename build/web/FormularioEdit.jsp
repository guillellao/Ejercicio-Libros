<%-- 
    Document   : FormularioEdit
    Created on : 08-05-2013, 06:18:14 PM
    Author     : Tommy
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Editorial</title>
    </head>
    <body>
        <h1>Agregar Editorial</h1>
        <%List errorMsgs1 = (List) request.getAttribute("errorMsgs1");
        if(errorMsgs1 != null){%>
        
        <h2>Mensaje de Error</h2>
        <font color='red'>Por favor corrija los errores:
        <ul>
        <%Iterator items= errorMsgs1.iterator();
        while(items.hasNext()){
            String messages=(String) items.next();%>
            
        <li><%=messages%></li>
        <%}%>
       </ul> 
        </font>
        
        <%
        }
        String nombre= request.getParameter("nombre");
        String direc=request.getParameter("direc");
        String ano=request.getParameter("ano");
        %>
        
        
        
        
        <form action='addEdit.do' method='POST'>
            Nombre: <input type='text' name='nombre'
                           <%if (nombre==null){
                               nombre="";
                           }%>
                     value='<%=nombre%>'/> <br/> 
            Direccion: <input type='text' name='direc' 
                              <%if(direc==null){
                                  direc="";
                              }%>
                             value='<%=direc%>' /><br/><br/>
            Año Inicio: <select name='ano'>
                <option value='2000'>2000</option>
                <option value='2001'>2001</option>
                <option value='2002'>2002</option>
                <option value='2005'>2005</option>
                <option value='2007'>2007</option>
                <option value='2008'>2008</option>
                <option value='2010'>2010</option>
                <option value='2013'>2013</option>
        </select><br/><br/>
        
        <input type='submit' value='Agregar Editorial'/>
            
            
        </form>
        
        
    </body>
</html>
