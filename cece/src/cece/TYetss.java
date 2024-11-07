package cece;

import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;

public class TYetss {
	public static void main (String[] args) {
		class TimePrinter implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, this time is " + now);
				Toolkit.getDefaultToolkit().beep();
			}}
		ActionListener listener = new TimePrinter();
		
		//constroi um timer que chama o ouvinte
		//uma vez a cada 10 segundos
		Timer t = new Timer(10000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
