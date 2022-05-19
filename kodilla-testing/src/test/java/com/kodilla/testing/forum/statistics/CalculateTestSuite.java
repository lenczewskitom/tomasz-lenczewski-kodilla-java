package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
@DisplayName("Calculate Test Suite")
@ExtendWith(MockitoExtension.class)
public class CalculateTestSuite {
    private List<String> generateListOfNUsers(int usersNumber) {
        List<String> usersList = new ArrayList<>();
        for (int n = 1; n <= usersNumber; n++) {
            usersList.add("User" + n);
        }
        return usersList;
    }

    @Mock
    private Statistics statisticsMock;

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

    @Test
    void testAvgPostsOnUserZeroPosts() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(10));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculate.getAvgPostsOnUser());
    }

    @Test
    void testAvgPostsOnUserThousandPosts() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(10));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, calculate.getAvgPostsOnUser());
    }

    @Test
    void testAvgPostsOnUserZeroUsers() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(0));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculate.getAvgPostsOnUser());
    }

    @Test
    void testAvgPostsOnUserHundredUsers() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(100));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.1, calculate.getAvgPostsOnUser());
    }

    @Test
    void testAvgCommentsOnUserZeroComments() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(100));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculate.getAvgCommentsOnUser());
    }

    @Test
    void testAvgCommentsOnUserZeroUsers() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(0));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculate.getAvgCommentsOnUser());
    }

    @Test
    void testAvgCommentsOnUserHundredUsers() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(100));
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, calculate.getAvgCommentsOnUser());
    }

    @Test
    void testAvgCommentsOnPostZeroPosts() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculate.getAvgCommentsOnPost());
    }

    @Test
    void testAvgCommentsOnPostThousandPosts() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(20000);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20, calculate.getAvgCommentsOnPost());
    }

    @Test
    void testAvgCommentsOnZeroComments() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculate.getAvgCommentsOnPost());
    }

    @Test
    void testAvgCommentsOnMoreCommentsThanPosts() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, calculate.getAvgCommentsOnPost());
    }

    @Test
    void testAvgCommentsOnMorePostsThanComments() {
        //Given
        Calculate calculate = new Calculate();
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.5, calculate.getAvgCommentsOnPost());
    }
}
