/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.quartzlistener;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;

/**
 *
 * @author wjirawong
 */
public class SimpleTriggerListener implements TriggerListener{

    public String getName() {
        return "SimpleTriggerListener";
    }

    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println("triggerFired ");
    }

    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        //return true when need veto job
        return true;
    }

    public void triggerMisfired(Trigger trigger) {
        System.out.println("triggerMisfired ");
    }

    public void triggerComplete(Trigger trigger, JobExecutionContext context, Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println("triggerComplete ");
    }
    
}
