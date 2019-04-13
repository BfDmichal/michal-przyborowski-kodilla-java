package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CollectionTestSuite {
    @Before
    public  void before(){
        System.out.println("test case: start");
    }
    @After
    public void after(){
        System.out.println("test case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Collection test: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Collection test: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator allay = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        //When
        ArrayList<Integer> list1 = allay.exterminator(list);
        System.out.println("testing list is empty");
        //Then
        assertTrue(list1.isEmpty());
    }

    @Test
    public void testOddNumberExterminatorNormalList() {
        //Given
        OddNumbersExterminator allay = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listTest=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        listTest.add(1);
        listTest.add(7);
        //When
        ArrayList<Integer> evenList = allay.exterminator(list);
        System.out.println("testing separate");
        //Then
        assertEquals(listTest,evenList);

    }
}
