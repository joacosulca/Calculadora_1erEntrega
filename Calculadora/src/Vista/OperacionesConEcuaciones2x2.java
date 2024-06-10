package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Label;
import javax.swing.SwingConstants;

public class OperacionesConEcuaciones2x2 {

	private JFrame frame;
	private JTextField InputA1;
	private JTextField InputB1;
	private JTextField InputTI2;
	private JTextField InputOp1;
	private JTextField InputTI1;
	private JTextField InputOp2;
	private JTextField InputA2;
	private JTextField InputB2;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblB_1;
	private JLabel lblB_2;
	private JLabel lblB_3;
	private JLabel lblB_5;
	private JLabel lblB_6;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuaciones2x2 window = new OperacionesConEcuaciones2x2();
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
	public OperacionesConEcuaciones2x2() {
		initialize();
	}
	
	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuaciones2x2 window = new OperacionesConEcuaciones2x2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		InputA1 = new JTextField();
		InputA1.setBounds(32, 100, 59, 20);
		frame.getContentPane().add(InputA1);
		InputA1.setColumns(10);
		
		InputB1 = new JTextField();
		InputB1.setBounds(175, 100, 59, 20);
		frame.getContentPane().add(InputB1);
		InputB1.setColumns(10);
		
		InputTI2 = new JTextField();
		InputTI2.setBounds(285, 158, 46, 20);
		frame.getContentPane().add(InputTI2);
		InputTI2.setColumns(10);
		
		InputOp1 = new JTextField();
		InputOp1.setBounds(116, 100, 39, 20);
		frame.getContentPane().add(InputOp1);
		InputOp1.setColumns(10);
		
		InputTI1 = new JTextField();
		InputTI1.setBounds(285, 100, 46, 20);
		frame.getContentPane().add(InputTI1);
		InputTI1.setColumns(10);
		
		InputOp2 = new JTextField();
		InputOp2.setBounds(116, 158, 39, 20);
		frame.getContentPane().add(InputOp2);
		InputOp2.setColumns(10);
		
		InputA2 = new JTextField();
		InputA2.setColumns(10);
		InputA2.setBounds(32, 158, 59, 20);
		frame.getContentPane().add(InputA2);
		
		InputB2 = new JTextField();
		InputB2.setColumns(10);
		InputB2.setBounds(175, 158, 59, 20);
		frame.getContentPane().add(InputB2);
		
		JLabel LabelA1 = new JLabel("a1");
		LabelA1.setForeground(Color.WHITE);
		LabelA1.setBounds(42, 77, 46, 14);
		frame.getContentPane().add(LabelA1);
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton Atras = new JButton("←");
		Atras.setFont(new Font("Calibri", Font.PLAIN, 10));
		Atras.setBackground(new Color(250, 169, 47));
		Atras.setBounds(21, 17, 46, 29);
		frame.getContentPane().add(Atras);
		
		lblA = new JLabel("a2");
		lblA.setForeground(Color.WHITE);
		lblA.setBounds(42, 136, 46, 14);
		frame.getContentPane().add(lblA);
		
		lblB = new JLabel("op1");
		lblB.setForeground(Color.WHITE);
		lblB.setBounds(126, 77, 46, 14);
		frame.getContentPane().add(lblB);
		
		lblB_1 = new JLabel("op2");
		lblB_1.setForeground(Color.WHITE);
		lblB_1.setBounds(126, 136, 46, 14);
		frame.getContentPane().add(lblB_1);
		
		lblB_2 = new JLabel("b2");
		lblB_2.setForeground(Color.WHITE);
		lblB_2.setBounds(197, 136, 46, 14);
		frame.getContentPane().add(lblB_2);
		
		lblB_3 = new JLabel("b1");
		lblB_3.setForeground(Color.WHITE);
		lblB_3.setBounds(197, 77, 46, 14);
		frame.getContentPane().add(lblB_3);
		
		lblB_5 = new JLabel("Termino Independiente");
		lblB_5.setForeground(Color.WHITE);
		lblB_5.setBounds(251, 70, 120, 29);
		frame.getContentPane().add(lblB_5);
		
		lblB_6 = new JLabel("Termino Independiente 2");
		lblB_6.setForeground(Color.WHITE);
		lblB_6.setBounds(251, 129, 120, 29);
		frame.getContentPane().add(lblB_6);
		
		lblNewLabel_1 = new JLabel("Ecuaciones 2x2");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(75, 17, 227, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(156, 201, 188, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Resultado = new JLabel("");
		Resultado.setBounds(10, 11, 168, 28);
		Resultado.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(Resultado);
		
		btnNewButton = new JButton("Resolver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		        
		        double a1 = Double.parseDouble(InputA1.getText());
		        
		        double b1 = Double.parseDouble(InputB1.getText());
		        
		        char operador1 = InputOp1.getText().charAt(0);
		        if (operador1 == '-') {
		            b1 = -b1;
		        }
		        
		        double c1 = Double.parseDouble(InputTI1.getText());

		        double a2 = Double.parseDouble(InputA2.getText());
		        
		        double b2 = Double.parseDouble(InputB2.getText());
		        
		        char operador2 = InputOp2.getText().charAt(0);
		        if (operador2 == '-') {
		            b2 = -b2;
		        }

		        double c2 = Double.parseDouble(InputTI2.getText());

		        
		        double[][] A = { {a1, b1}, {a2, b2} };
		        double[] B = { c1, c2 };

		        
		        double[] solucion = resolverSistema(A, B);
		        if (solucion != null) {
		            Resultado.setText("x = " + String.format("%.2f", solucion[0]));
		            Resultado.setText(Resultado.getText() + "    y = " + String.format("%.2f", solucion[1]));
		        } else {
		        	Resultado.setText("El sistema de ecuaciones no tiene solución única.");
		        }
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNewButton.setBounds(32, 211, 89, 32);
		frame.getContentPane().add(btnNewButton);
		
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OperacionesConEcuacionesMenu menu = new OperacionesConEcuacionesMenu();
				menu.correr();
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
