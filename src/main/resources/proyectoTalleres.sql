DROP DATABASE IF EXISTS proyectoTalleres;
CREATE DATABASE proyectoTalleres;
USE proyectoTalleres;

CREATE TABLE Admin(
nombreAdmin VARCHAR(50) NOT NULL,
apellidoAdmin VARCHAR(50) NOT NULL,
idAdmin VARCHAR(100) NOT NULL,
correoAdmin VARCHAR(100) NOT NULL,
autorizacionAdmin INT(1) NOT NULL DEFAULT 1
);

CREATE TABLE Usuarios(
nombreUsuario VARCHAR(50) NOT NULL,
apellidoUsuario VARCHAR(50) NOT NULL,
idUsuario VARCHAR(100) NOT NULL,
correoUsuario VARCHAR(100) NOT NULL,
contraseña VARCHAR(100) NOT NULL,
longitud VARCHAR(100) DEFAULT 0,
latitud VARCHAR(100) DEFAULT 0,
loginStatus BOOLEAN DEFAULT FALSE,
creditoUsuario FLOAT(255,2) 
);

CREATE TABLE Talleres(
idTaller VARCHAR(100) NOT NULL,
nombreTaller VARCHAR(100) NOT NULL,
ratingTaller FLOAT(255,2) DEFAULT 0,
horarioTaller VARCHAR(300) DEFAULT 'Sin asignar',
PRIMARY KEY(idTaller)
);

CREATE TABLE Transacciones(
idTransaccion INT AUTO_INCREMENT,
fechaTransaccion DATETIME DEFAULT CURRENT_TIMESTAMP,
idTaller VARCHAR(100) NOT NULL,
FOREIGN KEY(idTaller) REFERENCES Taller(idTaller),
PRIMARY KEY(idTransaccion)
);