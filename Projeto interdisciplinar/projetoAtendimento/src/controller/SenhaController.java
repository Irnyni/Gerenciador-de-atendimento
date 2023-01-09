package controller;

import modelo.entidade.Senha;

import java.util.ArrayList;

import modelo.dao.SenhaDao;
import view.Guiches;
import view.Senhas;

    public class SenhaController {

        private Senha senha;    

        public void executa(Senha senha) {
        	SenhaDao s = new SenhaDao();
            s.salvar(senha);
  
        }
    	public ArrayList<Senha> consultar() {
    	      
            SenhaDao mon= new SenhaDao();
    		return mon.consulta();
        }
    	public Senha ultimaSenha(int cont) {
  	      
            SenhaDao mon= new SenhaDao();
    		return mon.ultimaSenha(cont);
        }
    }
