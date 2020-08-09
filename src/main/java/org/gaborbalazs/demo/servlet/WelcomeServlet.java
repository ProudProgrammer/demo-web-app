package org.gaborbalazs.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        LocalTime localTime = LocalTime.now();
        if (localTime.isAfter(LocalTime.of(18, 0))) {
            out.println("<h3>Good evening!</h3>");
        } else if (localTime.isAfter(LocalTime.of(12, 0))) {
            out.println("<h3>Good afternoon!</h3>");
        } else {
            out.println("<h3>Good morning!</h3>");
        }
    }
}
