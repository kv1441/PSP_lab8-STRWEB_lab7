package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import java.util.List;

public class GymServletTest {
    @Test
    public void testDoGet() throws Exception {
        // Создание объекта GymServlet
        GymServlet gymServlet = new GymServlet();

        // Создание фиктивных объектов HttpServletRequest и HttpServletResponse
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();

        // Вызов метода doGet
        gymServlet.doGet(request, response);

        // Проверка, что атрибут "clients" установлен в запросе
        List<Gym> clients = (List<Gym>) request.getAttribute("clients");
        assertEquals(false, clients.isEmpty());
    }
}
