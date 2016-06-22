--
-- MySQL 5.6.17
-- Wed, 15 Jul 2015 09:35:17 +0000
--

CREATE DATABASE `bd_ocp` DEFAULT CHARSET latin1;

USE `bd_ocp`;

CREATE TABLE `categorie` (
   `IDCATEGORIE` int(11) not null auto_increment,
   `NOMCATEGORIE` char(255),
   PRIMARY KEY (`IDCATEGORIE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=8;

INSERT INTO `categorie` (`IDCATEGORIE`, `NOMCATEGORIE`) VALUES 
('1', 'Poid lourd'),
('2', 'Poid leger'),
('3', 'Cat'),
('7', 'ayyy');

CREATE TABLE `division` (
   `IDDIVISION` int(11) not null auto_increment,
   `NOMDIVISION` char(255),
   PRIMARY KEY (`IDDIVISION`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=8;

INSERT INTO `division` (`IDDIVISION`, `NOMDIVISION`) VALUES 
('6', 'khbga'),
('7', 'ouedzem');

CREATE TABLE `lieu` (
   `IDLIEU` int(11) not null auto_increment,
   `IDDIVISION` int(11) not null,
   `NOMLIEU` char(255),
   `VILLE` char(255),
   PRIMARY KEY (`IDLIEU`),
   KEY `FK_GERER` (`IDDIVISION`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

-- [Table `lieu` is empty]

CREATE TABLE `marque` (
   `IDMARQUE` int(11) not null auto_increment,
   `NOMMARQUE` char(255),
   PRIMARY KEY (`IDMARQUE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=3;

INSERT INTO `marque` (`IDMARQUE`, `NOMMARQUE`) VALUES 
('1', 'renault'),
('2', 'mm');

CREATE TABLE `utilisateur` (
   `MATRICULEUSER` char(255) not null,
   `NOMUSER` char(255),
   `PRENOMUSER` char(255),
   `PASSWORD` char(255),
   `Shema` varchar(255),
   PRIMARY KEY (`MATRICULEUSER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `utilisateur` (`MATRICULEUSER`, `NOMUSER`, `PRENOMUSER`, `PASSWORD`, `Shema`) VALUES 
('ocp', 'Moustaid', 'AYOUB', 'ocp', 'S0S3S6S7');

CREATE TABLE `vehicule` (
   `MATRICULE` char(255) not null,
   `IDLIEU` int(11) not null,
   `IDCATEGORIE` int(11) not null,
   `IDMARQUE` int(11) not null,
   `KILOMETRAGE` int(11),
   `COULEUR` char(255),
   `DATEAJOUT` date,
   PRIMARY KEY (`MATRICULE`),
   KEY `FK_APPARTENIR` (`IDCATEGORIE`),
   KEY `FK_AVOIR` (`IDMARQUE`),
   KEY `FK_CONCERNER` (`IDLIEU`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- [Table `vehicule` is empty]