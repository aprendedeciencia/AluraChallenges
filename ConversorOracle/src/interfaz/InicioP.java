package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class InicioP extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public InicioP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 442, 273);
		contentPane.add(panel);
		panel.setLayout(null);
			
		
		JButton btnNewButton = new JButton("Conversor Monetario");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.setBounds(22, 207, 169, 32);
		btnNewButton.setBackground(new Color(51, 204, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MonedaP mone = new MonedaP();
				
				mone.setVisible(true);
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Conversor Binario/decimal");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_1.setBounds(235, 207, 169, 32);
		btnNewButton_1.setBackground(new Color(51, 204, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla pan = new Pantalla();
				
				pan.setVisible(true);
				
				
			}
		});
		panel.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(22, 25, 169, 214);
		ImageIcon image = new ImageIcon("src/imagenes/64650.jpg");
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(icon);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(235, 25, 169, 214);
		ImageIcon image2 = new ImageIcon("src/imagenes/2002.i513.042_cyber_attack_security_set_isometric-14.jpg");
		Icon icon2 = new ImageIcon(image2.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(icon2);
		panel.add(lblNewLabel_1);
	}
}
