package uwu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class Ejemplo1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecioProducto;
	private JTextField txtCantidadProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 frame = new Ejemplo1();
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
	public Ejemplo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio del Producto:");
		lblNewLabel.setBounds(10, 10, 149, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de Producto:");
		lblNewLabel_1.setBounds(10, 42, 149, 14);
		contentPane.add(lblNewLabel_1);
		
		txtPrecioProducto = new JTextField();
		txtPrecioProducto.setBounds(169, 7, 116, 20);
		contentPane.add(txtPrecioProducto);
		txtPrecioProducto.setColumns(10);
		
		txtCantidadProducto = new JTextField();
		txtCantidadProducto.setBounds(169, 39, 116, 20);
		contentPane.add(txtCantidadProducto);
		txtCantidadProducto.setColumns(10);
		
		JTextPane txtResultado = new JTextPane();
		txtResultado.setEditable(false);
		txtResultado.setBounds(184, 336, 458, 227);
		contentPane.add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular Pago");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtCantidadProducto.getText().isEmpty() || txtPrecioProducto.getText().isEmpty()) { //  operadores logicos ||   &&   
					
					JOptionPane mensajeError = new  JOptionPane();
					mensajeError.showMessageDialog(btnCalcular, "Ingrese una cantidad valida");
					
				}else if(verificarTexto(txtCantidadProducto.getText())){
					
					JOptionPane mensajeError = new  JOptionPane();
					mensajeError.showMessageDialog(btnCalcular, "Ingrese solo números");
					
				}else if(verificarTexto(txtPrecioProducto.getText())) {
					JOptionPane mensajeError = new  JOptionPane();
					mensajeError.showMessageDialog(btnCalcular, "Ingrese solo números");
					
				}else{
					

					int cntProducto =  Integer.parseInt(txtCantidadProducto.getText());
					int precioProducto  = Integer.parseInt(txtCantidadProducto.getText());
					
					int importeCompra = obtenerImporte(precioProducto, cntProducto);
					
					int importeDescuento = obtenerDescuento0(importeCompra);
					
					int importePagar = importePagar(importeCompra, importeDescuento);
					
					int cntCaremelos = calcularCaramelos(cntProducto);
					
					String resultado =  "El resultado es:  \n Importe de Compra: "+
					importeCompra + "\n Importe de descuento: "+importeDescuento + 
					"\n Importe a pagar: " + importePagar + "\n Cantidad de caramelos: " +
					cntCaremelos;
					txtResultado.setText(resultado);
				}
				
				
				
				
			}
		});
		btnCalcular.setBounds(731, 6, 116, 38);
		contentPane.add(btnCalcular);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText("");
				txtCantidadProducto.setText("");
				txtPrecioProducto.setText("");
			}
		});
		btnNewButton.setBounds(731, 67, 116, 38);
		contentPane.add(btnNewButton);
		
	

	}
	
	
	
	 /*
	  * 	f(x,y)=x*y
	  * 	
	  * 	si x = 4 , y=5 f(x,y) = 20
	  * */
	
	 int obtenerImporte(int precioProducto, int cntProducto) {
		return precioProducto * cntProducto;
	}
	 
	 int obtenerDescuento0(int importeCompra) {
		 return (importeCompra*30)/100;
	 }
	 
	 int importePagar(int importeCompra, int descuento) {
		 return importeCompra-descuento;	
	 }
	 int calcularCaramelos(int cntProducto) {
		 return cntProducto*1;
	 }
	 
	 boolean verificarTexto(String msg) {
		 
		 boolean resultado = false; //true or false
		 
		 try {
			 
			 int a = Integer.parseInt(msg);
			 System.out.println("si funcionaaaaaaa!!! " + a);
			
		} catch (Exception e) {
			System.out.println("ERORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!!!!!!!!!" + e.getCause());
			resultado = true;
		}
		 
		 
		 return resultado;
	 }
	 
}
