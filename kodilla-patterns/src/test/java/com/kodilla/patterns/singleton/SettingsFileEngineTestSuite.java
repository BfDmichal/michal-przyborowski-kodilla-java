package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {

    @BeforeClass
    public static void openSettingsFile(){
        SettingsFileEngine.getInstance().open("myapp.settings");
    }
    @AfterClass
    public static void closeSettingsFile(){
        SettingsFileEngine.getInstance().close();
    }
    @Test
    public void getFileName(){
        //Given
        //When
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: "+fileName);
        //Then
        Assert.assertEquals("myapp.settings",fileName);
    }
    @Test
    public void loadSettings(){
        //Given
        //When
        boolean load = SettingsFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(load);
    }
    @Test
    public void saveSettings(){
        //Given
        //When
        boolean save = SettingsFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(save);
    }
}
