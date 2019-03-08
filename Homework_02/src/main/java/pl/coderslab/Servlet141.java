package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet041")
public class Servlet141 extends HttpServlet {
    private int id;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        for (int i = 0; i < 8; i++) {
            response.getWriter().append("<a href=\"/Servlet042?id=" + i + "\">Link " + i + "</a><br>");
        }
    }
}
