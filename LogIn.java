import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtYut;
	private JTextField txtPassword;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(213, 15, 0, 0);
		table.setBackground(Color.GRAY);
		contentPane.add(table);
		
		txtYut = new JTextField();
		txtYut.setBounds(97, 95, 162, 28);
		txtYut.setText("Email");
		contentPane.add(txtYut);
		txtYut.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(97, 133, 162, 28);
		txtPassword.setText("Password");
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setBounds(97, 178, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setForeground(Color.BLACK);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(43, -22, 360, 358);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\department store.png"));
		contentPane.add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
