package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperatures temperatures = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(0,quantityOfSensors);
    }
}
