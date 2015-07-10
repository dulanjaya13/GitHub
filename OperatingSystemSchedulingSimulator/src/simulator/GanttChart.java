/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.Painter;

/**
 *
 * @author Dulanjaya Tennekoon
 */
public class GanttChart extends JPanel {

    private class Painting {

        int xPos = 10;
        int yPos = 8;
        int xlen = 10;
        int ylen = 30;
        Color color = Color.BLACK;

        public Painting(int yPos, Color color) {
            this.yPos = yPos;
            this.color = color;
        }

    }

    Vector<Painting> paintings = new Vector();
    Stack<Color> color = new Stack();
    int pos = 10;
    Color curColor = null;
    int strXPos = 10;
    String strJobNo = "";

    public GanttChart() {
        super();
        Dimension g = new Dimension(100, 100);
        addColors();
        //paintings.add(new Painting());
    }

    private void addColors() {

        color.add(Color.YELLOW);
        color.add(Color.GRAY);
        color.add(Color.MAGENTA);
        color.add(Color.ORANGE);
        color.add(Color.PINK);
        color.add(Color.GREEN);
        color.add(Color.CYAN);
        color.add(Color.RED);
        color.add(Color.BLUE);
    }

    public void drawNextBar(boolean newJob, int jobId) {
        //strJobNo = strJobNo.concat(Integer.toString(jobNumber) + "  ");
        try {
            if (newJob) {
                curColor = color.pop();
            }
        } catch (EmptyStackException e) {
            addColors();
            curColor = color.pop();
        }
        strJobNo = strJobNo.concat(Integer.toString(jobId) + "  ");
        paintings.add(new Painting(pos += 13, curColor));
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        for (Painting p : paintings) {
            grphcs.setColor(p.color);
            grphcs.fillRect(p.yPos, p.xPos, p.xlen, p.ylen);
            grphcs.setColor(Color.BLACK);
            grphcs.drawString(strJobNo, 25, 27);
        }
        //grphcs.fillRect(10, 8, 10, 30);
        //this.setIgnoreRepaint(false);
        //this.repaint();
    }

    public static void main(String[] args) {

    }

}
