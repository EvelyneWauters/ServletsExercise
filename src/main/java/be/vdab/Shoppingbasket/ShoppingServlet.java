package be.vdab.Shoppingbasket;

/**
 * Created by Evelyne on 24/06/15.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns= "/shopping.html")
public class ShoppingServlet extends HttpServlet{
    HttpSession session;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        generateDocumentHead(out);

        out.println("<body>");
        out.println("Shopping Basket: <br/>");
        out.println("<form action='shopping.html' method='post'> Product: <input type='text' name='productName'/> <br/>");
        out.println("Choose a price: <input type='number' name='price'/> <br/> Quantity: <input type='number' name='quantity'/> ");
        out.println("<input type='submit' value='Shop till you drop!'/></form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        makeOrderObject(req);

        PrintWriter out = resp.getWriter();
        generateDocumentHead(out);
        out.println("<body>");
        out.println("<h1>Great choice! </h1> <br/>");
        out.println("<em>" + printOrderList(session, "order", out) + "</em>");
        out.println(" <br/> thanks for shopping. Have a nice day!");
        out.println("<a href='/shopping.html'>Go back to buy some more</a>");
        out.println("</body>");
        out.println("</html>");
    }

    private void makeOrderObject(HttpServletRequest req) {
        session = req.getSession();
        String name = (String) req.getParameter("productName");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        List productList = new ArrayList<>();
        productList.add(new Product(name, price, quantity));
        session.setAttribute("order",productList);
    }

    private String printOrderList(HttpSession session, String attribute, PrintWriter out)  {
        ArrayList<Product> orderList = (ArrayList<Product>) session.getAttribute(attribute);
        String s="<table>";
        for (Product p: orderList) {
            s = s + " <tr> <td>"+ p.getProductName() + "</td> <td>"+ p.getPrice() + "</td><td>"+ p.getQuantity()+"</td></tr>";
        }
        return s + "</table>";
    }

    public static void generateDocumentHead(PrintWriter out)  {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>You're in!</title>");
        out.println("<style> em{color:rgb(255,0,255);}  div{color: #669900}</style>");
        out.println("</head>");
    }

}
