-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db100
-- -----------------------------------------------------
DROP DATABASE IF EXISTS `db100`;
-- -----------------------------------------------------
-- Schema db100
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db100` DEFAULT CHARACTER SET utf8 ;
USE `db100` ;
-- -----------------------------------------------------
-- Table `db100`.`board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db100`.`board` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `contents` VARCHAR(45) NULL,
   `wdate` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`no`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

insert into board(title,contents) values('title1','contents1');
insert into board(title,contents) values('title2','contents2');
insert into board(title,contents) values('title3','contents3');
insert into board(title,contents) values('title4','contents4');
insert into board(title,contents) values('title5','contents5');
insert into board(title,contents) values('title6','contents6');
insert into board(title,contents) values('title7','contents7');
insert into board(title,contents) values('title8','contents8');
insert into board(title,contents) values('title9','contents9');
insert into board(title,contents) values('title10','contents10');
insert into board(title,contents) values('title11','contents11');
insert into board(title,contents) values('title12','contents12');