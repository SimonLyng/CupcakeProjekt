package dat.startcode.model.entities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "Servlet_Products", value = "/Servlet_Products")
public class Servlet_Products extends HttpServlet {

    HashMap<String,Products> Bottoms = new HashMap<String, Products>();
    HashMap<String, Products> Toppings = new HashMap<String, Products>();
    public void init() {
        //bottoms
        Products products0 = new Products("Chokolade", 5);
        Products products1 = new Products("Vanijle", 5);
        Products products2 = new Products("Pistache", 5);
        Products products3 = new Products("Mandel", 6);
        Products products4 = new Products("Muskatnød", 7);
        //tops
        Products products5 = new Products("Chokolade", 5);
        Products products6 = new Products("Blåbær", 5);
        Products products7 = new Products("Hindbær", 5);
        Products products8 = new Products("Jordbær", 6);
        Products products9 = new Products("Citron", 7);
        Products products10 = new Products("Rosin", 8);
        Products products11 = new Products("Appelsin", 8);
        Products products12 = new Products("Blå ost", 9);

        Bottoms.put(products0.getSmag(),products0);
        Bottoms.put(products1.getSmag(),products1);
        Bottoms.put(products2.getSmag(),products2);
        Bottoms.put(products3.getSmag(),products3);
        Bottoms.put(products4.getSmag(),products4);

        Toppings.put(products5.getSmag(),products5);
        Toppings.put(products6.getSmag(),products6);
        Toppings.put(products7.getSmag(),products7);
        Toppings.put(products8.getSmag(),products8);
        Toppings.put(products9.getSmag(),products9);
        Toppings.put(products10.getSmag(),products10);
        Toppings.put(products11.getSmag(),products11);
        Toppings.put(products12.getSmag(),products12);



    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("Bottoms", Bottoms);
        servletContext.setAttribute("Toppings", Toppings);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
