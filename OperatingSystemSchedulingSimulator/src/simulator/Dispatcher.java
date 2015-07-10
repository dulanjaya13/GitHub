/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulator;

import java.util.Vector;

/**
 *
 * @author Dulanjaya Tennekoon
 */
public abstract class Dispatcher {
    protected Vector<Job> jobPool = new Vector<>();
    protected int cpu_time = 0;
    
    public Vector<Job> getJobPool() {
        return jobPool;
    }
    
    public void newJob(int arr_time, int serv_time, String jobName, int jobID) {
        jobPool.add(new Job(arr_time,serv_time,jobName,jobID));
    }
    
    public void updateCPUTime(int cpu_time) {
        this.cpu_time = cpu_time;
    }
    
    public abstract Job getNextJob();
    
}
