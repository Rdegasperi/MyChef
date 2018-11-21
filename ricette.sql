CREATE TABLE `ricette` (
	`ID` INT(11) NOT NULL AUTO_INCREMENT,
	`nome_ricetta` VARCHAR(50) NOT NULL,
	`ingredienti` MEDIUMTEXT NOT NULL,
	`tempo_preparazione` TIME NOT NULL,
	PRIMARY KEY (`ID`)
)
COMMENT='dugongo\r\n'
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
