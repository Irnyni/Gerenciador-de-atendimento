package view;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.GuicheController;
import controller.SenhaController;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class CorpotabelaGuiches extends JPanel {
	private JTable table;


	public CorpotabelaGuiches() {
		setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 630, 458);
		add(scrollPane_1);	

		// As colunas da tabela
		String colunas[] = { "ID", "DESCRIÇÃO", "CATEGORIA", "SERVIÇO", "FUNCIONÁRIO"};

		// Cria um DefaultTableModel para manipular os dados do JTable. Os par�metros s�o um array que identifica as colunas e um int que seta o n�mero inicial que linhas
		DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

		GuicheController guicheController = new GuicheController();

		ArrayList<Guiche> guiches = guicheController.consultar();
		table = new JTable(5,guiches.size());
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setForeground(new Color(0, 0, 0));

		for(int i=0; i < guiches.size() ; i++) {
			// Insere os dados no DefaultTableModel
			//			Integer ano = senhas.get(i).getAno();
			Integer id=guiches.get(i).getId();
			Integer categoria = guiches.get(i).getCategoria();
			Integer servico = guiches.get(i).getServico();
			Integer funcionario = guiches.get(i).getFuncionario();
			System.out.println(guiches.get(i).getId() + guiches.get(i).getCategoria() + guiches.get(i).getServico());
			modelo.addRow(new String[]{""+id,guiches.get(i).getDescricao(),""+categoria,""+servico,""+funcionario});   
		}
		// Associa o DefaultTableModel ao JTable
		table.setModel(modelo);		

		//table = new JTable(listaPessoas, getNameColumns());
		scrollPane_1.setViewportView(table);

	}
}
