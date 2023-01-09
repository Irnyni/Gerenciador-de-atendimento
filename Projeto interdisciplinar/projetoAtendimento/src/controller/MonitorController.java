package controller;


import modelo.entidade.Guiche;
import modelo.entidade.Senha;

import java.util.ArrayList;

import modelo.dao.GuicheDao;
import modelo.dao.MonitorDao;
import modelo.dao.SenhaDao;
import view.Monitor;
import view.Senhas;

public class MonitorController {
	
	public ArrayList<Senha> consultar() {
      
        SenhaDao mon= new SenhaDao();
		return mon.consulta();
    }

}