/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Libro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tommy
 */
public class añadirLibServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet añadirLibServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet añadirLibServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>"); 
            */
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        
        List errorMsgs= new LinkedList();
        //String valor="";
        //recupero parametros del formulario
        try{
            
        String titulo= request.getParameter("nombre");
        String autor= request.getParameter("autor");
        String genero= request.getParameter("nuevoGenero");
        String agno=request.getParameter("agno");
        String valor=request.getParameter("valor");
        
                if(valor==null||valor.trim().length()==0){
            errorMsgs.add("Por favor debe ingresar el campo valor");
        }
        /*try{
            valor= Integer.parseInt(request.getParameter("valor"));
        }catch(NumberFormatException e){
            errorMsgs.add("En el campo valor debe ingresar un número.");
        }*/
        if((genero==null)||(genero.trim().length()==0)){
            genero=request.getParameter("genero");
            
        }
        //verificacion formulario

        
        if(titulo==null||titulo.trim().length()==0){
            errorMsgs.add("Por favor debe ingresar titulo del libro");
        }
        if(autor==null||autor.trim().length()==0){
            errorMsgs.add("Debe ingresar el autor del libro");
        }
        if(agno==null||agno.trim().length()==0){
            errorMsgs.add("Debe ingresar el año");
        }
        
        if(!errorMsgs.isEmpty()){
            request.setAttribute("errorMsgs", errorMsgs);
            RequestDispatcher view=request.getRequestDispatcher("/FormularioLib.jsp");
            view.forward(request, response);
            return;
        }
        //logica de negocios
        Libro item= new Libro(titulo, autor, genero, agno, valor);
        
        ServletContext context= getServletContext();
        List Libros=(List)context.getAttribute("LibroList");
        Libros.add(item);
        
        request.setAttribute("libroItem", item);
        
        RequestDispatcher view= request.getRequestDispatcher("/SucesoLib.jsp");
        view.forward(request, response);
        
        }catch(RuntimeException e){
            PrintWriter out= response.getWriter();
            out.println("ERROR:"+ e.getMessage());
            out.close();
        }          
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
