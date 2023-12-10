package org.example;

import org.junit .Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class GymLoaderTest {
    @Test
    public void testLoadProducts() {
        //путь к тестовому XML-файлу
        String filePath = "C:\\Users\\Vlad\\Desktop\\Лабы\\СИТАИРИС\\WebServlet\\src\\test\\resources\\test-clients.xml";

        // Вызов метода loadProducts
        List<Gym> clients = GymLoader.loadClients(filePath);

        // Проверка, что список продуктов не пустой
        assertEquals("Product list should not be empty", false, clients.isEmpty());
    }
}
