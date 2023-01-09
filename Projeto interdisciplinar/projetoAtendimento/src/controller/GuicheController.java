package controller;

import modelo.entidade.Guiche;
import java.util.ArrayList;

import modelo.dao.GuicheDao;
import view.Guiches;

    public class GuicheController {

        private Guiche guiche;    

        public void executa(Guiches frame) {
            guiche = new Guiche();
            guiche.setDescricao(frame.getTxtDescricao().getText());
            guiche.setCategoria((Integer.parseInt(frame.getTxtCategoria().getText())));
            guiche.setServico((Integer.parseInt(frame.getTxtServico().getText())));
            guiche.setFuncionario((Integer.parseInt(frame.getTxtFuncionario().getText())));
            GuicheDao guicheDao = new GuicheDao();
            guicheDao.salvar(guiche);
  
        }
        public ArrayList<Guiche> consultar() {
  	      
            GuicheDao mon= new GuicheDao();
    		return mon.consulta();
        }
        
        public Guiche consultaEspecifica(int numguiche) {
        	  GuicheDao guicheDao = new GuicheDao();
              guiche=guicheDao.pesquisa(numguiche);
        	
			return guiche;
        	
        	
        	
        	
        }
    }

