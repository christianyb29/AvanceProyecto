package cibertec;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultarCocina extends JInternalFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnCerrar;
	private JLabel lblModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarCocina frame = new ConsultarCocina();
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
	public ConsultarCocina() {
		setBounds(100, 100, 425, 193);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 58, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 61, 58, 14);
		getContentPane().add(lblAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 86, 58, 14);
		getContentPane().add(lblAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 109, 58, 14);
		getContentPane().add(lblFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 131, 68, 14);
		getContentPane().add(lblQuemadores);
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(114, 7, 123, 22);
		getContentPane().add(cboModelo);
		cboModelo.addItem("Mabe EMP6120PG0");
		cboModelo.addItem("Indurama Parma");
		cboModelo.addItem("Sole COSOL027");
		cboModelo.addItem("Mabe Coldex CX602");
		cboModelo.addItem("Reco Dakota");
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(114, 33, 123, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		txtPrecio.setEditable(false);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(114, 58, 123, 20);
		getContentPane().add(txtAncho);
		txtAncho.setEditable(false);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(114, 83, 123, 20);
		getContentPane().add(txtAlto);
		txtAlto.setEditable(false);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(114, 106, 123, 20);
		getContentPane().add(txtFondo);
		txtFondo.setEditable(false);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(114, 131, 123, 20);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setEditable(false);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(311, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
	}
	double precio0 = Datos.precio0;
	double fondo0 = Datos.fondo0;
	double ancho0 = Datos.ancho0;
	double alto0= Datos.alto0;
	int quemadores0 = Datos.quemadores0;
	String modelo0 = Datos.modelo0;
	
	double precio1 = Datos.precio1;
	double fondo1 = Datos.fondo1;
	double ancho1 = Datos.ancho1;
	double alto1= Datos.alto1;
	int quemadores1 = Datos.quemadores1;
	String modelo1 = Datos.modelo1;
	
	double precio2 = Datos.precio2;
	double fondo2 = Datos.fondo2;
	double ancho2 = Datos.ancho2;
	double alto2= Datos.alto2;
	int quemadores2 = Datos.quemadores2;
	String modelo2 = Datos.modelo2;
	
	double precio3 = Datos.precio3;
	double fondo3 = Datos.fondo3;
	double ancho3 = Datos.ancho3;
	double alto3= Datos.alto3;
	int quemadores3 = Datos.quemadores3;
	String modelo3 = Datos.modelo3;
	
	double precio4 = Datos.precio4;
	double fondo4 = Datos.fondo4;
	double ancho4 = Datos.ancho4;
	double alto4= Datos.alto4;
	int quemadores4 = Datos.quemadores4;
	String modelo4 = Datos.modelo4;
	
	int indice = cboModelo.getSelectedIndex();
	int precio = Integer.parseInt(txtPrecio.getText());
	int ancho = Integer.parseInt(txtAncho.getText());
	int alto = Integer.parseInt(txtAlto.getText());
	int fondo = Integer.parseInt(txtFondo.getText());
	int quemadores = Integer.parseInt(txtQuemadores.getText());	
	
	double iprecio;
	double ifondo;
	double iancho;
	double ialto;
	int iquemadores;
	{
	
	switch (indice) {
	case 0: iprecio = 949.0; break;
	case 1: iprecio = 1089.0; break;
	case 2: iprecio = 850.0; break;
	case 3: iprecio = 629.0; break;
	default: iprecio = 849.0; break;
	}
	
	switch (indice) {
	case 0: ifondo = 58.6; break;
	case 1: ifondo = 67.5; break;
	case 2: ifondo = 50.0; break;
	case 3: ifondo = 51.5; break;
	default: ifondo = 66.0; break;
	}
	
	switch (indice) {
	case 0: iancho = 60.0; break;
	case 1: iancho = 80.0; break;
	case 2: iancho = 60.0; break;
	case 3: iancho = 61.6; break;
	default: iancho = 75.4; break;
	}
	
	switch (indice) {
	case 0: ialto = 91.0; break;
	case 1: ialto = 94.0; break;
	case 2: ialto = 90.0; break;
	case 3: ialto = 95.0; break;
	default: ialto = 94.5; break;
	}
	
	switch (indice) {
	case 0: iquemadores = 4; break;
	case 1: iquemadores = 6; break;
	case 2: iquemadores = 4; break;
	case 3: iquemadores = 5; break;
	default: iquemadores = 5; break;
	}}}

	
	

