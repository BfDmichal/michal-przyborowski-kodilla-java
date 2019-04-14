package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is a beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This is the ending of tests.");
    }

    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute tests #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("henry", "anthony hopkins");
        //When
        forumUser.addPost("henry", "Hello everyone");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser user = new ForumUser("anne", "patricia smith");
        ForumPost post = new ForumPost("Hello everyone", "henry");
        //When
        user.addComment(post, "anne", "Hello");
        //Then
        Assert.assertEquals(1, user.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser user = new ForumUser("anne", "peter anne");
        ForumPost post = new ForumPost("Hello", "anne");
        user.addPost(post.getAuthor(), post.getPostBody());
        //When
        ForumPost isTheSamePost;
        isTheSamePost = user.getPost(0);
        //Then
        Assert.assertEquals(isTheSamePost, post);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser user = new ForumUser("anne", "peter anne");
        ForumPost post = new ForumPost("Hello", "anne");
        ForumComment comment = new ForumComment(post, "anne", "Hello is answer");
        user.addComment(post,comment.getAuthor(),comment.getCommentBody());
        //When
        ForumComment isTheSame = user.getComment(0);
        //Then
        Assert.assertEquals(comment,isTheSame);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser user = new ForumUser("anne", "peter anne");
        ForumPost post = new ForumPost("Hello", "anne");
        //When
        boolean result = user.removePost(post);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser user = new ForumUser("anne", "peter anne");
        ForumPost post = new ForumPost("Hello", "anne");
        ForumComment comment = new ForumComment(post, "Hi", "anne");
        //When
        boolean result = user.removeComment(comment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser user = new ForumUser("anne", "peter anne");
        ForumPost post = new ForumPost("Hello", "anne");
        user.addPost(post.getAuthor(), post.getPostBody());
        //When
        boolean result = user.removePost(post);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, user.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser user = new ForumUser("anne", "peter anne");
        ForumPost post = new ForumPost("Hello", "anne");
        ForumComment comment = new ForumComment(post,"anne","bye");
        user.addComment(post,comment.getAuthor(),comment.getCommentBody());
        //When
        boolean result = user.removeComment(comment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, user.getCommentsQuantity());
    }
}
