package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1,2,3,5,4,2,9,8};
        //When
        double average = ArrayOperations.getAverage(numbers);
        double expectedAverage = 4.25;
        //Then
        Assert.assertEquals(4.25,average,0.01);
    }
}
