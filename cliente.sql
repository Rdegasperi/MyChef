CREATE TABLE `cliente` (
	`ID` INT(11) NOT NULL AUTO_INCREMENT,
	`Username` VARCHAR(50) NULL DEFAULT NULL,
	`Contatti` VARCHAR(50) NULL DEFAULT NULL,
	`Provincia` VARCHAR(50) NULL DEFAULT NULL,
	`Comune` VARCHAR(50) NULL DEFAULT NULL,
	`Frazione` VARCHAR(50) NULL DEFAULT NULL,
	`Indirizzo` VARCHAR(50) NULL DEFAULT NULL,
	`Num_telefono` VARCHAR(50) NULL DEFAULT NULL COMMENT 'opzionale',
	PRIMARY KEY (`ID`)
)
ENGINE=InnoDB
;