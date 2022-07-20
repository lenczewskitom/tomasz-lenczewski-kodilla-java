package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User tom = new Millenials("Tom");
        User kate = new YGeneration("Kate");
        User robert = new ZGeneration("Robert");
        //When
        String tomPost = tom.sharePost();
        System.out.println("Tom post: " + tomPost);
        String katePost = kate.sharePost();
        System.out.println("Kate post: " + katePost);
        String robertPost = robert.sharePost();
        System.out.println("Robert post: " + robertPost);
        //Then
        assertEquals("Use Facebook to publish post", tomPost);
        assertEquals("Use Twitter to publish post", katePost);
        assertEquals("Use Snapchat to publish post", robertPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User tom = new Millenials("Tom");
        //When
        String tomPost = tom.sharePost();
        System.out.println("Tom post: " + tomPost);
        tom.setSocialPublisher(new TwitterPublisher());
        tomPost = tom.sharePost();
        System.out.println("Tom post: " + tomPost);
        //Then
        assertEquals("Use Twitter to publish post", tomPost);
    }
}
