package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/gym")
public class GymServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Gym> clients = GymLoader.loadClients("C:\\Users\\Vlad\\Desktop\\Лабы\\СИТАИРИС\\WebServlet\\src\\main\\webapp\\gym.xml");
        request.setAttribute("clients", clients);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/gym.jsp");
        dispatcher.forward(request, response);
    }
}
