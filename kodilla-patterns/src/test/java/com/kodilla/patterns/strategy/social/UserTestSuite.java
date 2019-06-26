package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User anna = new Millenials("Anna Janna");
        User henryk = new YGeneration("Henryk Wacławek");
        User kamil = new ZGeneration("Kamil Nasyp");
        //When
        String annaUse = anna.sharePost();
        System.out.println("Anna use: "+ annaUse);
        String henrykUse = henryk.sharePost();
        System.out.println("Henryk use: "+ henrykUse);
        String kamilUse = kamil.sharePost();
        System.out.println("Kamil use: "+ kamilUse);
        //Then
        Assert.assertEquals("Facebook", annaUse);
        Assert.assertEquals("Twitter",henrykUse);
        Assert.assertEquals("Snapchat",kamilUse);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User anna = new Millenials("Anna Janna");
        //When
        String annaUse = anna.sharePost();
        System.out.println("Anna use: "+ annaUse);
        anna.changeSocialMedia(new TwitterPublisher());
        annaUse = anna.sharePost();
        System.out.println("Anna use now : "+annaUse);
        //Then
        Assert.assertEquals("Twitter",annaUse);

    }
}
