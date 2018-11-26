CREATE TABLE `cliente` (
	`ID` INT(11) NOT NULL AUTO_INCREMENT,
	`email` VARCHAR(50) NOT NULL,
	`password` VARCHAR(50) NOT NULL,
	`nome` INT(11) NOT NULL,
	`cognome` INT(11) NOT NULL,
	`provincia` VARCHAR(50) NOT NULL,
	`comune` VARCHAR(50) NOT NULL,
	`frazione` VARCHAR(50) NULL DEFAULT NULL,
	`indirizzo` VARCHAR(50) NOT NULL,
	`numero_telefono` INT(11) NULL DEFAULT NULL COMMENT 'opzionale',
	PRIMARY KEY (`ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
