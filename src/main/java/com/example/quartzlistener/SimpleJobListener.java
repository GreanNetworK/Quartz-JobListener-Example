/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.quartzlistener;

import java.util.Date;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

/**
 *
 * @author wjirawong
 */
public class SimpleJobListener implements JobListener{

    public String getName() {
        return "SimpleJobListener";
    }

    public void jobToBeExecuted(JobExecutionContext context) {
        System.out.println("jobToBeExecuted has execute. "+new Date());
    }

    public void jobExecutionVetoed(JobExecutionContext context) {
        System.out.println("jobExecutionVetoed has execute. "+new Date());
    }

    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        System.out.println("jobWasExecuted has execute. "+new Date()+"\r\n");
    }
    
}
