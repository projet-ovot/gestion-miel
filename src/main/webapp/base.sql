/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  superharivony
 * Created: Oct 9, 2024
 */
create database miel;

create table departement(
id serial primary key,
designation varchar(50),
description varchar(150)
);

create table produit(
id serial primary key,
designation varchar(50),
description varchar(150)
);

create table employe(
id serial primary key,
nom varchar(50),
prenom varchar(50),
iddepartement int,
constraint fk_iddepartement
foreign key (iddepartement) references departement(id)
);

create table departementproduit(
id serial primary key,
idproduit int,
iddepartement int,
constraint fk_iddepartement 
foreign key (iddepartement) references departement(id),
constraint fk_idproduit 
foreign key (idproduit) references produit(id),
constraint uniqueproduitdepartement unique(idproduit,iddepartement)



);


create table demandebesoin(
id serial primary key,
daty date,
datyprevu date,
echeance int,
motif varchar(150) not null,
description varchar(50) not null,
iddepartement int,
idemploye int,
constraint fk_iddepartement 
foreign key (iddepartement) references departement(id),
constraint fk_idemploye
foreign key (idemploye) references employe(id)
);


create table demandebesoindetails(
iddemande int,
idproduit int,
quantite int,
constraint fk_iddemande
foreign key (iddemande) references demandebesoin(id),
constraint fk_idproduit
foreign key (idproduit) references produit(id)
);

create table validationdemande(
id serial primary key,
datevalidation date not null,
iddemande int,
idemploye int,
constraint fk_idemploye
foreign key (idemploye) references employe(id),
constraint fk_iddemande
foreign key (iddemande) references demandebesoin(id)

);

create table fournisseur(
id serial primary key,
nom varchar(50),
prenom varchar(50)
);


create table fournisseurproduit(
id serial primary key,
daty date,
idproduit int,
idfournisseur int,
constraint fk_idproduit
foreign key (idproduit) references produit(id),
constraint fk_idfournisseur
foreign key (idfournisseur) references fournisseur(id)



);