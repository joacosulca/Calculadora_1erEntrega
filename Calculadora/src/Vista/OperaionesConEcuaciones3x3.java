package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OperaionesConEcuaciones3x3 {

	private JFrame frame;
	private JTextField InputA3;
	private JTextField InputOp3;
	private JTextField InputB3;
	private JTextField InputTI3;
	private JTextField InputOp1_2;
	private JTextField InputOp2_2;
	private JTextField InputOp3_2;
	private JTextField InputC1;
	private JTextField InputC3;
	private JTextField InputC2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperaionesConEcuaciones3x3 window = new OperaionesConEcuaciones3x3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OperaionesConEcuaciones3x3() {
		initialize();
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperaionesConEcuaciones3x3 window = new OperaionesConEcuaciones3x3();
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
		frame.setBounds(100, 100, 500, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextField InputA1 = new JTextField();
		InputA1.setBounds(54, 77, 59, 20);
		frame.getContentPane().add(InputA1);
		InputA1.setColumns(10);

		JTextField InputB1 = new JTextField();
		InputB1.setBounds(182, 77, 59, 20);
		frame.getContentPane().add(InputB1);
		InputB1.setColumns(10);

		JTextField InputTI2 = new JTextField();
		InputTI2.setBounds(395, 126, 46, 20);
		frame.getContentPane().add(InputTI2);
		InputTI2.setColumns(10);

		JTextField InputOp1 = new JTextField();
		InputOp1.setBounds(143, 77, 19, 20);
		frame.getContentPane().add(InputOp1);
		InputOp1.setColumns(10);

		JTextField InputTI1 = new JTextField();
		InputTI1.setBounds(395, 77, 46, 20);
		frame.getContentPane().add(InputTI1);
		InputTI1.setColumns(10);

		JTextField InputOp2 = new JTextField();
		InputOp2.setBounds(143, 126, 19, 20);
		frame.getContentPane().add(InputOp2);
		InputOp2.setColumns(10);

		JTextField InputA2 = new JTextField();
		InputA2.setColumns(10);
		InputA2.setBounds(54, 126, 59, 20);
		frame.getContentPane().add(InputA2);

		JTextField InputB2 = new JTextField();
		InputB2.setColumns(10);
		InputB2.setBounds(182, 126, 59, 20);
		frame.getContentPane().add(InputB2);

		JLabel LabelA1 = new JLabel("a1");
		LabelA1.setForeground(Color.WHITE);
		LabelA1.setBounds(73, 60, 19, 14);
		frame.getContentPane().add(LabelA1);

		JButton Atras = new JButton("←");
		Atras.setFont(new Font("Calibri", Font.PLAIN, 10));
		Atras.setBackground(new Color(250, 169, 47));
		Atras.setBounds(21, 17, 46, 29);
		frame.getContentPane().add(Atras);

		JLabel lblA = new JLabel("a2");
		lblA.setForeground(Color.WHITE);
		lblA.setBounds(73, 112, 46, 14);
		frame.getContentPane().add(lblA);

		JLabel lblB = new JLabel("op1");
		lblB.setForeground(Color.WHITE);
		lblB.setBounds(145, 60, 46, 14);
		frame.getContentPane().add(lblB);

		JLabel lblB_1 = new JLabel("op2");
		lblB_1.setForeground(Color.WHITE);
		lblB_1.setBounds(145, 112, 46, 14);
		frame.getContentPane().add(lblB_1);

		JLabel lblB_2 = new JLabel("b2");
		lblB_2.setForeground(Color.WHITE);
		lblB_2.setBounds(207, 112, 46, 14);
		frame.getContentPane().add(lblB_2);

		JLabel lblB_3 = new JLabel("b1");
		lblB_3.setForeground(Color.WHITE);
		lblB_3.setBounds(201, 60, 46, 14);
		frame.getContentPane().add(lblB_3);

		JLabel lblB_5 = new JLabel("Ter.Ind. 1");
		lblB_5.setForeground(Color.WHITE);
		lblB_5.setBounds(400, 57, 59, 20);
		frame.getContentPane().add(lblB_5);

		JLabel lblB_6 = new JLabel("Ter.Ind. 2");
		lblB_6.setForeground(Color.WHITE);
		lblB_6.setBounds(400, 108, 50, 21);
		frame.getContentPane().add(lblB_6);

		JLabel lblNewLabel_1 = new JLabel("Ecuaciones 3x3");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(110, 5, 227, 50);
		frame.getContentPane().add(lblNewLabel_1);

		Panel panel = new Panel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(143, 227, 315, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel Resultado = new JLabel("");
		Resultado.setBounds(10, 11, 295, 44);
		Resultado.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(Resultado);
		Resultado.setHorizontalAlignment(SwingConstants.CENTER);

		InputA3 = new JTextField();
		InputA3.setColumns(10);
		InputA3.setBounds(54, 176, 59, 20);
		frame.getContentPane().add(InputA3);

		JLabel lblA_2 = new JLabel("a3");
		lblA_2.setForeground(Color.WHITE);
		lblA_2.setBounds(73, 159, 46, 14);
		frame.getContentPane().add(lblA_2);

		InputOp3 = new JTextField();
		InputOp3.setColumns(10);
		InputOp3.setBounds(143, 176, 19, 20);
		frame.getContentPane().add(InputOp3);

		JLabel lblB_1_1 = new JLabel("op3");
		lblB_1_1.setForeground(Color.WHITE);
		lblB_1_1.setBounds(143, 159, 33, 14);
		frame.getContentPane().add(lblB_1_1);

		JLabel lblB_2_1 = new JLabel("b3");
		lblB_2_1.setForeground(Color.WHITE);
		lblB_2_1.setBounds(207, 159, 21, 14);
		frame.getContentPane().add(lblB_2_1);

		InputB3 = new JTextField();
		InputB3.setColumns(10);
		InputB3.setBounds(182, 176, 59, 20);
		frame.getContentPane().add(InputB3);

		JLabel lblB_6_1 = new JLabel("Ter.Ind. 3");
		lblB_6_1.setForeground(Color.WHITE);
		lblB_6_1.setBounds(400, 156, 50, 21);
		frame.getContentPane().add(lblB_6_1);

		InputTI3 = new JTextField();
		InputTI3.setColumns(10);
		InputTI3.setBounds(395, 176, 46, 20);
		frame.getContentPane().add(InputTI3);

		JButton Calcular = new JButton("Calcular");
		Calcular.setBackground(new Color(250, 169, 47));
		Calcular.setBounds(31, 246, 88, 29);
		frame.getContentPane().add(Calcular);

		JLabel lblB_4 = new JLabel("c1");
		lblB_4.setForeground(Color.WHITE);
		lblB_4.setBounds(336, 60, 46, 14);
		frame.getContentPane().add(lblB_4);

		JLabel lblB_1_2 = new JLabel("op1");
		lblB_1_2.setForeground(Color.WHITE);
		lblB_1_2.setBounds(266, 60, 46, 14);
		frame.getContentPane().add(lblB_1_2);

		InputOp1_2 = new JTextField();
		InputOp1_2.setColumns(10);
		InputOp1_2.setBounds(266, 77, 19, 20);
		frame.getContentPane().add(InputOp1_2);

		InputOp2_2 = new JTextField();
		InputOp2_2.setColumns(10);
		InputOp2_2.setBounds(266, 126, 19, 20);
		frame.getContentPane().add(InputOp2_2);

		JLabel lblB_1_1_1 = new JLabel("op2");
		lblB_1_1_1.setForeground(Color.WHITE);
		lblB_1_1_1.setBounds(266, 111, 46, 14);
		frame.getContentPane().add(lblB_1_1_1);

		JLabel lblB_4_1 = new JLabel("c2");
		lblB_4_1.setForeground(Color.WHITE);
		lblB_4_1.setBounds(336, 111, 46, 14);
		frame.getContentPane().add(lblB_4_1);

		InputOp3_2 = new JTextField();
		InputOp3_2.setColumns(10);
		InputOp3_2.setBounds(263, 176, 21, 20);
		frame.getContentPane().add(InputOp3_2);

		JLabel lblB_1_1_2 = new JLabel("op3");
		lblB_1_1_2.setForeground(Color.WHITE);
		lblB_1_1_2.setBounds(266, 159, 21, 14);
		frame.getContentPane().add(lblB_1_1_2);

		JLabel lblB_4_2 = new JLabel("c3");
		lblB_4_2.setForeground(Color.WHITE);
		lblB_4_2.setBounds(336, 159, 21, 14);
		frame.getContentPane().add(lblB_4_2);

		InputC1 = new JTextField();
		InputC1.setColumns(10);
		InputC1.setBounds(307, 77, 59, 20);
		frame.getContentPane().add(InputC1);

		InputC3 = new JTextField();
		InputC3.setColumns(10);
		InputC3.setBounds(307, 176, 59, 20);
		frame.getContentPane().add(InputC3);

		InputC2 = new JTextField();
		InputC2.setColumns(10);
		InputC2.setBounds(306, 126, 59, 20);
		frame.getContentPane().add(InputC2);
		
		JLabel lblB_7 = new JLabel("=");
		lblB_7.setForeground(Color.WHITE);
		lblB_7.setBounds(376, 80, 46, 14);
		frame.getContentPane().add(lblB_7);
		
		JLabel lblB_8 = new JLabel("=");
		lblB_8.setForeground(Color.WHITE);
		lblB_8.setBounds(375, 129, 46, 14);
		frame.getContentPane().add(lblB_8);
		
		JLabel lblB_9 = new JLabel("=");
		lblB_9.setForeground(Color.WHITE);
		lblB_9.setBounds(376, 179, 46, 14);
		frame.getContentPane().add(lblB_9);

		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesConEcuacionesMenu window = new OperacionesConEcuacionesMenu();
				window.correr();
				frame.setVisible(false);
			}
		});

		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a1 = Double.parseDouble(InputA1.getText());
					double a2 = Double.parseDouble(InputA2.getText());
					double a3 = Double.parseDouble(InputA3.getText());
					double b1 = Double.parseDouble(InputB1.getText());
					double b2 = Double.parseDouble(InputB2.getText());
					double b3 = Double.parseDouble(InputB3.getText());
					double c1 = Double.parseDouble(InputC1.getText());
					double c2 = Double.parseDouble(InputC2.getText());
					double c3 = Double.parseDouble(InputC3.getText());
					double TI1 = Double.parseDouble(InputTI1.getText());
					double TI2 = Double.parseDouble(InputTI2.getText());
					double TI3 = Double.parseDouble(InputTI3.getText());

					double determinante = a1 * (b2 * c3 - c2 * b3) - b1 * (a2 * c3 - c2 * a3) + c1 * (a2 * b3 - b2 * a3);

					if (determinante != 0) {
						double determinanteX = TI1 * (b2 * c3 - c2 * b3) - b1 * (TI2 * c3 - c2 * TI3) + c1 * (TI2 * b3 - b2 * TI3);
						double determinanteY = a1 * (TI2 * c3 - c2 * TI3) - TI1 * (a2 * c3 - c2 * a3) + c1 * (a2 * TI3 - TI2 * a3);
						double determinanteZ = a1 * (b2 * TI3 - TI2 * b3) - b1 * (a2 * TI3 - TI2 * a3) + TI1 * (a2 * b3 - b2 * a3);

						double resultadoX = determinanteX / determinante;
						double resultadoY = determinanteY / determinante;
						double resultadoZ = determinanteZ / determinante;

						Resultado.setText(String.format("X = %.2f    Y = %.2f    Z = %.2f", resultadoX, resultadoY, resultadoZ));
					} else {
						Resultado.setText("No hay solución única");
					}
				} catch (NumberFormatException ex) {
					Resultado.setText("Error en la entrada");
				} catch (Exception ex) {
					Resultado.setText("Ocurrió un error");
				}
			}
		});
	}
}
