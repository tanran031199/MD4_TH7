package com.example.calculator;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "discountServlet", value = "/display-discount")
public class discountServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("ádfasdf");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ádfasdf");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double discount = Double.parseDouble(req.getParameter("discount"));
        double discountAmount = price * discount * 0.01;
        double discountPrice = price - discountAmount;
        System.out.println("álhdflkashdfkl");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        out.println("<h1>Discount Price: " + discountPrice + "</h1>");
        out.println("</body></html>");
        req.getRequestDispatcher("displayDiscount.jsp").forward(req, resp);
    }

    public void destroy() {
    }
}