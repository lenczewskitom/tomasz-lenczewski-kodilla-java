package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBeanExists() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        boolean boardExists = context.containsBean("getBoard");
        boolean toDoListExists = context.containsBean("toDoList");
        boolean inProgressListExists = context.containsBean("inProgressList");
        boolean doneListExists = context.containsBean("doneList");
        //Then
        assertTrue(boardExists);
        assertTrue(toDoListExists);
        assertTrue(inProgressListExists);
        assertTrue(doneListExists);
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Task to do");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Done task");
        //Then
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Done task", board.getDoneList().getTasks().get(0));
    }
}
