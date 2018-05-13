CREATE TABLE `Statemaster` (
	`stateid` int(10) NOT NULL AUTO_INCREMENT,
	`statename` varchar(20) NOT NULL,
	PRIMARY KEY (`stateid`)
);



CREATE TABLE `Citymaster` (
	`cityid` int(10) NOT NULL AUTO_INCREMENT,
	`cityname` varchar(20) NOT NULL,
	`stateid` int(10) NOT NULL,
	PRIMARY KEY (`cityid`)
);



CREATE TABLE `Locationmaster` (
	`locid` int(10) NOT NULL AUTO_INCREMENT,
	`locname` varchar(20) NOT NULL,
	`loc_add` varchar(25) NOT NULL,
	`cityid` int(10) NOT NULL,
	`airportid` int(10) NOT NULL,
	PRIMARY KEY (`locid`)
);



CREATE TABLE `Airportmaster` (
	`airportid` int(10) NOT NULL AUTO_INCREMENT,
	`airportname` varchar(20) NOT NULL,
	PRIMARY KEY (`airportid`)
);



ALTER TABLE `Citymaster` ADD CONSTRAINT `Citymaster_fk0` FOREIGN KEY (`stateid`) REFERENCES `Statemaster`(`stateid`);



ALTER TABLE `Locationmaster` ADD CONSTRAINT `Locationmaster_fk0` FOREIGN KEY (`cityid`) REFERENCES `Citymaster`(`cityid`);



ALTER TABLE `Locationmaster` ADD CONSTRAINT `Locationmaster_fk1` FOREIGN KEY (`airportid`) REFERENCES `Airportmaster`(`airportid`);

