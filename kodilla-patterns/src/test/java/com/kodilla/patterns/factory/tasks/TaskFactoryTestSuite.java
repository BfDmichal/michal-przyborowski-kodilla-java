package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryTaskDrive(){
        //Given
        //When
        Task drivingTask = TaskFactory.makeTask(TaskFactory.DRIVE);
        //Then
        Assert.assertEquals("taxi",drivingTask.getTaskName());
        Assert.assertEquals("driving",drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecute());
    }
    @Test
    public void testFactoryTaskShopping(){
        //Given
        //When
        Task shoppingTask = TaskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("shop",shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecute());
    }
    @Test
    public void testFactoryTaskPaint(){
        //Given
        //When
        Task paintingTask = TaskFactory.makeTask(TaskFactory.PAINT);
        //Then
        Assert.assertEquals("paint",paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecute());
        Assert.assertEquals("painting",paintingTask.executeTask());
        Assert.assertTrue(paintingTask.isTaskExecute());
    }
}
