<%-- 
    Document   : FormularioLib
    Created on : 02-05-2013, 11:02:52 AM
    Author     : Tommy
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario agregar Libro</title>
    </head>
    <body>
        <h1>Agregar Libro</h1>
        <%List errorMsgs =(List) request.getAttribute("errorMsgs");
        if (errorMsgs != null) { %>
        
        <h2> Mensaje de Error</h2>
        <font color='red'> Por favor corrija los siguientes errores:
        <ul>
        <% Iterator items= errorMsgs.iterator();
        while (items.hasNext()) {
            String message =(String) items.next();%>
            <li><%=message%> </li>
            
        <%
        }
        
        %>
        
        </ul>
        </font>
        <%
        }
        
        String titulo= request.getParameter("titulo");
        String autor=request.getParameter("autor");
        String genero=request.getParameter("genero");
        String agno=request.getParameter("año");
        String valor=request.getParameter("valor");
        String nuevoGenero=request.getParameter("nuevoGenero");
            %>
            
        <form action='addLib.do' method='POST'>
               
        Titulo:<input type='text' name='nombre'
                <% if (titulo==null){
                    titulo="";
                }%>
        value='<%=titulo%>'/> <br/><br/>
                
        Autor:<input type='text' name='autor'
               <% if (autor==null){
                   autor="";
               }%>
        value='<%=autor%>'/><br/><br/>
        
        Género: <select name='genero'>
              <option value='Ciencia Ficcion'> Ciencia Ficción </option>
              <option value='Drama'> Drama </option>
              <option value='Comedia'>Comedia</option>
           </select>
           o Nuevo Género: <input type='text' name='nuevoGenero'
           <%if (nuevoGenero == null) {
              nuevoGenero = "";
           }%>
           value = '<%=nuevoGenero%>'/> <br/><br/>
        Año Edicion: <input type='text' name='agno'
                            <%if (agno==null){
                                agno="";
                            }%>
           value='<%=agno%>'/><br/><br/>
        
        Valor: <input type='text' name='valor'
                      <%if (valor==null){
                          valor="";
                      }
                          
                          %>
                          value='<%=valor%>'/>
        
        <input type='submit' value='Agregar Libro'/>
        </form>
                          
    </body>
</html>
