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
public class AlgorithmHRRN extends Dispatcher {

    private Job curRunningJob;
    private int curJobPosition;

    private float getRespondRatio(Job job, int processorTime) {
        //int wait_time = processorTime - job.getArr_time();
        return (float)(job.getWaiting_time()+job.getServ_time())/job.getServ_time();
        //return (float) (wait_time + job.getServ_time()) / job.getServ_time();
        
    }

    @Override
    public Job getNextJob() {
        float max = 0;
        Job selectedJob = null;
        int position = 0;
        if (curRunningJob == null) {
            for (int i = 0; i < jobPool.size(); i++) {
                if (max < jobPool.get(i).getRes_ratio() && jobPool.get(i).getArr_time() <= cpu_time && 
                        jobPool.get(i).getComplete_time() != jobPool.get(i).getServ_time()) {
                    max = jobPool.get(i).getRes_ratio();
                    selectedJob = jobPool.get(i);
                    position = i;
                }
            }
            curRunningJob = selectedJob;
            curJobPosition = position;
            return selectedJob;
        } else {
            return curRunningJob;
        }
    }

    private void calculateTime() {
        System.out.println("CPU Time :" + cpu_time);
        for (int i = 0; i < jobPool.size(); i++) {
            Job cur_Job = jobPool.get(i);
            if (cur_Job.getArr_time() <= cpu_time && !cur_Job.isJobDone()) {
                //System.out.println("Here Goes");
                int wait_time = cpu_time - cur_Job.getArr_time() - cur_Job.getComplete_time()-1;
                if(wait_time>0) {
                    cur_Job.setWaiting_time(cpu_time - cur_Job.getArr_time() - cur_Job.getComplete_time()-1);
                } else {
                    cur_Job.setWaiting_time(0);
                }
                cur_Job.setRes_ratio(getRespondRatio(cur_Job, cpu_time));
                jobPool.set(i, cur_Job);
                printAll(cur_Job);
            }
        }
    }

    private void printAll(Job job) {
        //for the testing purpose
        System.out.println("Job Name     :" + job.getJobName());
        System.out.println("Arrival Time :"+job.getArr_time());
        System.out.println("Service Time :"+job.getServ_time());
        System.out.println("Waiting Time :"+job.getWaiting_time());
        System.out.println("Complet Time :"+job.getComplete_time());
        System.out.println("Respond Ratio: "+job.getRes_ratio());
    }

    @Override
    public void updateCPUTime(int cpu_time) {
        super.updateCPUTime(cpu_time);
        if(curRunningJob==null) {
            calculateTime();
            return;
        }
        if (curRunningJob.getComplete_time() + 1 == curRunningJob.getServ_time()) {
            curRunningJob.setComplete_time(curRunningJob.getComplete_time() + 1);
            curRunningJob.setJobDone(true);
            curRunningJob = null;
        } else {
            curRunningJob.setComplete_time(curRunningJob.getComplete_time() + 1);
            jobPool.set(curJobPosition, curRunningJob);
        }
        calculateTime();
    }

}
