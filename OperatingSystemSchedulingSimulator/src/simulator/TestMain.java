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
public class TestMain {

    public static void main(String[] args) {
        Dispatcher d = new AlgorithmHRRN();
        d.newJob(0, 3, "Job 1", 1);
        d.newJob(2, 4, "Job 2", 2);

        for (int i = 0; i <= 4; i++) {
            d.updateCPUTime(i);
            try {
                System.out.println(d.getNextJob().getJobName());
            } catch(NullPointerException e) {
                System.out.println("Returned Null");
            }
        }
    }
}
