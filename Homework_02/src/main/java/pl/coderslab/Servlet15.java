package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {
    List<Integer> randomList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        randomList.clear();
        for (int i = 0; i < 10; i++) {
            randomList.add((new Random().nextInt(100) + 1));
        }

        createTable(response);

        response.getWriter().append("<br>");

        randomList.sort((o1, o2) -> {
            if (o2 > o1) {
                return -1;
            } else if (o1 > o2) {
                return 1;
            }
            return 0;
        });
        createTable(response);
    }

    private void createTable(HttpServletResponse response) throws IOException {
        response.getWriter().append("<table style=\"width:300\" border=\"1\">");
        for (int i = 0; i < randomList.size(); i++) {
            response.getWriter().append("<tr><td>" + i + "</td><td>" + randomList.get(i) + "</td></tr>");
        }
        response.getWriter().append("</table>");
    }
}
