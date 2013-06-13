/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Editorial;
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
public class añadirEditServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet añadirEditServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet añadirEditServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
        List errorMsgs= new LinkedList();
        
        try{
             String nombre=request.getParameter("nombre");
             String direc=request.getParameter("direc");
             String ano= request.getParameter("ano");

           /*  try{
                 nombre=Integer.parseInt(request.getParameter("nombre"));
                 }catch(NumberFormatException e){
                     errorMsgs.add("En el camp debe ir un numero");
                 }*/
           if((nombre==null)||(nombre.trim().length()==0)){
               errorMsgs.add("Ingrese nombre");
           }       
            if((direc==null)||(direc.trim().length()==0)){
               errorMsgs.add("Ingrese direccion");
           }  
            if((ano==null)||(ano.trim().length()==0)){
                errorMsgs.add("Ingrese año");
            }
            if(!errorMsgs.isEmpty()){
                request.setAttribute("errorMsgs", errorMsgs);
                RequestDispatcher view=request.getRequestDispatcher("/FormularioEdit.jsp");
                view.forward(request, response);
                
                return;
            }
                Editorial item= new Editorial(nombre, direc, ano);
                
                ServletContext context=getServletContext();
                List edits=(List)context.getAttribute("editList");
                edits.add(item);
                
                request.setAttribute("editItem", item);
                RequestDispatcher view= request.getRequestDispatcher("/SucesoEdi.jsp");
                //RequestDispatcher view=request.getRequestDispatcher("/SucesoEdit.jsp");
                view.forward(request, response);
            }catch(RuntimeException e){
                PrintWriter out =response.getWriter();
                out.println("ERROR"+e.getMessage());
                out.close();
                
                        
            }
                 
             
        
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
