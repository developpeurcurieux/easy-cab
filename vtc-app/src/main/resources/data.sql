USE vtc;

INSERT INTO user
(type_profil, genre, nom, prenom, mdp, date_entree, date_naissance, email, telephone)
VALUES
('CLIENT', 'M', 'Dupont', 'Martin', '1234', '2017-09-23', '1985-04-21', 'martin-pro@gmail.com', '0605040302'),
('CLIENT', 'M', 'Smith', 'John', '9874', '2016-08-13', '1967-07-12', 'john.smith.work@yahoo.fr', '0606761232'),
('CLIENT', 'F', 'Camille', 'Cecile', 'test', '2015-05-09', '1990-06-23', 'cecile-ellen@gmail.com', '0677324587'),
('CLIENT', 'F', 'Salman', 'Emilie','essai', '2017-05-14', '1986-02-10', 'emilio@hotmail.fr','0708902332');

INSERT INTO chauffeur
(genre, nom, prenom, numero_carte_chauffeur, date_naissance, date_inscription, statut, email)
VALUES
('M', 'Cinco', 'Jose', '234CARTEPRO654', '1987-06-23', NOW(), 'active','vtcpro-jose@gmail.com'),
('M', 'Mir', 'Ali', '238CARTEPRO678', '1970-05-10', NOW(),'active','vtcpro-ali@gmail.com'),
('F', 'Da Silva', 'Cyntia','323CARTEPRO677', '1980-10-10', NOW(),'active', 'vtcpro-cyntia@gmail.com'),
('F', 'Simon', 'Nathalie', '387CARTEPRO778', '1991-03-12', NOW(), 'active', 'vtcpro-nathalie@gmail.com');




INSERT INTO adresse 
(numero, voie, complement, code_postal, ville, pays,statut, fk_client )
VALUES 
('12', 'Residence', 'de la martine', '76890', 'Ennery', 'France', 'active', 1),
('13', 'Voie', 'clos du roi', '95230', 'Herblay', 'France', 'active', 2),
('21', 'avenue', 'de charles de gaule', '92120', 'Clichy', 'France', 'active', 3),
('06', 'rue', 'hauts de pontoise', '76890', 'Ennery', 'France', 'active', 4);

INSERT INTO adresse 
(numero, voie, complement, code_postal, ville, pays,statut, fk_chauffeur)
VALUES 
('02', 'Clos', 'parc le notre', '95310', 'Saint Ouen laumône' , 'France', 'active', '234CARTEPRO654'),
('03', 'Voie', 'rue en laye', '78320', 'Conflants sainte honorine', 'France', 'active', '238CARTEPRO678'),
('01', 'avenue', 'de jean perrin', '92110', 'Asniers', 'France', 'active', '323CARTEPRO677'),
('16', 'rue', 'hauts de haussman', '75012', 'Paris', 'France', 'active', '387CARTEPRO778');






INSERT INTO prix (montant)
VALUES
(105.5),
(5),
(10);
