package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	
	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Menu() {
		initialize();
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
		
		JButton OperacionesBásicas = new JButton("Operaciones Básicas");
		OperacionesBásicas.setBackground(Color.CYAN);
		OperacionesBásicas.setForeground(Color.BLACK);
		OperacionesBásicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesBasicas CalculadoraBasica = new OperacionesBasicas();
				CalculadoraBasica.correr();
				frame.setVisible(false);
			}
		});
		OperacionesBásicas.setBounds(51, 116, 145, 36);
		frame.getContentPane().add(OperacionesBásicas);
		
		JButton OperacionesMatrices = new JButton("Operaciones con Matrices");
		OperacionesMatrices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		OperacionesMatrices.setBackground(Color.CYAN);
		OperacionesMatrices.setForeground(Color.BLACK);
		OperacionesMatrices.setBounds(220, 181, 168, 37);
		frame.getContentPane().add(OperacionesMatrices);
		
		JButton OperacionesVectores = new JButton("Operaciones con Vectores ");
		OperacionesVectores.setBackground(Color.CYAN);
		OperacionesVectores.setForeground(Color.BLACK);
		OperacionesVectores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesConVectores Vectores = new OperacionesConVectores();
				Vectores.correr();
				frame.setVisible(false);
			}
		});
		OperacionesVectores.setBounds(220, 116, 168, 36);
		frame.getContentPane().add(OperacionesVectores);
		
		JButton SistemasEcuaciones = new JButton("Sistemas de Ecuaciones");
		SistemasEcuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesConEcuacionesMenu EcuacionesMenu = new OperacionesConEcuacionesMenu();
				EcuacionesMenu.correr();
				frame.setVisible(false);
			}
		});
		SistemasEcuaciones.setBackground(Color.CYAN);
		SistemasEcuaciones.setForeground(Color.BLACK);
		SistemasEcuaciones.setBounds(51, 182, 145, 36);
		frame.getContentPane().add(SistemasEcuaciones);
		
		JLabel lblNewLabel = new JLabel("Calculadoras");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(132, 43, 187, 30);
		frame.getContentPane().add(lblNewLabel);
		
		
	}

    public static double[] resolverSistema(double[][] A, double[] B) {
        double a1 = A[0][0], b1 = A[0][1], c1 = B[0];
        double a2 = A[1][0], b2 = A[1][1], c2 = B[1];

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            return null;
        }

        double x = (c1 * b2 - c2 * b1) / determinant;
        double y = (a1 * c2 - a2 * c1) / determinant;

        return new double[] { x, y };
    }
}
