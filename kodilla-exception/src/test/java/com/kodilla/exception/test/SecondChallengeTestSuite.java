package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testNumbers() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1))
        );
    }
}