package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for add and remove figure")
    class TestAddRemove {
        @Test
        public void TestAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Square(4.0));
            //Then
            Assertions.assertEquals(new Square(4.0),shapeCollector.getFigure(0));
        }

        @Test
        public void TestRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4.0);
            shapeCollector.addFigure(square);
            //When
            boolean result = shapeCollector.removeFigure(square);
            //Then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Tests for get and show figure")
    class TestGetShow {
        @Test
        public void TestGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3.0);
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle,retrievedFigure);
        }

        @Test
        public void TestGetFigureNegativeIndex() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3.0);
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(-1);
            //Then
            Assertions.assertEquals(null,retrievedFigure);
        }

        @Test
        public void TestGetFigureIndexOutOfSize() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3.0);
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(3);
            //Then
            Assertions.assertEquals(null,retrievedFigure);
        }

        @Test
        public void TestShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3.0);
            Shape square = new Square(4.0);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            ArrayList<Shape> shapes = new ArrayList<>(List.of(circle, square));
            //When
            ArrayList<Shape> result;
            result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(shapes,result);
        }
    }
}
