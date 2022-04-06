package dat.startcode.control;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.applet.Applet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "Servlet_CreateAccount", value = "/Servlet_CreateAccount")
public class Servlet_CreateAccount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        try {

            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql:/ /localhost:3306/test", "username", "password");

            PreparedStatement ps = con.prepareStatement
                    ("insert into profiles values(?,?,?,?)");

            ps.setString(1, FirstName);
            ps.setString(2, LastName);
            ps.setString(3, email);
            ps.setString(4, pass);
            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("You are sucessfully registered");
            }

        } catch (Exception se) {
            Logger.getLogger("web").log(Level.SEVERE, se.getMessage());
            request.setAttribute("errormessage", se.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }
}

