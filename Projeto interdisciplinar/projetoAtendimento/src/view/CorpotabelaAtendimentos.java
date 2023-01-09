package view;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.AtendimentoController;
import controller.GuicheController;
import controller.SenhaController;
import modelo.entidade.Atendimento;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class CorpotabelaAtendimentos extends JPanel {
	private JTable table;


	public CorpotabelaAtendimentos() {
		setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 630, 458);
		add(scrollPane_1);	

		// As colunas da tabela
		String colunas[] = { "DESCRIÇÃO", "INICIO", "FIM", "DATA","CATEGORIA", "SERVIÇO","ATENDENTE","SENHA", "GUICHE","CLIENTE"};

		// Cria um DefaultTableModel para manipular os dados do JTable. Os par�metros s�o um array que identifica as colunas e um int que seta o n�mero inicial que linhas
		DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

		AtendimentoController AtendimentoController = new AtendimentoController();

		ArrayList<Atendimento> atendimentos = AtendimentoController.consultar();
		table = new JTable(5,atendimentos.size());
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setForeground(new Color(0, 0, 0));

		for(int i=0; i < atendimentos.size() ; i++) {
			// Insere os dados no DefaultTableModel
			String data = atendimentos.get(i).getData();
			String inicio = atendimentos.get(i).getInicio();
			String fim = atendimentos.get(i).getFinal();
			Integer categoria = atendimentos.get(i).getCategoria();
			Integer servico = atendimentos.get(i).getServico();
			Integer funcionario = atendimentos.get(i).getAtendente();
			Integer guiche = atendimentos.get(i).getGuiche();
			Integer cliente = atendimentos.get(i).getCliente();
			modelo.addRow(new String[]{atendimentos.get(i).getDescricao(),""+inicio,""+fim,""+data,""+categoria,""+servico,""+funcionario,atendimentos.get(i).getSenha(),""+guiche,""+cliente});   
		}
		// Associa o DefaultTableModel ao JTable
		table.setModel(modelo);		

		//table = new JTable(listaPessoas, getNameColumns());
		scrollPane_1.setViewportView(table);

	}
}
