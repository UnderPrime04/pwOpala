create table Banda(
Id_Banda numeric(10) constraint Id_Banda_Pk primary key,
NomeBanda char (38) not null,
Estilo char(20)
)

INSERT INTO Banda (NomeBanda, Estilo) VALUES ('Chitaozinho e Xoror�', 'Brega Romantico')
INSERT INTO Banda (NomeBanda, Estilo) VALUES ('Bar�es da Pisadinha', 'Piseiro')