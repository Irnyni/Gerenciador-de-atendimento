package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GuicheController;
import controller.SenhaController;
import modelo.entidade.Senha;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class TelaAtendimento extends JFrame {

	private JPanel contentPane;
	private static int cont;
	private static int guiches;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtendimento frame = new TelaAtendimento();
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


	public static void passaDados(int guiche, int conti) {
		guiches=guiche;
		cont=conti;
		System.out.println("Essa e o numero do guiche  em tela 1: "+ guiches);
	}

	public static int getGuiches() {
		return guiches;
	}

	public static void setGuiches(int guiches) {
		TelaAtendimento.guiches = guiches;
	}

	public TelaAtendimento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(500, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JButton btnSalvar = new JButton("CHAMAR PRÓXIMA SENHA");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtendimento2 frame = new TelaAtendimento2();
				SenhaController sc = new SenhaController();
				
				Senha senhas = sc.ultimaSenha(cont);
				cont = cont+1;
				Calendar calendar = new GregorianCalendar();
				Timestamp ts=new Timestamp(System.currentTimeMillis());  
				Date date=new Date(ts.getTime());  
				String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
				// if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
					System.exit(0);
				String a;

				a=""+calendar.getTime();
				System.out.println(a);
				System.out.println("senhas em tela 2 de atendimento: "+ senhas);

				TelaAtendimento2.passaDados(senhas,a, guiches,cont);
				Monitor m = new Monitor();
				String sh = senhas.getSenha();

				System.out.println("senhas enviada ao monitor"+senhas.getSenha());
				frame.setVisible(true);
				dispose();
	            m.dispose();
				m.setVisible(true);
				m.passaDados(sh,cont,guiches);
				
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		btnSalvar.setBounds(10, 203, 516, 104);
		contentPane.add(btnSalvar);

		JLabel lblInserirGuich = new JLabel("ATENDIMENTO");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 49));
		lblInserirGuich.setBounds(72, 11, 401, 60);
		contentPane.add(lblInserirGuich);
	}
}
