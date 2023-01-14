import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class DepartmentStoreInS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentStoreInS frame = new DepartmentStoreInS();
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
	public DepartmentStoreInS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Categories");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(25, 72, 113, 68);
		contentPane.add(btnNewButton);
		
		JButton btnShop = new JButton("Shop");
		btnShop.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnShop.setBounds(299, 72, 113, 68);
		contentPane.add(btnShop);
		
		JButton btnOrderedItems = new JButton("Ordered Items");
		btnOrderedItems.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnOrderedItems.setBounds(25, 162, 113, 68);
		contentPane.add(btnOrderedItems);
		
		JButton btnMenus = new JButton("Menus");
		btnMenus.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMenus.setBounds(166, 72, 113, 68);
		contentPane.add(btnMenus);
		
		JButton btnPurchasedItems = new JButton("Purchased Items");
		btnPurchasedItems.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPurchasedItems.setBounds(166, 162, 113, 68);
		contentPane.add(btnPurchasedItems);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSignOut.setBounds(299, 162, 113, 68);
		contentPane.add(btnSignOut);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(148, 240, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\department store.png"));
		lblNewLabel_1.setBounds(35, 0, 360, 300);
		contentPane.add(lblNewLabel_1);
	}

}
