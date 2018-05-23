package com.projects.designpatterns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SingletonTest {
    private Singleton instanceOne = null;
    private Singleton instanceTwo = null;

    @Before
    public void setUp(){
        instanceOne = Singleton.getInstance();
        instanceTwo = Singleton.getInstance();

    }

    @Test
    public void singletonEqualTest() {
        assertTrue(instanceOne == instanceTwo);
    }

    @Test
    public void singletonUnequalTest() {

        Singleton diffInstanceOne = new Singleton();
        assertFalse( diffInstanceOne == instanceTwo);
        diffInstanceOne.setId("alex");
        assertFalse(instanceTwo.equals(diffInstanceOne));
        diffInstanceOne.setId("mirela");
        assertTrue(instanceTwo.equals(diffInstanceOne));
        assertFalse( diffInstanceOne == instanceTwo);

    }
}