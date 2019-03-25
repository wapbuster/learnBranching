package com.indus.training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayWithNumTest {

    private PlayWithNum playObj = null;

    @Before
    public void setUp() throws Exception {
        playObj = new PlayWithNum();
    }

    @After
    public void tearDown() throws Exception {
        playObj = null;
    }

    @Test
    public void findDuplicate() {

        int[] testArray = {1, 2, 3, 3, 5};
        Integer expectedResult = 3;

        Integer actualRestult = playObj.findDuplicate(testArray);

        assertEquals(expectedResult, actualRestult);

    }


}