-- Insert data into the 'saison' table
INSERT INTO saison (id_saison, details, debut, fin) VALUES
  ('SAISON_2023', 'Regular Season', '2023-01-01', '2023-12-31'),
  ('SAISON_2023_playoffs', 'Playoffs', '2023-04-01', '2023-06-01');

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
INSERT INTO equipe_joueur (id_equipe_joueur, id_equipe, id_joueur, dossart) VALUES
  (1, 'EQUIPE_LAL', 'JOUEUR_1', '23'),
  (2, 'EQUIPE_GSW', 'JOUEUR_2', '30'),
  (3, 'EQUIPE_BKN', 'JOUEUR_3', '7');

-- Insert data into the 'match' table
INSERT INTO match (id_match, id_equipe1, id_equipe2, point_equipe1, point_equipe2) VALUES
  ('MATCH_1', 'EQUIPE_LAL', 'EQUIPE_GSW', 105, 110),
  ('MATCH_2', 'EQUIPE_BKN', 'EQUIPE_LAL', 98, 102),
  ('MATCH_3', 'EQUIPE_GSW', 'EQUIPE_BKN', 115, 112);

-- Insert data into the 'feuille_match' table
INSERT INTO feuille_match (id_feuille_match, id_match, id_equipe_joueur) VALUES
  (1, 'MATCH_1', 'EQUIPE_LAL'),
  (2, 'MATCH_1', 'EQUIPE_GSW'),
  (3, 'MATCH_2', 'EQUIPE_BKN'),
  (4, 'MATCH_3', 'EQUIPE_LAL'),
  (5, 'MATCH_3', 'EQUIPE_GSW');

-- Insert data into the 'action' table
INSERT INTO action (id_action, nom, valeur) VALUES
  ('ACTION_1', 'Three-Pointer', 3),
  ('ACTION_2', 'Free Throw', 1),
  ('ACTION_3', 'Dunk', 2);

-- Insert data into the 'action_match' table
INSERT INTO action_match (id_action, id_equipe_joueur, id_action, date_action, valeur) VALUES
  (1, 'EQUIPE_LAL', 'ACTION_1', '2023-01-05', 1),
  (2, 'EQUIPE_GSW', 'ACTION_2', '2023-01-05', 1),
  (3, 'EQUIPE_BKN', 'ACTION_3', '2023-01-10', 1),
  (4, 'EQUIPE_LAL', 'ACTION_1', '2023-01-10', 1),
  (5, 'EQUIPE_GSW', 'ACTION_2', '2023-01-15', 1);
