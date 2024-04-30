package cibertec;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class ListarCocinas extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarCocinas frame = new ListarCocinas();
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
	public ListarCocinas() {
		setTitle("Listado de cocinas");
		setBounds(100, 100, 526, 363);
		getContentPane().setLayout(null);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 11, 490, 276);
		getContentPane().add(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(164, 298, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(263, 298, 89, 23);
		getContentPane().add(btnListar);

	}

}
