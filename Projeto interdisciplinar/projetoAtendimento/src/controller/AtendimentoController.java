package controller;

import modelo.entidade.Atendimento;
import modelo.entidade.Avaliacao;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;

import java.util.ArrayList;

import modelo.dao.AtendimentoDao;
import modelo.dao.GuicheDao;
import modelo.dao.SenhaDao;
import view.Guiches;
import view.TelaAtendimento;
import view.TelaAtendimento2;


public class AtendimentoController {

    private Atendimento atendimento;    

    public void executa(Atendimento atendimento) {
    	

        AtendimentoDao atendimentoDao = new AtendimentoDao();
        atendimentoDao.salvar(atendimento);

    }
    
    public ArrayList<Atendimento> consultar() {
	      
        AtendimentoDao mon= new AtendimentoDao();
		return mon.consulta();
    }
}
