package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsForUser;
    private double averageCommentsForUser;
    private double averageCommentsForPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (statistics.usersNames().size() == 0) {
            averagePostsForUser = 0;
            averageCommentsForUser = 0;
        } else {
            averagePostsForUser = statistics.postsCount() / statistics.usersNames().size();
            averageCommentsForUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postsCount() > 0) {
            averageCommentsForPost = (double) statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsForPost = 0;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }
}
