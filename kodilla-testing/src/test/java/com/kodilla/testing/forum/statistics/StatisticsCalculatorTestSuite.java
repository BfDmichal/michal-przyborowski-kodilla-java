package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testWhenNumberOfPostsZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        int i = 0;
        when(statistics.postsCount()).thenReturn(i);
        //When
        double result = calculator.getAveragePostsForUser();
        double result2 = calculator.getAverageCommentsForPost();
        //Then
        Assert.assertEquals(0, calculator.getAverageCommentsForPost(), 0);
        Assert.assertEquals(0, calculator.getAveragePostsForUser(), 0);
    }

    @Test
    public void testWhenNumberOfPostsThousand() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        int i = 1000;
        when(statistics.postsCount()).thenReturn(i);
        //When
        //calculator.calculateAdvStatistics(statistics);
        double result = calculator.getAveragePostsForUser();
        double result2 = calculator.getAverageCommentsForPost();
        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result2, 0);
    }

    @Test
    public void testWhenNumberOfCommentsZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        int i = 0;
        when(statistics.commentsCount()).thenReturn(i);
        //When
        //calculator.calculateAdvStatistics(statistics);
        double result = calculator.getAveragePostsForUser();
        double result1 = calculator.getAverageCommentsForUser();
        double result2 = calculator.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);
        Assert.assertEquals(0, result2, 0);
    }

    @Test
    public void testPostsIsBiggerThanComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        int numberOfPosts = 200;
        int numberOfComments = 100;
        when(statistics.postsCount()).thenReturn(numberOfPosts);
        when(statistics.commentsCount()).thenReturn(numberOfComments);
        //When
        calculator.calculateAdvStatistics(statistics);
        double result = calculator.getAveragePostsForUser();
        double result1 = calculator.getAverageCommentsForUser();
        double result2 = calculator.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);
        Assert.assertEquals(0.5, result2, 0);
    }

    @Test
    public void testCommentsIsBiggerThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        int numberOfPosts = 100;
        int numberOfComments = 250;
        when(statistics.postsCount()).thenReturn(numberOfPosts);
        when(statistics.commentsCount()).thenReturn(numberOfComments);
        //When
        calculator.calculateAdvStatistics(statistics);
        double result = calculator.getAveragePostsForUser();
        double result1 = calculator.getAverageCommentsForUser();
        double result2 = calculator.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);
        Assert.assertEquals(2.5, result2, 0);
    }

    @Test
    public void testNumberOfUsersHundred() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> list = new ArrayList<String>();
        String a = "a";
        for (int i = 0; i < 100; i++) {
            list.add(a);
        }
        when(statistics.usersNames()).thenReturn(list);
        //When
        calculator.calculateAdvStatistics(statistics);
        double result = calculator.getAveragePostsForUser();
        double result1 = calculator.getAverageCommentsForUser();

        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);
    }

    @Test
    public void testNumberOfUsersZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> list = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(list);
        //When
        calculator.calculateAdvStatistics(statistics);
        double result = calculator.getAveragePostsForUser();
        double result1 = calculator.getAverageCommentsForUser();

        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);
    }

}
