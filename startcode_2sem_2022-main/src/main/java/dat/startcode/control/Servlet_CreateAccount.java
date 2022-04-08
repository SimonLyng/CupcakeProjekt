package dat.startcode.control;

import dat.startcode.model.config.ApplicationStart;
import dat.startcode.model.entities.User;
import dat.startcode.model.exceptions.DatabaseException;
import dat.startcode.model.persistence.ConnectionPool;
import dat.startcode.model.persistence.UserMapper;

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
    private ConnectionPool connectionPool;

    @Override
    public void init() throws ServletException {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserMapper userMapper = new UserMapper(connectionPool);
        String role = "User";
        try {
            userMapper.createUser(FirstName, LastName, email, password, role);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
