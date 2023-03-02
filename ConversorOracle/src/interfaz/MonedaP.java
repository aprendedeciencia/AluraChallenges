package interfaz;

import java.awt.EventQueue;
import conversores.conversorMonetario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class MonedaP extends JFrame {

	private JPanel contentPane;
	private JTextField monto;
	private JTextField convertido;
	

	/**
	 * Create the frame.
	 */
	public MonedaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 442, 273);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR MONEDA");
		lblNewLabel.setBounds(139, 11, 162, 33);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Moneda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(52, 103, 94, 15);
		panel.add(lblNewLabel_1);
		
		monto = new JTextField();
		monto.setBounds(52, 119, 126, 20);
		panel.add(monto);
		monto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Conversión");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(266, 103, 94, 15);
		panel.add(lblNewLabel_2);
		
		convertido = new JTextField();
		convertido.setBounds(265, 119, 126, 20);
		panel.add(convertido);
		convertido.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peso Colombiano", "Dolar", "Euros", "Libras Esterlinas", "Yen Japones", "Won sur-coreano"}));
		comboBox.setBounds(52, 150, 126, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euros", "Libras Esterlinas", "Yen Japones", "Won sur-coreano", "Peso Colombiano"}));
		comboBox_1.setBounds(264, 150, 127, 21);
		panel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InicioP ini = new InicioP();
				ini.setVisible(false);
				
				
				String moneda = comboBox.getSelectedItem().toString();
				String cambio = comboBox_1.getSelectedItem().toString();
				double mon = Double.parseDouble(monto.getText());
								
				conversorMonetario conv = new conversorMonetario();
				
				conv.setCambio(moneda, cambio);
				
				conv.setTasa(mon);
				
				String resultado = String.valueOf(conv.getResultado());
				
				convertido.setText(resultado);
	
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(64, 220, 94, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.setBackground(new Color(173, 216, 230));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioP ini = new InicioP();
				
				ini.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(278, 220, 94, 23);
		panel.add(btnNewButton_1);
	}
}
