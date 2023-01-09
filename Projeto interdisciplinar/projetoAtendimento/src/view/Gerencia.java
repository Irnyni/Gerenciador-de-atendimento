package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GuicheController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import java.awt.Canvas;
import javax.swing.border.EtchedBorder;
import java.awt.Window.Type;

public class Gerencia extends JFrame {

	private JPanel contentPane;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerencia frame = new Gerencia();
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
	
	
	
	
	public Gerencia() {
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnServicos = new JButton("SERVI\u00C7OS");
		btnServicos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnServicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerenciaServico frame = new GerenciaServico();
				dispose();
				frame.setVisible(true);
			}
		});
		btnServicos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnServicos.setBounds(60, 101, 398, 46);
		contentPane.add(btnServicos);
		
		JLabel lblInserirGuich = new JLabel("GERENCIA");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(181, 11, 277, 60);
		contentPane.add(lblInserirGuich);
		
		JButton btnGuiches = new JButton("GUICH\u00CAS");
		btnGuiches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerenciaGuiches frame = new GerenciaGuiches();
				dispose();
				frame.setVisible(true);
			}
		});
		btnGuiches.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuiches.setBounds(60, 184, 398, 46);
		contentPane.add(btnGuiches);
		
		JButton btnAtendimentos = new JButton("ATENDIMENTOS");
		btnAtendimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerenciaAtendimentos frame = new GerenciaAtendimentos();
				dispose();
				frame.setVisible(true);
			}
		});
		btnAtendimentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtendimentos.setBounds(60, 273, 398, 46);
		contentPane.add(btnAtendimentos);
		
		JButton btnsENHAS = new JButton("SENHAS");
		btnsENHAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerenciaSenhas frame = new GerenciaSenhas();
				dispose();
				frame.setVisible(true);
			}
		});
		btnsENHAS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnsENHAS.setBounds(60, 353, 398, 46);
		contentPane.add(btnsENHAS);
	}
}