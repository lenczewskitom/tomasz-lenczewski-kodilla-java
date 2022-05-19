package com.kodilla.testing.forum.statistics;

public class Calculate {

    private int usersNumber;
    private int postNumber;
    private int commentsNumber;
    private double avgPostsOnUser;
    private double avgCommentsOnUser;
    private double avgCommentsOnPost;

    public double getAvgPostsOnUser() {
        return avgPostsOnUser;
    }

    public double getAvgCommentsOnUser() {
        return avgCommentsOnUser;
    }

    public double getAvgCommentsOnPost() {
        return avgCommentsOnPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber == 0) {
            avgPostsOnUser = 0;
        } else avgPostsOnUser = (double) postNumber/usersNumber;

        if (usersNumber == 0) {
            avgCommentsOnUser = 0;
        } else avgCommentsOnUser = (double) commentsNumber/usersNumber;

        if (postNumber == 0) {
            avgCommentsOnPost = 0;
        } else avgCommentsOnPost = (double) commentsNumber/postNumber;
    }

    public void showStatistics() {
        System.out.println("UserNumber: " + usersNumber + "\npostNumber: " + postNumber +
                "\ncommentsNumber: " + commentsNumber + "\navgPostsOnUser: " + avgPostsOnUser +
                "\navgCommentsOnUser: " + avgCommentsOnUser + "\navgCommentsOnPost: " + avgCommentsOnPost);
    }
}
