package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


@RunWith(AndroidJUnit4.class)
public class AsyncTaskInstrumentedTest {

    @Test
    public void checkAsyncTask() throws InterruptedException {
        EndpointsAsyncTask.ICallback callback = new EndpointsAsyncTask.ICallback() {
            @Override
            public void postExecute(String s) {
                Assert.assertNotNull(s);
            }
        };
        new EndpointsAsyncTask(callback).execute();
        Thread.sleep(1000);
    }

}