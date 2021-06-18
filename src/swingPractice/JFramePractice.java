package swingPractice;

import java.awt.*;

import javax.swing.*;

public class JFramePractice {
    public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		//f.setSize(600,600);
		//f.setLocation(700,700);
		f.setBounds(200,200,500,500);
		f.setTitle("LOGIN FORM");
		Container c=f.getContentPane();
		c.setBackground(Color.YELLOW);
		f.setResizable(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
