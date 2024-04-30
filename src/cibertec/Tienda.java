package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmModificarCocina;
	private JMenuItem mntmListarCocinas;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReporte;
	private JMenu mnConfiguracin;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDeTienda;
	ConsultarCocina consultarCocina = new ConsultarCocina();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 478);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarCocina = new JMenuItem("Consultar Cocina");
		mntmConsultarCocina.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCocina);
		
		mntmModificarCocina = new JMenuItem("Modificar Cocina");
		mnMantenimiento.add(mntmModificarCocina);
		
		mntmListarCocinas = new JMenuItem("Listar Cocinas");
		mnMantenimiento.add(mntmListarCocinas);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmGenerarReporte = new JMenuItem("Generar Reporte");
		mnVentas.add(mntmGenerarReporte);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mnConfiguracin.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar Cantidad \u00D3ptima");
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mnConfiguracin.add(mntmConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 620, 406);
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane);
		desktopPane.setLayout(null);
		desktopPane.add(consultarCocina);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmConsultarCocina(e);
		}
	}
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		consultarCocina.setVisible(true);
	}
}
