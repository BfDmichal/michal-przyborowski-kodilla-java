package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int couter = 0;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Testing of shape collector class");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("end of tests");
    }

    @Before
    public void beforeCaste() {
        couter++;
        System.out.println("Testing part:" + couter);
    }

    @After
    public void afterCase() {
        System.out.println("end of " + couter + " case test");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(new Circle("circle", 3));
        //Then
        Assert.assertEquals(1, collector.getNumberOfFigures());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle("circle", 3);
        collector.addFigure(circle);
        //When
        Shape circle1 = collector.getFigure(0);
        //Then
        Assert.assertEquals(circle1, circle);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("name", 2);
        //When
        boolean result = collector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("square", 4.3);
        collector.addFigure(circle);
        //When
        boolean result = collector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getNumberOfFigures());
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("Circle",2);
        Square square = new Square("Square", 4);
        collector.addFigure(square);
        collector.addFigure(circle);
        //When
        String result =collector.showFigures();
        String result1 = square.toString()+""+circle.toString();
        //Then
        Assert.assertEquals(result,result1);
    }
}
