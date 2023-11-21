-- Insert data into the 'saison' table
INSERT INTO saison (id_saison, details, debut, fin) VALUES
  ('SAISON_2023', 'Regular Season', '2023-01-01', '2023-12-31');

-- Insert data into the 'joueur' table
INSERT INTO joueur (id_joueur, nom, prenom, date_naissance) VALUES
  ('JOUEUR_1', 'James', 'LeBron', '1984-12-30'),
  ('JOUEUR_2', 'Curry', 'Stephen', '1988-03-14'),
  ('JOUEUR_3', 'Durant', 'Kevin', '1988-09-29');

-- Insert data into the 'equipe' table
INSERT INTO equipe (id_equipe, nom, ville, pays, date_creation) VALUES
  ('EQUIPE_LAL', 'Los Angeles Lakers', 'Los Angeles', 'USA', '1946-01-01'),
  ('EQUIPE_GSW', 'Golden State Warriors', 'San Francisco', 'USA', '1946-01-01'),
  ('EQUIPE_BKN', 'Brooklyn Nets', 'Brooklyn', 'USA', '1967-01-01');

-- Insert data into the 'equipe_joueur' table
INSERT INTO equipe_joueur (id_equipe_joueur, id_equipe, id_joueur, dossart, id_saison) VALUES
  (1, 'EQUIPE_LAL', 'JOUEUR_1', '23','SAISON_2023'),
  (2, 'EQUIPE_GSW', 'JOUEUR_2', '30','SAISON_2023'),
  (3, 'EQUIPE_BKN', 'JOUEUR_3', '7','SAISON_2023');

-- Insert data into the 'match' table
INSERT INTO match (id_match, id_equipe1, id_equipe2, point_equipe1, point_equipe2) VALUES
  ('MATCH_1', 'EQUIPE_LAL', 'EQUIPE_GSW', 105, 110),
  ('MATCH_2', 'EQUIPE_BKN', 'EQUIPE_LAL', 98, 102),
  ('MATCH_3', 'EQUIPE_GSW', 'EQUIPE_BKN', 115, 112);

-- Insert data into the 'feuille_match' table
INSERT INTO feuille_match (id_feuille_match, id_match, id_equipe_joueur) VALUES
  (1, 'MATCH_1', 1),
  (2, 'MATCH_1', 2),
  (3, 'MATCH_2', 3),
  (4, 'MATCH_3', 1),
  (5, 'MATCH_3', 2);

-- Insert data into the 'action' table
INSERT INTO action (id_action, nom, valeur) VALUES
  ('ACTION_1', 'Three-Pointer', 3),
  ('ACTION_2', 'Free Throw', 1),
  ('ACTION_3', 'Dunk', 2);

-- Insert data into the 'action_match' table
INSERT INTO action_match (id_action_match, id_equipe_joueur, id_action, date_action, valeur, id_match) VALUES
  (1, 1, 'ACTION_1', '2023-01-05', 1, 'MATCH_1'),
  (2, 2, 'ACTION_2', '2023-01-05', 1, 'MATCH_1'),
  (3, 3, 'ACTION_3', '2023-01-10', 1, 'MATCH_2'),
  (4, 1, 'ACTION_1', '2023-01-10', 1, 'MATCH_2'),
  (5, 2, 'ACTION_2', '2023-01-15', 1, 'MATCH_3');
