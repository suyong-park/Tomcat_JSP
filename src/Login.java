import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String back = request.getParameter("fail");

        if(back.equals("back"))
            response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("user");
        String passwd = request.getParameter("pass");

        if(name.equals("admin") && passwd.equals("pass"))
            response.sendRedirect("welcome.jsp");
        else
            response.sendRedirect("fail.jsp");
    }
}
