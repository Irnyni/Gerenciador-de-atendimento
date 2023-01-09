package controller;

import modelo.entidade.Cargo;
import modelo.dao.CargoDao;
import view.Cargos;

    public class CargoController {

        private Cargo cargo;    

        public void executa(Cargos frame) {
            cargo = new Cargo();
            cargo.setDescricao(frame.getTxtDescricao().getText());
            cargo.setHierarquia(frame.getTxtHierarquia().getText());
            CargoDao cargoDao = new CargoDao();
            cargoDao.salvar(cargo);
  
        }
    }

