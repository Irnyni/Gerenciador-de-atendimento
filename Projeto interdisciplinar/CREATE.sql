-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS  mydb;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";
-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cargo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cargo` (
  `idCargo` INT NOT NULL auto_increment,
  `descricao` VARCHAR(45) NOT NULL,
  `hierarquia` varchar(3),
  PRIMARY KEY (`idCargo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Funcionario` (
  `idFuncionario` INT NOT NULL auto_increment,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `Cargo_idCargo` INT NOT NULL,
  PRIMARY KEY (`idFuncionario`),
  INDEX `fk_Funcionario_Cargo_idx` (`Cargo_idCargo` ASC) VISIBLE,
  CONSTRAINT `fk_Funcionario_Cargo`
    FOREIGN KEY (`Cargo_idCargo`)
    REFERENCES `mydb`.`Cargo` (`idCargo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Servico` (
  `idServico` INT NOT NULL auto_increment,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idServico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`HistoricoAtendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`HistoricoAtendimento` (
  `idHistoricoAtendimento` INT NOT NULL auto_increment,
  `data` DATETIME NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  `Servico_idServico` INT NOT NULL,
  `Funcionario_idFuncionario` INT NOT NULL,
  PRIMARY KEY (`idHistoricoAtendimento`),
  INDEX `fk_HistoricoAtendimento_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  INDEX `fk_HistoricoAtendimento_Servico1_idx` (`Servico_idServico` ASC) VISIBLE,
  INDEX `fk_HistoricoAtendimento_Funcionario1_idx` (`Funcionario_idFuncionario` ASC) VISIBLE,
  CONSTRAINT `fk_HistoricoAtendimento_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_HistoricoAtendimento_Servico1`
    FOREIGN KEY (`Servico_idServico`)
    REFERENCES `mydb`.`Servico` (`idServico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_HistoricoAtendimento_Funcionario1`
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `mydb`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Avaliacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Avaliacao` (
  `idAvaliacao` INT NOT NULL auto_increment,
  `nota` INT NOT NULL,
  `comentario` VARCHAR(45) NULL,
  `Funcionario_idFuncionario` INT NOT NULL,
  PRIMARY KEY (`idAvaliacao`),
  INDEX `fk_Avaliacao_Funcionario1_idx` (`Funcionario_idFuncionario` ASC) VISIBLE,
  CONSTRAINT `fk_Avaliacao_Funcionario1`
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `mydb`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Atendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Atendimento` (
  `idAtendimento` INT NOT NULL auto_increment,
  descricao varchar(50),
  `inicio` varchar(50) NULL,
  `fim` varchar(50) NULL,
  `data` varchar(50) NULL,
  `Servico_idServico` INT NOT NULL,
  `Funcionario_idFuncionario` INT NOT NULL,
  `Senha` varchar(50) NOT NULL,
  `CategoriaIdCategoria` INT NOT NULL,
  `GuicheIdGuiche` INT NOT NULL,
   `ClienteIdCliente` INT NOT NULL,
  
  
  PRIMARY KEY (`idAtendimento`),
  INDEX `fk_Atendimento_Servico1_idx` (`Servico_idServico` ASC) VISIBLE,
  INDEX `fk_Atendimento_Funcionario1_idx` (`Funcionario_idFuncionario` ASC) VISIBLE,
  INDEX `fk_Atendimento_Guiche_idx` (`GuicheIdGuiche` ASC) VISIBLE,
  INDEX `fk_Atendimento_Categoria_idx` (`CategoriaIdCategoria` ASC) VISIBLE,
  INDEX `fk_Atendimento_Cliente_idx` (`ClienteIdCliente` ASC) VISIBLE,
  
  CONSTRAINT `fk_Atendimento_Servico1`
    FOREIGN KEY (`Servico_idServico`)
    REFERENCES `mydb`.`Servico` (`idServico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_Atendimento_Guiche`
    FOREIGN KEY (`GuicheIdGuiche`)
    REFERENCES `mydb`.`Guiche` (`idGuiche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    
    CONSTRAINT `fk_Atendimento_Categoria`
    FOREIGN KEY (`CategoriaIdcategoria`)
    REFERENCES `mydb`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    
    CONSTRAINT `fk_Atendimento_Cliente`
    FOREIGN KEY (`ClienteIdCliente`)
    REFERENCES `mydb`.`Cliente` (`IdCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    
  CONSTRAINT `fk_Atendimento_Funcionario1`
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `mydb`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categoria` (
  `idCategoria` INT NOT NULL auto_increment,
  `descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Senha`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Senha` (
  `idsenha` INT NOT NULL auto_increment,
  `senha` VARCHAR(45) NOT NULL ,
  `Categoria_idCategoria` INT NOT NULL,
  `Servico_idServico` INT NOT NULL,
  `data` varchar(50)   NULL,
  PRIMARY KEY (`idsenha`),
  INDEX `fk_Senha_Categoria1_idx` (`Categoria_idCategoria` ASC) VISIBLE,
  INDEX `fk_Senha_Servico1_idx` (`Servico_idServico` ASC) VISIBLE,
  CONSTRAINT `fk_Senha_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria`)
    REFERENCES `mydb`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Senha_Servico1`
    FOREIGN KEY (`Servico_idServico`)
    REFERENCES `mydb`.`Servico` (`idServico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Guiche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Guiche` (
  `idGuiche` INT NOT NULL auto_increment,
  `descricao` VARCHAR(45) NULL,
  `Servico_idServico` INT ,
  `Categoria_idCategoria1` INT ,
  `Funcionario_idFuncionario` INT ,
  PRIMARY KEY (`idGuiche`),
  INDEX `fk_Guiche_Servico1_idx` (`Servico_idServico` ASC) VISIBLE,
  INDEX `fk_Guiche_Categoria1_idx` (`Categoria_idCategoria1` ASC) VISIBLE,
  INDEX `fk_Guiche_Funcionario1_idx` (`Funcionario_idFuncionario` ASC) VISIBLE,
  CONSTRAINT `fk_Guiche_Servico1`
    FOREIGN KEY (`Servico_idServico`)
    REFERENCES `mydb`.`Servico` (`idServico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Guiche_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria1`)
    REFERENCES `mydb`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Guiche_Funcionario1`
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `mydb`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

