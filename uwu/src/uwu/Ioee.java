package uwu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Ioee extends JFrame implements ActionListener {

	private JPanel contentPane;
    private JFrame jframe;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ioee frame = new Ioee();
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
	public Ioee() {
		  jframe = new JFrame();
		 
		setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPoto = new JButton("multiplicar");
		btnPoto.addActionListener( this );
	
		
		btnPoto.setBounds(220, 30, 89, 23);
		contentPane.add(btnPoto);
		
		JLabel lblNewLabel = new JLabel("numero 1 :");
		lblNewLabel.setBounds(29, 34, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("numero 2 :  ");
		lblNewLabel_1.setBounds(29, 59, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(85, 31, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(85, 59, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(85, 115, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
			
	}
	public void actionPerformed(ActionEvent e) {
	
	 Integer resultado = Integer.parseInt(txtNum1.getText())  - Integer.parseInt(txtNum2.getText());
	 
	txtResultado.setText(resultado.toString()); 
	
	
	
	
	}
	
	}
	
	