package com.sm.music;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Created by naonao on 2016/3/21
 *
 *output:
 * *****************************************
 *  BeforeClass - oneTimeSetUp
 *  Before - setUp
 *  Test - testOneItemCollection
 *  After - tearDown
 *  Before - setUp
 *  Test - testEmptyCollection
 *  After - tearDown
 *  AfterClass - oneTimeTearDown
 * *****************************************
 *
 *
 */
public class JunitTest1 {

    private Collection<String> collection;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code
        System.out.println("BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
        System.out.println("AfterClass - oneTimeTearDown");
    }

    @Before
    public void setUp() {
        collection = new ArrayList<>();
        System.out.println("Before - setUp");
    }

    @After
    public void tearDown() {
        collection.clear();
        System.out.println("After - tearDown");
    }

    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
        System.out.println("Test - testEmptyCollection");
    }

    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("Test - testOneItemCollection");
    }
}
