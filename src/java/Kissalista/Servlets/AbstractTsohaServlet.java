package Kissalista.Servlets;

import Kissalista.Models.UserSession;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David Consuegra
 */
abstract public class AbstractTsohaServlet extends HttpServlet {
    
    /** Shows a JSP page with u custom page template
     *
     * @param page The JSP page to show
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException
     * @throws IOException
     */
    protected void showJSP(String page, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
    
    protected void setError(String err, HttpServletRequest request) {
        request.setAttribute("pageError", err);
    }
    
    protected void redirect(String sivu, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath()+"/"+sivu);
    }
    
    protected boolean redirectUnauthorizedUsers(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserSession session = new UserSession(request);
        if (session.getCurrentUser() == null) {
            redirect("Login", request, response);
            return true;
        }
        
        return false;
    }
    
}