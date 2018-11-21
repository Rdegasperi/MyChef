CREATE TABLE `chef` (
	`ID` INT(11) NOT NULL AUTO_INCREMENT,
	`email` VARCHAR(50) NOT NULL,
	`password` VARCHAR(50) NOT NULL,
	`nome` VARCHAR(50) NOT NULL,
	`cognome` VARCHAR(50) NOT NULL,
	`provincia` VARCHAR(50) NOT NULL,
	`comune` VARCHAR(50) NOT NULL,
	`frazione` VARCHAR(50) NOT NULL COMMENT 'opzionale',
	`indirizzo` VARCHAR(50) NOT NULL COMMENT 'hidden to non registered',
	`numero_telefono` INT(11) NULL DEFAULT NULL COMMENT 'opzionale',
	`prezzo` INT(11) NULL DEFAULT NULL COMMENT 'in centesimi',
	PRIMARY KEY (`ID`)
)
COMMENT='dugongo'
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
