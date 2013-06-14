/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Model.Libro;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Tommy
 */
public class NewServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList libros = new ArrayList();
        libros.add(new Libro("Papeluho","Maecela Paz","Infantil","1980",5000));
        libros.add(new Libro("Holaaa","Juan","Drama","2000",10000));
        libros.add(new Libro("Chaooo","Pedro","Acción","2005",20000));
        
        ServletContext context=sce.getServletContext();
        context.setAttribute("LibroList", libros);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
