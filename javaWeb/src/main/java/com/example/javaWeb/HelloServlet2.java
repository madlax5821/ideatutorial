package com.example.javaWeb;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: User
 * Date: 3/13/2021, 11:07 AM
 * Description:
 */
@WebServlet(name = "BBCNews", value = "/bbc-news")
public class HelloServlet2 extends HttpServlet {
    private String message;

    public void init(){message = "BBC News welcome you!!!";}

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");

        PrintWriter writer = res.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>"+message+"</h1>");
        writer.println("<body><html>");
    }

    public void destroy(){}
}


