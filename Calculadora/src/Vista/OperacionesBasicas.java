package Vista;

import java.awt.EventQueue;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;

public class OperacionesBasicas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesBasicas window = new OperacionesBasicas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesBasicas window = new OperacionesBasicas();
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
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 369, 495);
		

		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.setBackground(new Color(192, 192, 192));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(50, 84, 256, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		JLabel Calculo = new JLabel("");
		Calculo.setBounds(23, 11, 212, 53);
		panel.add(Calculo);
		Calculo.setFont(new Font("Calibri", Font.BOLD, 20));
		Calculo.setBackground(new Color(0, 0, 255));
		Calculo.setForeground(new Color(0, 0, 0));
		
		JButton cuatro = new JButton("4");
		cuatro.setFont(new Font("Calibri", Font.PLAIN, 14));
		cuatro.setBackground(new Color(174, 255, 255));
		cuatro.setForeground(new Color(0, 0, 0));
		cuatro.setBounds(32, 248, 51, 40);
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "4");
			}
		});
		frame.getContentPane().add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setFont(new Font("Calibri", Font.PLAIN, 14));
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "5");
			}
		});
		cinco.setBackground(new Color(174, 255, 255));
		cinco.setForeground(new Color(0, 0, 0));
		cinco.setBounds(93, 248, 47, 40);
		frame.getContentPane().add(cinco);
		
		JButton seis = new JButton("6");
		seis.setFont(new Font("Calibri", Font.PLAIN, 14));
		seis.setBackground(new Color(174, 255, 255));
		seis.setForeground(new Color(0, 0, 0));
		seis.setBounds(150, 248, 46, 40);
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "6");
			}
		});
		frame.getContentPane().add(seis);
		
		JButton uno = new JButton("1");
		uno.setFont(new Font("Calibri", Font.PLAIN, 14));
		uno.setBackground(new Color(174, 255, 255));
		uno.setForeground(new Color(0, 0, 0));
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "1");
			}
		});
		uno.setBounds(32, 299, 51, 40);
		frame.getContentPane().add(uno);
		
		JButton dos = new JButton("2");
		dos.setFont(new Font("Calibri", Font.PLAIN, 14));
		dos.setBackground(new Color(174, 255, 255));
		dos.setForeground(new Color(0, 0, 0));
		dos.setBounds(93, 299, 47, 40);
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "2");
			}
		});
		frame.getContentPane().add(dos);
		
		JButton tres = new JButton("3");
		tres.setFont(new Font("Calibri", Font.PLAIN, 14));
		tres.setBackground(new Color(174, 255, 255));
		tres.setForeground(new Color(0, 0, 0));
		tres.setBounds(150, 299, 46, 40);
		frame.getContentPane().add(tres);
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "3");
			}
		});
		
		JButton nueve = new JButton("9");
		nueve.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		nueve.setBackground(new Color(174, 255, 255));
		nueve.setForeground(new Color(0, 0, 0));
		nueve.setBounds(150, 200, 46, 40);
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "9");
			}
		});
		frame.getContentPane().add(nueve);
		
		JButton ocho = new JButton("8");
		ocho.setFont(new Font("Calibri", Font.PLAIN, 14));
		ocho.setBackground(new Color(174, 255, 255));
		ocho.setForeground(new Color(0, 0, 0));
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "8");
			}
		});
		ocho.setBounds(93, 200, 47, 40);
		frame.getContentPane().add(ocho);
		
		JButton siete = new JButton("7");
		siete.setFont(new Font("Calibri", Font.PLAIN, 14));
		siete.setForeground(new Color(0, 0, 0));
		siete.setBackground(new Color(174, 255, 255));
		siete.setBounds(32, 200, 51, 40);
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "7");
			}
		});
		frame.getContentPane().add(siete);
		
		JButton ac = new JButton("AC");
		ac.setFont(new Font("Calibri", Font.PLAIN, 14));
		ac.setBackground(new Color(250, 169, 47));
		ac.setForeground(new Color(0, 0, 0));
		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText("");
			}
		});
		ac.setBounds(270, 200, 51, 40);
		frame.getContentPane().add(ac);
		
		JButton por = new JButton("x");
		por.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		por.setBackground(new Color(174, 255, 255));
		por.setForeground(new Color(0, 0, 0));
		por.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "x");
			}
		});
		por.setBounds(206, 248, 54, 40);
		frame.getContentPane().add(por);
		
		JButton cero = new JButton("0");
		cero.setFont(new Font("Calibri", Font.PLAIN, 14));
		cero.setBackground(new Color(174, 255, 255));
		cero.setForeground(new Color(0, 0, 0));
		cero.setBounds(32, 350, 51, 40);
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "0");
			}
		});
		frame.getContentPane().add(cero);
		
		JButton del = new JButton("DEL");
		del.setFont(new Font("Calibri", Font.PLAIN, 13));
		del.setBackground(new Color(250, 169, 47));
		del.setForeground(new Color(0, 0, 0));
		del.setBounds(206, 200, 54, 40);
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = Calculo.getText();
				if(Calculo.getText().length()==0) {
					return;
				} else {
					Calculo.setText(txt.substring(0, txt.length() - 1));
				}
					
				
			}
		});
		frame.getContentPane().add(del);
		
		JButton punto = new JButton(".");
		punto.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		punto.setBackground(new Color(174, 255, 255));
		punto.setForeground(new Color(0, 0, 0));
		punto.setBounds(93, 350, 47, 40);
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + ".");
			}
		});
		frame.getContentPane().add(punto);
		
		JButton mas = new JButton("+");
		mas.setFont(new Font("Calibri", Font.PLAIN, 14));
		mas.setBackground(new Color(174, 255, 255));
		mas.setForeground(new Color(0, 0, 0));
		mas.setBounds(206, 299, 54, 40);
		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "+");
			}
		});
		
		frame.getContentPane().add(mas);
		
		JButton menos = new JButton("-");
		menos.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		menos.setBackground(new Color(174, 255, 255));
		menos.setForeground(new Color(0, 0, 0));
		menos.setBounds(270, 299, 51, 40);
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "-");
			}
		});
		frame.getContentPane().add(menos);
		
		JButton division = new JButton("/");
		division.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		division.setBackground(new Color(174, 255, 255));
		division.setForeground(new Color(0, 0, 0));
		division.setBounds(270, 248, 51, 40);
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "/");
			}
		});
		frame.getContentPane().add(division);
		
		JButton igual = new JButton("=");
		igual.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		igual.setBackground(new Color(250, 169, 47));
		igual.setForeground(new Color(0, 0, 0));
		igual.setBounds(150, 350, 171, 40);
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().length()==0) {
					return;
				}

				List<String> calculos = new ArrayList<>();
				List<Character> operaciones = new ArrayList<>();
				
				String calculo = Calculo.getText();
				
				int terminoIndice = 0;
				for (int x = 0; x < calculo.length(); x++) {
				
					if (calculo.charAt(x) == '+' || calculo.charAt(x) == '-') {
						String calculito = calculo.substring(terminoIndice, x);
						terminoIndice = x + 1;
						calculos.add(calculito);
						operaciones.add(calculo.charAt(x));
					}
					if (x + 1 == calculo.length()) {
						calculos.add(calculo.substring(terminoIndice, x + 1));
					}	
				}

				for (int i = 0; i < calculos.size(); i++) {
					String termino = calculos.get(i);
					if (termino.contains("x") || termino.contains("/")) {
						double resultado = resolver(termino);
						calculos.set(i, String.valueOf(resultado));
					}
				}

				double resultadoFinal = 0;
				
				try {
					if (!calculos.isEmpty()) {
						resultadoFinal = Double.parseDouble(calculos.get(0));
					}
				
					for (int i = 0; i < operaciones.size(); i++) {
						
						double siguienteNumero = Double.parseDouble(calculos.get(i + 1));
						char operacion = operaciones.get(i);
						
						if (operacion == '+') {
							resultadoFinal += siguienteNumero;
						} else if (operacion == '-') {
							resultadoFinal -= siguienteNumero;
						}

					}
					
					Calculo.setText(String.valueOf(resultadoFinal));
					
				} catch (NumberFormatException err) {
						Calculo.setText("Error Sintáctico: " + err.getMessage());
				}
			}
		});
		frame.getContentPane().add(igual);
		
		JButton Atras = new JButton("←");
		Atras.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Atras.setBackground(new Color(250, 169, 47));
		Atras.setBounds(21, 17, 51, 29);
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
	
	public OperacionesBasicas() {
		initialize();
	}

	public static double resolver(String calculo) {
		
		List<String> calculos = new ArrayList<>();
		List<Character> operaciones = new ArrayList<>();
		int terminoIndice = 0;
		
		for (int x = 0; x < calculo.length(); x++) {
			if (calculo.charAt(x) == 'x' || calculo.charAt(x) == '/') {
				String calculito = calculo.substring(terminoIndice, x);
				terminoIndice = x + 1;
				calculos.add(calculito);
				operaciones.add(calculo.charAt(x));
			}
			
			if (x + 1 == calculo.length()) {
				calculos.add(calculo.substring(terminoIndice, x + 1));
			}
		}
	
		double resultado = 0;
		
		try {
			
			if (!calculos.isEmpty()) {
				resultado = Double.parseDouble(calculos.get(0));
			}
			
			for (int i = 0; i < operaciones.size(); i++) {
				
				double siguienteNumero = Double.parseDouble(calculos.get(i + 1));
				char operacion = operaciones.get(i);
				
				if (operacion == 'x') {
					resultado *= siguienteNumero;
				} else if (operacion == '/') {
					resultado /= siguienteNumero;
				}
				
			}
		}
		catch(Exception e) {
			System.out.println("Error sintactico: " + e.getMessage());		
		}
			
		return resultado;
	}
}
