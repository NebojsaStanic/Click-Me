package Jovana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickMe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClickMe frame = new ClickMe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClickMe() {
		setTitle("Secret Message ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textLabel = new JLabel("");
		textLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLabel.setVerticalAlignment(SwingConstants.TOP);
		textLabel.setBounds(146, 141, 182, 36);
		
		JLabel textLabel2 = new JLabel("");
		textLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textLabel2.setBounds(139, 198, 167, 28);
		contentPane.add(textLabel2);
		
		JButton clickButton = new JButton("Click me! ");
		clickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textLabel.setText("Nebojsa voli Jovanu! :)");
			}
		});
		clickButton.setBounds(109, 88, 89, 23);
		contentPane.add(clickButton);
		
		
		contentPane.add(textLabel);
		
		JButton clickButton2 = new JButton("Click me to!");
		clickButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textLabel2.setText("Jovana voli Nebojsicu");
			}
		});
		clickButton2.setBounds(222, 88, 128, 23);
		contentPane.add(clickButton2);
		
		
	}
}
