package com.tatooine.jawas;

import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class IntrusionDetectionSystemTest {

    public IntrusionDetectionSystem ids = new IntrusionDetectionSystem();

    /**
     * Rigourous Test :-)
     */
    @Test
    public void jassarMethod1() {
        //updated status to fail test
        assertEquals("", ids.isAllowed("Jedi-Obi-wan"), true);
    }
    @Test
    public void jassarMethod2() {
        //updated status to fail test
        assertEquals("", ids.isAllowed("Jedi-Obi-wan"), true);
    }




}

