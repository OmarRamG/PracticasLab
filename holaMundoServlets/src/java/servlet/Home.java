
package servlet;

/**
 *
 * @author Omar Ramírez Gaytán
 * @version 1.0
 * 
 * Importaciones
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Home", urlPatterns = {"/Home"})
public class Home extends HttpServlet {

    /**
     * Método para procesar el pedido del servlet
     * @param request pedido del servlet
     * @param response respuesta del servlet
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Despliega la página a través de combinar java y HTML */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Home</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola Mundo</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    /**
     * Método para atender la petición, manda a llamaral método processRequest()
     * @param request pedido del servlet
     * @param response respuesta del servlet
     * @throws ServletException si ocurre un error
     * @throws IOException si ocurre un error
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Método que atiende a la petición del servlet
     * @param request pedido del servlet
     * @param response respuesta del servlet
     * @throws ServletException si ocurre un error
     * @throws IOException si ocurre un error
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Método que regresa una descripción del servlet
     * @return String con la descripción del Servlet
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
