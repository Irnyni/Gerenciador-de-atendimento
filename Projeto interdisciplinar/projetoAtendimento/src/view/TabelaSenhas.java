package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class TabelaSenhas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaSenhas frame = new TabelaSenhas();
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
	public TabelaSenhas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 10));
		tabbedPane.setForeground(new Color(0, 0, 0));
		CorpotabelaSenhas tb = new CorpotabelaSenhas();
		tb .setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tb .setFont(new Font("Comic Sans MS", Font.BOLD, 10));
		tb .setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tb .setForeground(new Color(0, 0, 0));
		tabbedPane.addTab("SENHAS", tb );
		CorpotabelaSenhas mostraSenhas = new CorpotabelaSenhas();
		mostraSenhas.setBackground(new Color(240, 240, 240));
		mostraSenhas.setForeground(new Color(255, 255, 255));
		tabbedPane.addTab("SENHAS",
		mostraSenhas);
		mostraSenhas.setLayout(null);
		
		/*****/
		setContentPane(contentPane);
		
	}

}
