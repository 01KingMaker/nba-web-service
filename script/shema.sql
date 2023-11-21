create database nba;
\c nba

create sequence seq_saison;

create table if not exists saison
(
    id_saison varchar(20) primary key,
    details varchar(250),
    debut timestamp,
    fin timestamp
);

create sequence seq_joueur;

--drop table joueur;
create table if not exists joueur(
    id_joueur varchar(20) primary key,
    nom varchar(50),
    prenom varchar(50),
    date_naissance timestamp
);

create sequence seq_equipe;

--drop table equipe;
create table if not exists equipe(
    id_equipe varchar(20) primary key,
    nom varchar(50),
    ville varchar(50),
    pays varchar(50),
    date_creation timestamp
);

--drop table equipe_joueur;
create table if not exists equipe_joueur(
    id_equipe_joueur varchar(20) primary key,
    id_equipe varchar(20) references equipe(id_equipe),
    id_joueur varchar(20) references joueur(id_joueur),
    dossart varchar(3)
);
alter table equipe_joueur add column id_saison varchar(20) references saison(id_saison);

create sequence seq_match;


--drop table match;
create table if not exists match(
    id_match varchar(20) primary key,
    id_equipe1 varchar(20) references equipe(id_equipe),
    id_equipe2 varchar(20) references equipe(id_equipe),
    point_equipe1 int,
    point_equipe2 int
);

--drop table feuille_match;
create table if not exists feuille_match(
    id_feuille_match serial primary key,
    id_match varchar(20) references match(id_match),
    id_equipe_joueur varchar(20) references equipe_joueur(id_equipe_joueur)
);

create sequence seq_action;

--drop table action;
create table if not exists action(
    id_action varchar(20) primary key, 
    nom varchar(50),
    valeur int
);

--drop table action_match;
create table if not exists action_match(
    id_action_match serial primary key,
    id_equipe_joueur varchar(20) references equipe_joueur(id_equipe_joueur),
    id_action varchar(20) references action(id_action),
    date_action timestamp,
    valeur int default 0,
    id_match varchar(20) references match(id_match)
);

create or replace view
        v_joueur_saison as
        select
            s.debut, s.fin, s.id_saison, ej.dossart, j.nom, j.prenom, j.date_naissance, j.id_joueur, 1 id
        from equipe_joueur ej
        join saison s
            on s.id_saison = ej.id_saison
        join joueur j
            on j.id_joueur = ej.id_joueur
        join equipe eq
            on eq.id_equipe = ej.id_equipe;

create or replace view
    v_action_par_joueur_par_saison  as
    select eq.id_saison, eq.id_joueur, eq.dossart, eq.id_equipe_joueur,
           am.id_action_match, am.id_action, am.date_action, am.valeur, am.id_match, 1 id
           from equipe_joueur eq
    join action_match am
    on am.id_equipe_joueur = eq.id_equipe_joueur

select count(fm.id_match) from feuille_match fm join equipe_joueur ej on fm.id_equipe_joueur=ej.id_equipe_joueur
group by fm.id_equipe_joueur


create or replace view
    v_match_joueur as
select count(fm.id_match) nombre, ej.id_equipe_joueur, ej.id_saison,j.nom, j.id_joueur from feuille_match fm join equipe_joueur ej on fm.id_equipe_joueur=ej.id_equipe_joueur join joueur j on j.id_joueur=ej.id_joueur
group by ej.id_equipe_joueur, j.nom, j.id_joueur, ej.id_saison;
