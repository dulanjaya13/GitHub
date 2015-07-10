/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dulanjaya Tennekoon
 */
public class AbsTableModel extends AbstractTableModel {

    private Dispatcher d;
    private String[] columnNames = {"Job Name", "Arrival Time", "Service Time", "Waiting Time", "Respond Ratio", "Completed Time"};

    public AbsTableModel(Dispatcher d) {
        this.d = d;
    }

    @Override
    public int getRowCount() {
        return d.getJobPool().size();
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public int getColumnCount() {
        return 6; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch (i1) {
            case 0:
                return d.getJobPool().get(i).getJobName();
            case 1:
                return d.getJobPool().get(i).getArr_time();
            case 2:
                return d.getJobPool().get(i).getServ_time();
            case 3:
                return d.getJobPool().get(i).getWaiting_time();
            case 4:
                return d.getJobPool().get(i).getRes_ratio();
            case 5:
                return d.getJobPool().get(i).getComplete_time();
            default:
                return 0;
        }
    }

}
