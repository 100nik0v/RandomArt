package randomArt;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class RandomCircles {
	public static void main (String args[]){
		 EventQueue.invokeLater(() ->
         {
            JFrame frame = new Artistfin();
            frame.setTitle("My Heiroglyphs");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
	      }
}
class Artistfin extends JFrame{
	public Artistfin () {
		 add(new Uberfin());
		 pack();
	}
}
class Uberfin extends JComponent{
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width;
	   public Dimension getPreferredSize() { return new Dimension(screenW, screenH); }
		//Draw Method:
	   public void paintComponent(Graphics g)
	   {
		   double theta = 0;
		   while (theta < 365) {
		   Graphics2D g2 = (Graphics2D) g;
		   int n = 1000;
		   int[] numbers = new int[n];
		   for (int i = 0; i < numbers.length; i++) {
		    numbers[i] = i + 1;
		   }
		   int kick = 1000;
		   int[] result = new int[kick];
		   int r = 0;
		   for (int i = 0; i < result.length; i++) {
		   r = (int) (Math.random()*n);
		   }
		  
//		  double k = r;
//			  //Calculations:
//			  double x = result[r];
			  double cosTheta = -(Math.cos(theta)*r*r);
			  double inDegreesCos = Math.toDegrees(cosTheta);
			  double sinTheta = (Math.sin(theta)*r*r);
			  double inDegreesSin = Math.toDegrees(sinTheta);
	      //The Actual Drawing:
			  double radius = 100; 

		  g2.drawOval((int) (inDegreesCos) + screenW/2, (int) (inDegreesSin) + screenH/2, (int) radius, (int) radius);
//		  g2.drawOval(r, r, 10, 10);
		   theta ++;
		   }
	   }
}