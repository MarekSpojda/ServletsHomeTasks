package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet042")
public class Servlet142 extends HttpServlet {

    private String products[] = {
            "Asus Transformr;2999.99",
            "iPhone 6';3499.18",
            "Converse Sneakers;125.00",
            "LG OLED55B6P OLED TV;6493.91",
            "Samsung HT-J4100;800.99",
            "Alpine Swiss Dress Belt;99.08",
            "60 Watt LED;1.50",
            "Arduino Nano;3.26",
    };

    private int id;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            id = Integer.parseInt(request.getParameter("id"));
            String position = products[id];
            String[] splittedPosition = position.split(";");
            response.setCharacterEncoding("UTF-16");
            response.getWriter().append(splittedPosition[0] + " - " + splittedPosition[1] + "zł");
        } catch (Exception e) {
            response.getWriter().append("Product not found.");
        }
    }
}
