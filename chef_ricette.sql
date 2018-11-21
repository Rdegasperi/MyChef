CREATE TABLE `chef_ricette` (
	`chef_id` INT(11) NOT NULL,
	`ricette_id` INT(11) NOT NULL,
	PRIMARY KEY (`chef_id`, `ricette_id`),
	INDEX `FK_chef_ricette_ricette` (`ricette_id`),
	CONSTRAINT `FK_chef_ricette_chef` FOREIGN KEY (`chef_id`) REFERENCES `chef` (`ID`),
	CONSTRAINT `FK_chef_ricette_ricette` FOREIGN KEY (`ricette_id`) REFERENCES `ricette` (`ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
