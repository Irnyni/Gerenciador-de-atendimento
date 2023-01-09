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

public class Guiches extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtServico;
	private JTextField txtCategoria;
	private JTextField txtFuncionario;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guiches frame = new Guiches();
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
	
	
	
	
	public Guiches() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescricao = new JLabel("DESCRI\u00C7\u00C3O");
		lblDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblDescricao.setForeground(new Color(255, 255, 255));
		lblDescricao.setBackground(new Color(255, 255, 255));
		lblDescricao.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDescricao.setBounds(28, 83, 123, 36);
		contentPane.add(lblDescricao);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);
		
		txtDescricao = new JTextField();
		txtDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtDescricao.setBounds(214, 89, 292, 32);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblServico = new JLabel("SERVI\u00C7O");
		lblServico.setForeground(new Color(255, 255, 255));
		lblServico.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblServico.setBounds(28, 165, 110, 21);
		contentPane.add(lblServico);
		
		txtServico = new JTextField();
		txtServico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtServico.setBounds(214, 163, 292, 32);
		contentPane.add(txtServico);
		txtServico.setColumns(10);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setForeground(new Color(255, 255, 255));
		lblCategoria.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblCategoria.setBounds(28, 228, 121, 26);
		contentPane.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtCategoria.setBounds(214, 229, 292, 32);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JLabel lblFuncionario = new JLabel("FUNCION\u00C1RIO");
		lblFuncionario.setForeground(new Color(255, 255, 255));
		lblFuncionario.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblFuncionario.setBounds(28, 314, 163, 17);
		contentPane.add(lblFuncionario);
		
		txtFuncionario = new JTextField();
		txtFuncionario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtFuncionario.setBounds(214, 313, 292, 26);
		contentPane.add(txtFuncionario);
		txtFuncionario.setColumns(10);
		
		JButton btnSalvar = new JButton("CRIAR GUICHE");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 GuicheController controller = new GuicheController();
		         controller.executa(Guiches.this);
		         Gerencia g = new Gerencia();
		         dispose();
		         g.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(181, 381, 197, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblInserirGuich = new JLabel("INSERIR GUICH\u00CA");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(149, 11, 277, 60);
		contentPane.add(lblInserirGuich);
	}

	public JTextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtTitulo(JTextField txtTitulo) {
		this.txtDescricao = txtTitulo;
	}

	public JTextField getTxtServico() {
		return txtServico;
	}

	public void setTxtServico(JTextField txtServico) {
		this.txtServico = txtServico;
	}

	public JTextField getTxtCategoria() {
		return txtCategoria;
	}

	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}

	public JTextField getTxtFuncionario() {
		return txtFuncionario;
	}

	public void setTxtFuncionario(JTextField txtFuncionario) {
		this.txtFuncionario = txtFuncionario;
	}
}
