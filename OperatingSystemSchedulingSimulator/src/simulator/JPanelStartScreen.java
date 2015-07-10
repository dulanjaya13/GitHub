/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulator;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JPanel;

/**
 *
 * @author Dulanjaya Tennekoon
 */
public class JPanelStartScreen extends JPanel{

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        //super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        URL startScreenUrl = this.getClass().getResource("/resources/startScreen.png");
        Toolkit tk = this.getToolkit();
        Image startScreenImage = tk.getImage(startScreenUrl);
        grphcs.drawImage(startScreenImage, 0, 0, getWidth(),getHeight(),null);
        this.repaint();
    }
    
    public static void main(String[] args) {
        
    }
    
}
