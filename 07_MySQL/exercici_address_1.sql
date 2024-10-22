SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`country` (
  `country_id` SMALLINT NOT NULL,
  `country` VARCHAR(50) NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`country_id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`city` (
  `city_id` SMALLINT NOT NULL,
  `city` VARCHAR(50) NULL,
  `country_id` SMALLINT NOT NULL, -- Relación clara con country
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`city_id`),
  INDEX `fk_city_country_idx` (`country_id` ASC), -- Índice en la clave foránea
  CONSTRAINT `fk_city_country`
    FOREIGN KEY (`country_id`) -- Relación con la tabla country
    REFERENCES `mydb`.`country` (`country_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`address` (
  `address_id` INT NOT NULL,
  `address` VARCHAR(50) NULL,
  `address2` VARCHAR(50) NULL,
  `district` VARCHAR(20) NULL, -- corregido disctrit a district
  `city_id` SMALLINT NOT NULL, -- Relación clara con city
  `postal_code` VARCHAR(10) NULL,
  `phone` VARCHAR(20) NULL,
  `location` VARCHAR(20) NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`address_id`),
  INDEX `fk_address_city_idx` (`city_id` ASC), -- Índice en la clave foránea
  CONSTRAINT `fk_address_city`
    FOREIGN KEY (`city_id`) -- Relación con la tabla city
    REFERENCES `mydb`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- Restaurar las configuraciones anteriores
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
