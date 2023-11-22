INSERT INTO action (id_action, nom, valeur) VALUES
('A001', '1Points', 1),
('A002', '2Points', 2),
('A003', '3Points', 3),
('A004', 'Passe', 0),
('A005', 'Faute', 0),
('A006', 'Entree', 0),
('A007', 'Tir', 0);

insert into saison(id_saison, details, debut, fin) values
('SAISON_2024', 'Simple Season', '2023-01-01', '2023-12-31');

insert into joueur(id_joueur, nom, prenom, date_naissance) values
('JOUEUR_1', 'James', 'LeBron', '1984-12-30'),
('JOUEUR_2', 'Curry', 'Stephen', '1988-03-14'),
('JOUEUR_3', 'Durant', 'Kevin', '1988-09-29');

INSERT INTO equipe (id_equipe, nom, ville, pays, date_creation) VALUES
('EQUIPE_LAL', 'Los Angeles Lakers', 'Los Angeles', 'USA', '1946-01-01'),
('EQUIPE_GSW', 'Golden State Warriors', 'San Francisco', 'USA', '1946-01-01');

INSERT INTO equipe_joueur (id_equipe_joueur, id_equipe, id_joueur, dossart, id_saison) VALUES
('JOUEUR_1_EQUIPE_LAL', 'EQUIPE_LAL', 'JOUEUR_1', '23','SAISON_2024'),
('JOUEUR_2_EQUIPE_GSW', 'EQUIPE_GSW', 'JOUEUR_2', '30','SAISON_2024'),
('JOUEUR_3_EQUIPE_GSW', 'EQUIPE_GSW', 'JOUEUR_3', '7','SAISON_2024');

insert into feuille_match(id_feuille_match, id_match, id_equipe_joueur) values
(1, 11, 'JOUEUR_1_EQUIPE_LAL'),
(2, 11, 'JOUEUR_2_EQUIPE_GSW'),
(3, 11, 'JOUEUR_3_EQUIPE_GSW');

INSERT INTO action_match (id_action_match, id_equipe_joueur, id_action, date_action, valeur, id_match) VALUES
  (1, 1, 'ACTION_1', '2023-01-05', 1, 'MATCH_1'),
  (2, 2, 'ACTION_2', '2023-01-05', 1, 'MATCH_1'),
  (3, 3, 'ACTION_3', '2023-01-10', 1, 'MATCH_2'),
  (4, 1, 'ACTION_1', '2023-01-10', 1, 'MATCH_2'),
  (5, 2, 'ACTION_2', '2023-01-15', 1, 'MATCH_3');
