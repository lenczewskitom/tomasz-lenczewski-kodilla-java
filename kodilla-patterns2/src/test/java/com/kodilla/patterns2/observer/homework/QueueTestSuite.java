package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class QueueTestSuite {

    @Test
    public void testupdate() {
        //Given
        Queue queue1 = new Queue("Task queue for user1");
        Queue queue2 = new Queue("Task queue for user2");
        Queue queue3 = new Queue("Task queue for user3");
        Mentor mentor1 = new Mentor("Paweł");
        Mentor mentor2 = new Mentor("Piotr");
        queue1.registerObserver(mentor1);
        queue2.registerObserver(mentor1);
        queue3.registerObserver(mentor2);
        //When
        queue1.addTask("I sent the task 10.2 to be checked");
        queue2.addTask("Can we change the day of our meeting?");
        queue3.addTask("I have problem with task 12.4");
        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
