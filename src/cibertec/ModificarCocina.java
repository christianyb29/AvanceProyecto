package cibertec;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ModificarCocina extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JComboBox cboModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarCocina frame = new ModificarCocina();
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
	public ModificarCocina() {
		setBounds(100, 100, 420, 200);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 15, 46, 14);
		getContentPane().add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(101, 11, 132, 22);
		getContentPane().add(cboModelo);
		cboModelo.addItem("Mabe EMP6120PG0");
		cboModelo.addItem("Indurama Parma");
		cboModelo.addItem("Sole COSOL027");
		cboModelo.addItem("Mabe Coldex CX602");
		cboModelo.addItem("Reco Dakota");
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 40, 58, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 65, 58, 14);
		getContentPane().add(lblAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 90, 58, 14);
		getContentPane().add(lblAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 115, 58, 14);
		getContentPane().add(lblFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 140, 68, 14);
		getContentPane().add(lblQuemadores);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(101, 37, 132, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(101, 62, 132, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(101, 87, 132, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(101, 112, 132, 20);
		getContentPane().add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(101, 137, 132, 20);
		getContentPane().add(txtQuemadores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(305, 11, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(305, 36, 89, 23);
		getContentPane().add(btnGrabar);

	}
	
{
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
	
	String Cocina;
	double jprecio;
	double jancho;
	double jalto;
	double jfondo;
	double jquemadores;
	
	Cocina = cboModelo.getSelectedItem().toString();
	jprecio= Integer.parseInt(txtPrecio.getText());
	jancho= Integer.parseInt(txtAncho.getText());
	jalto= Integer.parseInt(txtAlto.getText());
	jfondo= Integer.parseInt(txtFondo.getText());
	jquemadores= Integer.parseInt(txtQuemadores.getText());
	
}}






