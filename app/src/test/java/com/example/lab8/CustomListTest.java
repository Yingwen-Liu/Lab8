package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(1, list.countCities());
        list.addCity(new City("Vancouver", "British Columbia"));
        assertEquals(2, list.countCities());
    }
}
