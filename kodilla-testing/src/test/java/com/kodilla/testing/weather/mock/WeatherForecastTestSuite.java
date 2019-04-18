package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        HashMap<Integer,Double> temperature = new HashMap<Integer,Double>();
        temperature.put(0,3.2);
        temperature.put(1,1.2);
        temperature.put(2,2.2);
        temperature.put(3,4.2);
        temperature.put(4,9.2);
        when(temperaturesMock.getTemperatures()).thenReturn(temperature);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}