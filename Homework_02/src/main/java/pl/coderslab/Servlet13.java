package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@WebServlet(name = "Servlet13", urlPatterns = {"/Servlet13"})
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/marek//Pulpit/java_gits/" +
                "ServletsHomeTasks/Homework_02/src/oop.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            response.getWriter().append(line + "\n");
        }
    }
}
