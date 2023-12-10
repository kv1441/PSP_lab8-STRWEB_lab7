package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GymTest {
    @Test
    public void testProductGettersAndSetters() {
        Gym client = new Gym();

        // Установка значений с использованием сеттеров
        client.setName("TestName");
        client.setAge(20);
        client.setGender("Female");
        client.setMembership("Classic");

        // Проверка значений с использованием геттеров
        assertEquals("TestName", client.getName());
        assertEquals(20, client.getAge());
        assertEquals("Female", client.getGender());
        assertEquals("Classic", client.getMembership());
    }
}
