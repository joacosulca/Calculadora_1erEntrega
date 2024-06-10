package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class OperacionesConEcuacionesMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuacionesMenu window = new OperacionesConEcuacionesMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OperacionesConEcuacionesMenu() {
		initialize();
	}
	
	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuacionesMenu window = new OperacionesConEcuacionesMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Operaciones 2x2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesConEcuaciones2x2 ecuaciones = new OperacionesConEcuaciones2x2();
				ecuaciones.correr();
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(174, 255, 255));
		btnNewButton.setBounds(60, 149, 133, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operaciones 3x3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperaionesConEcuaciones3x3 operaciones = new OperaionesConEcuaciones3x3();
				operaciones.correr();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(174, 255, 255));
		btnNewButton_1.setBounds(242, 149, 133, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel titulo = new JLabel("Operaciones con ecuaciones");
		titulo.setForeground(Color.WHITE);
		titulo.setBackground(Color.WHITE);
		titulo.setFont(new Font("Calibri", Font.PLAIN, 30));
		titulo.setBounds(38, 70, 370, 51);
		frame.getContentPane().add(titulo);
		
		JButton Atras = new JButton("←");
		Atras.setFont(new Font("Calibri", Font.PLAIN, 13));
		Atras.setBackground(new Color(250, 169, 47));
		Atras.setBounds(21, 17, 47, 33);
		frame.getContentPane().add(Atras);

		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Menu menu = new Menu();
				menu.correr();
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
