/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Model.Editorial;
import java.util.ArrayList;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Tommy
 */
public class NewServletListener1 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList edits=new ArrayList();
        edits.add(new Editorial("hola","chao","2000"));
        edits.add(new Editorial("bien","mal","2012"));
        edits.add(new Editorial("bonito","feo","2005"));
        
        ServletContext context= sce.getServletContext();
        context.setAttribute("editList", edits);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
