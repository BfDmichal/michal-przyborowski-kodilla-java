package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("ala","about singing and dancing");
        taskListDao.save(taskList);
        //When
        List<TaskList> name = taskListDao.findByListName("ala");
        //Then
        Assert.assertEquals(1,name.size());

        //CleanUp
        taskListDao.deleteAll();
    }
    @Test
    public void testTasksListDaoSaveWithTasks(){
        //Given
        Task task = new Task("Test: Learn Hibernate",14);
        Task task1 = new Task("Test: Write some entities.",3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10),false);
        task.setTaskFinancialDetails(tfd);
        task1.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("LISTNAME","ToDo Tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task1);
        task.setTaskList(taskList);
        task1.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        Assert.assertNotEquals(0,id);
        //CleanUp
        taskListDao.deleteById(id);

    }
}
