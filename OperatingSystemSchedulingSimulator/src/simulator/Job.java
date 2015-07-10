/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulator;

/**
 *
 * @author Dulanjaya Tennekoon
 */
public class Job {
    private int arr_time = 0;
    private int serv_time = 0;
    private int waiting_time = 0;
    private float res_ratio = 0;
    private int complete_time = 0;
    private String jobName;
    private int jobID = 0;
    private boolean jobDone = false;
    private boolean jobProcessStarted = false;
    
    public Job (int arr_time, int serv_time, String jobName, int jobID) {
        this.arr_time = arr_time;
        this.serv_time = serv_time;
        this.jobName = jobName;
        this.jobID = jobID;
    }
    
    
    
    /**
     * @return the arr_time
     */
    public int getArr_time() {
        return arr_time;
    }

    /**
     * @return the serv_time
     */
    public int getServ_time() {
        return serv_time;
    }

    /**
     * @return the waiting_time
     */
    public int getWaiting_time() {
        return waiting_time;
    }

    /**
     * @param waiting_time the waiting_time to set
     */
    public void setWaiting_time(int waiting_time) {
        this.waiting_time = waiting_time;
    }

    /**
     * @return the res_ratio
     */
    public float getRes_ratio() {
        return res_ratio;
    }

    /**
     * @param res_ratio the res_ratio to set
     */
    public void setRes_ratio(float res_ratio) {
        this.res_ratio = res_ratio;
    }

    /**
     * @return the complete_time
     */
    public int getComplete_time() {
        return complete_time;
    }

    /**
     * @param complete_time the complete_time to set
     */
    public void setComplete_time(int complete_time) {
        this.complete_time = complete_time;
    }

    /**
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @return the jobID
     */
    public int getJobID() {
        return jobID;
    }

    /**
     * @return the jobDone
     */
    public boolean isJobDone() {
        return jobDone;
    }

    /**
     * @param jobDone the jobDone to set
     */
    public void setJobDone(boolean jobDone) {
        this.jobDone = jobDone;
    }

    /**
     * @return the jobProcessStarted
     */
    public boolean isJobProcessStarted() {
        return jobProcessStarted;
    }

    /**
     * @param jobProcessStarted the jobProcessStarted to set
     */
    public void setJobProcessStarted(boolean jobProcessStarted) {
        this.jobProcessStarted = jobProcessStarted;
    }
    
    
    
}
