package controller;
import java.util.ArrayList;

import modelo.dao.SenhaDao;
import modelo.dao.ServicoDao;
import modelo.entidade.Senha;
import modelo.entidade.Servico;
import view.Servicos;

    public class ServicoController {

        private Servico servico;    

        public void executa(Servicos servicos) {
            servico = new Servico();
            servico.setDescricao(servicos.getTxtDescricao().getText());
           
            ServicoDao servicoDao = new ServicoDao();
            servicoDao.salvar(servico);
  
        }
        public ArrayList<Servico> consultar() {
  	      
            ServicoDao sd= new ServicoDao();
    		return sd.consulta();
        }
    }

