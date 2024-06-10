package Vista;


import java.util.ArrayList;
import java.util.List;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JButton;

public class OperacionesConVectores {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConVectores window = new OperacionesConVectores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	int count=0;
	ArrayList<Double> vec1 = new ArrayList<>();
	ArrayList<Double> vec2 = new ArrayList<>();
	Double numEscalar;

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConVectores window = new OperacionesConVectores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public OperacionesConVectores() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 380, 424);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.setBackground(new Color(192, 192, 192));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(28, 66, 310, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		JLabel Calculo = new JLabel("");
		Calculo.setBounds(10, 11, 240, 53);
		panel.add(Calculo);
		Calculo.setFont(new Font("Calibri", Font.BOLD, 20));
		Calculo.setBackground(new Color(0, 0, 255));
		Calculo.setForeground(new Color(0, 0, 0));
		
		JButton cuatro = new JButton("4");
		cuatro.setFont(new Font("Calibri", Font.PLAIN, 14));
		cuatro.setBackground(new Color(174, 255, 255));
		cuatro.setForeground(new Color(0, 0, 0));
		cuatro.setBounds(41, 213, 63, 40);
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
		cinco.setBounds(114, 213, 63, 40);
		frame.getContentPane().add(cinco);
		
		JButton seis = new JButton("6");
		seis.setFont(new Font("Calibri", Font.PLAIN, 14));
		seis.setBackground(new Color(174, 255, 255));
		seis.setForeground(new Color(0, 0, 0));
		seis.setBounds(187, 213, 63, 40);
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
		uno.setBounds(41, 264, 63, 40);
		frame.getContentPane().add(uno);
		
		JButton dos = new JButton("2");
		dos.setFont(new Font("Calibri", Font.PLAIN, 14));
		dos.setBackground(new Color(174, 255, 255));
		dos.setForeground(new Color(0, 0, 0));
		dos.setBounds(114, 264, 63, 40);
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
		tres.setBounds(187, 264, 63, 40);
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
		nueve.setBounds(187, 165, 65, 40);
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
		ocho.setBounds(114, 165, 63, 40);
		frame.getContentPane().add(ocho);
		
		JButton siete = new JButton("7");
		siete.setFont(new Font("Calibri", Font.PLAIN, 14));
		siete.setForeground(new Color(0, 0, 0));
		siete.setBackground(new Color(174, 255, 255));
		siete.setBounds(41, 165, 63, 40);
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "7");
			}
		});
		frame.getContentPane().add(siete);
		
		JButton cero = new JButton("0");
		cero.setFont(new Font("Calibri", Font.PLAIN, 14));
		cero.setBackground(new Color(174, 255, 255));
		cero.setForeground(new Color(0, 0, 0));
		cero.setBounds(41, 315, 63, 40);
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "0");
			}
		});
		frame.getContentPane().add(cero);
		
		JButton siguiente = new JButton("→");
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().charAt(Calculo.getText().length()-1)!= ' ') {
					Calculo.setText(Calculo.getText() + ", ");
				}
			}
		});
		siguiente.setForeground(Color.BLACK);
		siguiente.setFont(new Font("Calibri", Font.PLAIN, 14));
		siguiente.setBackground(new Color(250, 169, 47));
		siguiente.setBounds(114, 315, 63, 40);
		frame.getContentPane().add(siguiente);
		

		
		JButton ac = new JButton("AC");
		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText("");
			}
		});
		ac.setForeground(Color.BLACK);
		ac.setFont(new Font("Calibri", Font.PLAIN, 14));
		ac.setBackground(new Color(174, 255, 255));
		ac.setBounds(260, 213, 65, 91);
		frame.getContentPane().add(ac);
		

		
		JButton del = new JButton("DEL");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().length()!=0) {
					if(Calculo.getText().charAt(Calculo.getText().length()-1)==' ') {
						Calculo.setText(Calculo.getText().substring(0, Calculo.getText().length() - 2));
						return;
					}
					Calculo.setText(Calculo.getText().substring(0, Calculo.getText().length() - 1));
				}
			}
		});
		del.setForeground(Color.BLACK);
		del.setFont(new Font("Calibri", Font.PLAIN, 14));
		del.setBackground(new Color(174, 255, 255));
		del.setBounds(260, 165, 65, 40);
		frame.getContentPane().add(del);
		

		JButton sumar = new JButton("Sumar");
		sumar.setBackground(new Color(174, 255, 255));
		sumar.setVisible(false);
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(String.valueOf(sumaVectores(vec1, vec2)));
			}
		});
		sumar.setBounds(28, 202, 149, 46);
		sumar.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(sumar);
		
		JButton restar = new JButton("Restar");
		restar.setBackground(new Color(174, 255, 255));
		restar.setVisible(false);
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(String.valueOf(restaVectores(vec1, vec2)));
			}
		});
		restar.setFont(new Font("Calibri", Font.BOLD, 15));
		restar.setBounds(187, 202, 151, 46);
		frame.getContentPane().add(restar);
		
		JButton multiplicacionEscalar = new JButton("MultiplicacionEsc");
		multiplicacionEscalar.setBackground(new Color(174, 255, 255));
		multiplicacionEscalar.setVisible(false);
		multiplicacionEscalar.setFont(new Font("Calibri", Font.BOLD, 15));
		multiplicacionEscalar.setBounds(28, 313, 149, 46);
		frame.getContentPane().add(multiplicacionEscalar);
		
		JButton ProductoEscalar = new JButton("Producto Escalar");
		ProductoEscalar.setBackground(new Color(174, 255, 255));
		ProductoEscalar.setVisible(false);
		ProductoEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(String.valueOf(productoEscalar(vec1, vec2)));
			}
		});
		ProductoEscalar.setBounds(28, 259, 149, 43);
		ProductoEscalar.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(ProductoEscalar);
		
		JButton ProductoVectorial = new JButton("Producto Vectorial");
		ProductoVectorial.setBackground(new Color(174, 255, 255));
		ProductoVectorial.setVisible(false);
		ProductoVectorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vec1.size()==3&&vec2.size()==3) {
					Calculo.setText(String.valueOf(productoVectorial(vec1, vec2)));
				} else {
					Calculo.setText("No se puede hacer el producto factorial si ambos no tienen 3 de dimencion");
				}
			}
		});
		ProductoVectorial.setBounds(187, 259, 151, 43);
		ProductoVectorial.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(ProductoVectorial);
		

		
		JLabel labelVec1 = new JLabel("");
		labelVec1.setForeground(Color.WHITE);
		labelVec1.setVisible(false);
		labelVec1.setFont(new Font("Calibri", Font.BOLD, 13));
		labelVec1.setBounds(28, 147, 300, 29);
		frame.getContentPane().add(labelVec1);
		
		JLabel labelVec2 =  new JLabel("");
		labelVec2.setForeground(Color.WHITE);
		labelVec2.setVisible(false);
		labelVec2.setFont(new Font("Calibri", Font.BOLD, 13));
		labelVec2.setBounds(28, 165, 287, 25);
		frame.getContentPane().add(labelVec2);
		
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
		

		JButton multEscalarVec2 = new JButton("MultiplicacionEsc2");
		multEscalarVec2.setBackground(new Color(174, 255, 255));
		multEscalarVec2.setFont(new Font("Calibri", Font.BOLD, 15));
		multEscalarVec2.setVisible(false);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().length()==0) {
					return;
				}
				
				if(Calculo.getText().charAt(Calculo.getText().length()-1)!=' ') {

				count++;
				
				if(count==1) {
				
					int terminoIndice=0;
				
					for(int x=0;x<Calculo.getText().length();x++) {
						if(Calculo.getText().charAt(x) == ',') {
							vec1.add(Double.parseDouble(Calculo.getText().substring(terminoIndice, x)));
							terminoIndice = x+2;
						}
						if(x==Calculo.getText().length()-1) {
							vec1.add(Double.parseDouble(Calculo.getText().substring(terminoIndice, Calculo.getText().length())));
						}
					}
					
				} else if(count>1) {
					
					int contador=0;
					int contador2=0;
					
					for(int x=0;x<Calculo.getText().length();x++) {
						if(Calculo.getText().charAt(x)==',') {
							contador++;
						}
					}
					
					for(double i : vec1) {
						contador2++;
					}
				
					
					if(contador2!=contador+1) {
						return;
					}
					
					int terminoIndice=0;
				
					for(int x=0;x<Calculo.getText().length();x++) {
						if(Calculo.getText().charAt(x) == ',') {
							vec2.add(Double.parseDouble(Calculo.getText().substring(terminoIndice, x)));
							terminoIndice = x+2;
						}
						if(x==Calculo.getText().length()-1) {
							vec2.add(Double.parseDouble(Calculo.getText().substring(terminoIndice, Calculo.getText().length())));
						}
					}
					
					igual.setVisible(false);
					uno.setVisible(false);
					dos.setVisible(false);
					tres.setVisible(false);
					cuatro.setVisible(false);
					cinco.setVisible(false);
					seis.setVisible(false);
					siete.setVisible(false);
					ocho.setVisible(false);
					nueve.setVisible(false);
					cero.setVisible(false);
					siguiente.setVisible(false);
					ac.setVisible(false);
					del.setVisible(false);
					sumar.setVisible(true);
					restar.setVisible(true);
					multiplicacionEscalar.setVisible(true);
					multEscalarVec2.setVisible(true);
					ProductoEscalar.setVisible(true);
					ProductoVectorial.setVisible(true);
					labelVec1.setVisible(true);
					labelVec2.setVisible(true);
					labelVec1.setText("Primer vector: " + String.valueOf(vec1));
					labelVec2.setText("Segundo vector: " + String.valueOf(vec2));
				}

					Calculo.setText("");
				
				}
				
			}
		});
		igual.setForeground(Color.BLACK);
		igual.setFont(new Font("Calibri", Font.PLAIN, 14));
		igual.setBackground(new Color(250, 169, 47));
		igual.setBounds(187, 315, 140, 40);
		frame.getContentPane().add(igual);
		
		multEscalarVec2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Calculo.setText("");
				
				igual.setVisible(true);
				uno.setVisible(true);
				dos.setVisible(true);
				tres.setVisible(true);
				cuatro.setVisible(true);
				cinco.setVisible(true);
				seis.setVisible(true);
				siete.setVisible(true);
				ocho.setVisible(true);
				nueve.setVisible(true);
				cero.setVisible(true);
				ac.setVisible(true);
				del.setVisible(true);
				sumar.setVisible(false);
				restar.setVisible(false);
				multiplicacionEscalar.setVisible(false);
				multEscalarVec2.setVisible(false);
				ProductoEscalar.setVisible(false);
				ProductoVectorial.setVisible(false);
				labelVec1.setVisible(false);
				labelVec2.setVisible(false);
				labelVec1.setText("Primer vector: " + String.valueOf(vec1));
				labelVec2.setText("Segundo vector: " + String.valueOf(vec2));
				igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Calculo.getText().length()==0) {
							return;
						}
						
							
							igual.setVisible(false);
							uno.setVisible(false);
							dos.setVisible(false);
							tres.setVisible(false);
							cuatro.setVisible(false);
							cinco.setVisible(false);
							seis.setVisible(false);
							siete.setVisible(false);
							ocho.setVisible(false);
							nueve.setVisible(false);
							cero.setVisible(false);
							siguiente.setVisible(false);
							ac.setVisible(false);
							del.setVisible(false);
							sumar.setVisible(true);
							restar.setVisible(true);
							multiplicacionEscalar.setVisible(true);
							ProductoEscalar.setVisible(true);
							ProductoVectorial.setVisible(true);
							labelVec1.setVisible(true);
							labelVec2.setVisible(true);

							numEscalar = Double.valueOf(Calculo.getText());
							
							Calculo.setText(String.valueOf(multiplicacionEscalar(vec2,numEscalar)));
						}
						
				});
			}
		});
		multEscalarVec2.setBounds(187, 313, 151, 46);
		frame.getContentPane().add(multEscalarVec2);
		

		multiplicacionEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Calculo.setText("");
				
				igual.setVisible(true);
				uno.setVisible(true);
				dos.setVisible(true);
				tres.setVisible(true);
				cuatro.setVisible(true);
				cinco.setVisible(true);
				seis.setVisible(true);
				siete.setVisible(true);
				ocho.setVisible(true);
				nueve.setVisible(true);
				cero.setVisible(true);
				ac.setVisible(true);
				del.setVisible(true);
				sumar.setVisible(false);
				restar.setVisible(false);
				multiplicacionEscalar.setVisible(false);
				multEscalarVec2.setVisible(false);
				ProductoEscalar.setVisible(false);
				ProductoVectorial.setVisible(false);
				labelVec1.setVisible(false);
				labelVec2.setVisible(false);
				labelVec1.setText("Primer vector: " + String.valueOf(vec1));
				labelVec2.setText("Segundo vector: " + String.valueOf(vec2));
				igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Calculo.getText().length()==0) {
							return;
						}
						
							
							igual.setVisible(false);
							uno.setVisible(false);
							dos.setVisible(false);
							tres.setVisible(false);
							cuatro.setVisible(false);
							cinco.setVisible(false);
							seis.setVisible(false);
							siete.setVisible(false);
							ocho.setVisible(false);
							nueve.setVisible(false);
							cero.setVisible(false);
							siguiente.setVisible(false);
							ac.setVisible(false);
							del.setVisible(false);
							sumar.setVisible(true);
							restar.setVisible(true);
							multiplicacionEscalar.setVisible(true);
							multEscalarVec2.setVisible(true);
							ProductoEscalar.setVisible(true);
							ProductoVectorial.setVisible(true);
							labelVec1.setVisible(true);
							labelVec2.setVisible(true);

							numEscalar = Double.valueOf(Calculo.getText());

							
							Calculo.setText(String.valueOf(multiplicacionEscalar(vec1,numEscalar)));
						}
						
				});
			}
		});
	}
	
    public static ArrayList<Double> sumaVectores(ArrayList<Double> v1, ArrayList<Double> v2) {
        ArrayList<Double> resultado = new ArrayList<>(v1.size());
        for (int i = 0; i < v1.size(); i++) {
            resultado.add(v1.get(i) + v2.get(i));
        }
        return resultado;
    }

    public static ArrayList<Double> restaVectores(ArrayList<Double> v1, ArrayList<Double> v2) {
        ArrayList<Double> resultado = new ArrayList<>(v1.size());
        for (int i = 0; i < v1.size(); i++) {
            resultado.add(v1.get(i) - v2.get(i));
        }
        return resultado;
    }

    public static ArrayList<Double> multiplicacionEscalar(ArrayList<Double> v, double escalar) {
        ArrayList<Double> resultado = new ArrayList<>(v.size());
        for (int i = 0; i < v.size(); i++) {
            resultado.add(v.get(i) * escalar);
        }
        return resultado;
    }

    public static double productoEscalar(ArrayList<Double> v1, ArrayList<Double> v2) {
        double resultado = 0;
        for (int i = 0; i < v1.size(); i++) {
            resultado += v1.get(i) * v2.get(i);
        }
        return resultado;
    }
    
    

    public static ArrayList<Double> productoVectorial(ArrayList<Double> v1, ArrayList<Double> v2) {
    	ArrayList<Double> resultado = new ArrayList<>(3);
    	if (v1.size() == 3 && v2.size() == 3) {
            resultado.add(v1.get(1) * v2.get(2) - v1.get(2) * v2.get(1));
            resultado.add(v1.get(2) * v2.get(0) - v1.get(0) * v2.get(2));
            resultado.add(v1.get(0) * v2.get(1) - v1.get(1) * v2.get(0));
            return resultado;
        }
        return resultado;
    }

}
