import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  


public class HelloServlet extends HttpServlet {  

    @Override  
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        PrintWriter out = response.getWriter();  
        out.println("Hello Servlet TEST");  
    }  
}  
