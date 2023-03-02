package interfaz;


import conversores.conversorBinario;
import conversores.conversorMonetario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pantalla extends JFrame {

	private JPanel contentPane;
	private JTextField monto2;
	private JTextField monto1;

	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 442, 273);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR BINARIO");
		lblNewLabel.setBounds(150, 11, 194, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introducir número");
		lblNewLabel_1.setBounds(43, 99, 143, 14);
		panel.add(lblNewLabel_1);
		
		monto2 = new JTextField();
		monto2.setBounds(262, 124, 143, 20);
		panel.add(monto2);
		monto2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"binario", "decimal"}));
		comboBox.setBounds(43, 153, 143, 20);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("CONVERTIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioP ini = new InicioP();
				ini.setVisible(false);
				String convertir = monto1.getText();
				
				
				conversorBinario binario = new conversorBinario();
				
				convertir.trim();
				convertir.replaceAll(" ", "");
				
				
				int bin = Integer.parseInt(convertir);
				
				String variable = comboBox.getSelectedItem().toString();
				
				
				if(variable == "binario") {
					
					binario.setBinario(bin);
					
					String resultadoTexto = String.valueOf(binario.getResultado());
					String resultadoFinal = binario.reverse(resultadoTexto);
					
					monto2.setText(resultadoFinal);
				}else if(variable == "decimal"){
					
					binario.setDecimal(convertir);
					
					String resultadoTexto = String.valueOf(binario.getDecimal());
					
					monto2.setText(resultadoTexto);
				}
				
			}
		});
		btnNewButton.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnNewButton.setBounds(60, 219, 117, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(265, 96, 117, 20);
		panel.add(lblNewLabel_2);
		
		monto1 = new JTextField();
		monto1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numeros = key >= 48 && key <= 57;
				
				if(!numeros) {
					e.consume();
				}
				
				if(monto1.getText().trim().length() == 10) {
					e.consume();
				}
			
			}
		});
		monto1.setBounds(43, 124, 137, 20);
		panel.add(monto1);
		monto1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioP ini = new InicioP();
				
				
				ini.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(291, 219, 91, 23);
		panel.add(btnNewButton_1);
		
		
		
	}
}
