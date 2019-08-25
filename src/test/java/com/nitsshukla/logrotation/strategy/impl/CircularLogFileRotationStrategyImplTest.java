/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.nitsshukla.logrotation.strategy.impl;

import com.nitsshukla.logrotation.strategy.LogFileRotationStrategy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CircularLogFileRotationStrategyImplTest {

    private LogFileRotationStrategy logFileRotationStrategy;

    @Before
    public void setup() {
        //do some initial setup
        logFileRotationStrategy = new CircularLogFileRotationStrategyImpl(123);
    }

    @Test
    public void testSaneInput() {
        try {
            logFileRotationStrategy.log("123");
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
    
    @Test
    public void testIfRecordsPresent() {
    	assertNotNull(logFileRotationStrategy.getAllLogs());
    }

    @Test
    public void testValidSize() {
//		assertTrue("Setup a valid threshold. ",logFileRotationStrategy.maxSizeInBytes>0);
    }

}
