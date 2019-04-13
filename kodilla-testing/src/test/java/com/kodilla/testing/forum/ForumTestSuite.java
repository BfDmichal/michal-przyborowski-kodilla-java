package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;
import sun.java2d.pipe.SpanShapeRenderer;

public class ForumTestSuite {
    @Test
    public void testUserName(){
        //Given
        SimpleUser user = new SimpleUser("forumUser");
        //When
        String result = user.getName();
        //Then
        Assert.assertEquals(result,"forumUser");
    }

}

