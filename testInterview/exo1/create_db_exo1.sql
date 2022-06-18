CREATE SCHEMA `exo1` ;

CREATE TABLE `contrat` (
  `idcontrat` int NOT NULL,
  `date_signature` date DEFAULT NULL,
  `duree_contrat` int DEFAULT NULL,
  `salaire_annuel_brut` int DEFAULT NULL,
  `idpersonne` int DEFAULT NULL,
  PRIMARY KEY (`idcontrat`),
  KEY `idpersonne_idx` (`idpersonne`),
  CONSTRAINT `idpersonne` FOREIGN KEY (`idpersonne`) REFERENCES `personne` (`idpersonne`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `personne` (
  `idpersonne` int NOT NULL AUTO_INCREMENT,
  `nom_personne` varchar(45) DEFAULT NULL,
  `prenom_personne` varchar(45) DEFAULT NULL,
  `date_de_naissance_personne` date DEFAULT NULL,
  PRIMARY KEY (`idpersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `service` (
  `idservice` int NOT NULL,
  `nom_service` varchar(45) DEFAULT NULL,
  `idserviceparent` int DEFAULT NULL,
  PRIMARY KEY (`idservice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


