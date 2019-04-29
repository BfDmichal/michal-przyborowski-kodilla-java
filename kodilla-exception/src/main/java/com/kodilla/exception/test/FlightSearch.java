package com.kodilla.exception.test;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public static Map<String,Boolean> mapMaker(){
    HashMap<String,Boolean> map = new HashMap<>();
        map.put("Detroit",true);
        map.put("Berlin",false);
        map.put("Warsaw",true);
        map.put("Ibiza",true);
        map.put("Miami",false);
        map.put("Barcelona",true);
    return map;
    }

    public static void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> map = mapMaker();
        if(!map.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Airport not found");
        }else if((map.containsKey(flight.getArrivalAirport())&&map.get(flight.getArrivalAirport()).booleanValue())){
            System.out.println("Direction is enable");
        }
        else{
            System.out.println("Direction is disable");
        }
    }

    public static void main(String[] args) {
        Flight flightActive = new Flight("Las Vegas","Barcelona");
        Flight flightNotExcist = new Flight("Zakopane","Hawaii");
        Flight flightDisabled = new Flight("Dallas","Miami");

        try {
            FlightSearch.findFlight(flightActive);
            FlightSearch.findFlight(flightDisabled);
            FlightSearch.findFlight(flightNotExcist);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
