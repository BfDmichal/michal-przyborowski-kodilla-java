package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("Done Task");
        board.getToDoList().addTask("To do task");
        board.getInProgressList().addTask("in progress task");
        //Then
        System.out.println(board.getDoneList().getList());
        System.out.println(board.getToDoList().getList());
        System.out.println(board.getInProgressList().getList());
    }
}
