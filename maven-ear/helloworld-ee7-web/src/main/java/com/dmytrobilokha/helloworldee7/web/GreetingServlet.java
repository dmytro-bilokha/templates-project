package com.dmytrobilokha.helloworldee7.web;

import com.dmytrobilokha.helloworldee7.ejb.GreetingService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class GreetingServlet extends HttpServlet {

    @Inject
    private GreetingService greetingService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter output = resp.getWriter();
        output.print("<html><body><p>");
        output.print(greetingService.createGreeting());
        output.print("</p></body></html>");
    }

}
