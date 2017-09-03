package semaine4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterFrame frame = new AlterFrame("",null,0,0);
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
	public AlterFrame(String champ, DefaultTableModel model, int row, int column) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChampAModifier = new JLabel("champ a modifier:");
		lblChampAModifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblChampAModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChampAModifier.setBounds(66, 78, 137, 16);
		contentPane.add(lblChampAModifier);
		
		nameField = new JTextField(champ);
		nameField.setColumns(10);
		nameField.setBounds(223, 76, 116, 22);
		contentPane.add(nameField);
		
		JLabel lblModifierUnProduit = new JLabel("Modifier un produit");
		lblModifierUnProduit.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierUnProduit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModifierUnProduit.setBounds(114, 13, 192, 22);
		contentPane.add(lblModifierUnProduit);
		
		JButton btnModifierLeChamp = new JButton("Modifier le champ");
		btnModifierLeChamp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setValueAt(nameField.getText(), row, column);
				setVisible(false);
			}
		});
		btnModifierLeChamp.setBounds(114, 136, 192, 25);
		contentPane.add(btnModifierLeChamp);
	}

}
