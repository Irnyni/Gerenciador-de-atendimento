package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CargoController;

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
import javax.swing.JLayeredPane;

public class Cargos extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtHierarquia;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cargos frame = new Cargos();
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
	
	
	
	
	public Cargos() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 550, 500);
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
		lblDescricao.setBounds(28, 174, 123, 36);
		contentPane.add(lblDescricao);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);
		
		txtDescricao = new JTextField();
		txtDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtDescricao.setBounds(214, 180, 292, 32);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblServico = new JLabel("HIERARQUIA");
		lblServico.setForeground(new Color(255, 255, 255));
		lblServico.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblServico.setBounds(28, 270, 163, 21);
		contentPane.add(lblServico);
		
		txtHierarquia = new JTextField();
		txtHierarquia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtHierarquia.setBounds(214, 268, 292, 32);
		contentPane.add(txtHierarquia);
		txtHierarquia.setColumns(10);
		
		JButton btnSalvar = new JButton("CRIAR CARGO");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CargoController controller = new CargoController();
		         controller.executa(Cargos.this);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(164, 383, 197, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblInserirGuich = new JLabel("INSERIR CARGO");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(149, 11, 277, 60);
		contentPane.add(lblInserirGuich);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(252, 192, 1, 1);
		contentPane.add(layeredPane);
	}

	public JTextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtTitulo(JTextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public JTextField getTxtHierarquia() {
		return txtHierarquia;
	}

	public void setTxtHierarquia(JTextField txtHierarquia) {
		this.txtHierarquia = txtHierarquia;
	}

	
}
