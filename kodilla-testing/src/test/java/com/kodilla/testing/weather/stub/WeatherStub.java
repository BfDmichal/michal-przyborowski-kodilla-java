package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class WeatherStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
            HashMap<Integer,Double> map = new HashMap<Integer,Double>();
        map.put(0, 25.5);
        map.put(1, 26.2);
        map.put(2, 24.8);
        map.put(3, 25.2);
        map.put(4, 26.1);
        return map;
    }
}
