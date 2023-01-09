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

public class TabelaAtendimentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaAtendimentos frame = new TabelaAtendimentos();
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
	public TabelaAtendimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 10));
		tabbedPane.setForeground(new Color(0, 0, 0));
		CorpotabelaServicos cs = new CorpotabelaServicos();
		cs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cs.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
		cs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cs.setForeground(new Color(0, 0, 0));
		tabbedPane.addTab("Atendimentos", cs);
		CorpotabelaAtendimentos mostraAtendimento = new CorpotabelaAtendimentos();
		mostraAtendimento.setBackground(new Color(240, 240, 240));
		mostraAtendimento.setForeground(new Color(255, 255, 255));
		tabbedPane.addTab("Atendimentos",
				mostraAtendimento);
		mostraAtendimento.setLayout(null);
		
		/*****/
		setContentPane(contentPane);
		
	}

}
