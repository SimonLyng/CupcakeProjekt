package dat.startcode.model.entities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet_Payment", value = "/Servlet_Payment")
public class Servlet_Payment extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String beløb = request.getParameter("beløb");
        log("beløbet er" + beløb);
        HttpSession httpSession = request.getSession();
        int amount =0;
//0 skal ændres til card items så vi får samlet pris
        try {
            amount = Integer.parseInt(beløb);
        } catch (NumberFormatException e) {
            String Error = "Beløbet skal være et tal";

            request.setAttribute("Error", Error);
            request.getRequestDispatcher("WEB-INF/BrugerSide.jsp").forward(request, response);
        }

        User user = (User) httpSession.getAttribute("User");
        user.withdraw(amount);
        httpSession.setAttribute("User", user);
        request.getRequestDispatcher("WEB-INF/OrderConfirmation.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
