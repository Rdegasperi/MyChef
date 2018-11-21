CREATE TABLE `ingrediente` (
	`Id` String(11) NOT NULL AUTO_INCREMENT,
	`categoria` String(50) NOT NULL DEFAULT '0',
	`quantità` String(11) NOT NULL DEFAULT '0',
	`nome` String(50) NOT NULL DEFAULT '0',
	PRIMARY KEY (`Id`)
)
ENGINE=InnoDB
;