create database ratificacionbd;

use ratificacionbd;

CREATE TABLE `documento`
(
  `id_documento` integer PRIMARY KEY AUTO_INCREMENT,
  `id_usuario` integer,
  `cod_documento` varchar(30) UNIQUE,
  `fecha_presentacion` date NOT NULL,
  `contenido` text
);

CREATE TABLE `persona`
(
  `id_persona` integer PRIMARY KEY AUTO_INCREMENT,
  `nombres` varchar(50) NOT NULL,
  `apellido_paterno` varchar(30) NOT NULL,
  `apellido_materno` varchar(30) NOT NULL,
  `cargo` varchar(30),
  `dni` char(8) UNIQUE NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `sexo` ENUM ('M', 'F') NOT NULL
);

CREATE TABLE `docente`
(
  `id_docente` integer PRIMARY KEY AUTO_INCREMENT,
  `id_persona` integer,
  `id_facultad` integer
);

CREATE TABLE `expediente`
(
  `id_expediente` integer PRIMARY KEY AUTO_INCREMENT,
  `id_docente` integer,
  `fecha_presentacion` date,
  `contenido_expediente` text NOT NULL
);

CREATE TABLE `usuario`
(
  `id_usuario` integer PRIMARY KEY AUTO_INCREMENT,
  `id_persona` integer,
  `email` varchar(60) UNIQUE NOT NULL,
  `password` varchar(512) NOT NULL,
  `cargo` enum("ROLE_ADMIN","ROLE_DECANO","ROLE_JEFE_ADMINISTRATIVO") NOT NULL,
  `rol` ENUM ('ROLE_ADMIN', 'ROLE_DECANO', 'ROLE_JEFE_ADMINISTRATIVO') NOT NULL,
  `ultimo_login` datetime DEFAULT (now()),
  `foto` longblob,
  `id_firma` integer
);

CREATE TABLE `facultad`
(
  `id_facultad` integer PRIMARY KEY AUTO_INCREMENT,
  `nombre_facultad` varchar(50) NOT NULL,
  `codigo_facultad` char(10) NOT NULL
);

CREATE TABLE `firma`
(
  `id_firma` integer PRIMARY KEY AUTO_INCREMENT,
  `nombre_firma` varchar(80) UNIQUE NOT NULL,
  `firma_digital` longblob NOT NULL,
  `cargo` varchar(30)
);

ALTER TABLE `documento` ADD FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

ALTER TABLE `docente` ADD FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`);

ALTER TABLE `docente` ADD FOREIGN KEY (`id_facultad`) REFERENCES `facultad` (`id_facultad`);

ALTER TABLE `expediente` ADD FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`);

ALTER TABLE `usuario` ADD FOREIGN KEY (`id_firma`) REFERENCES `firma` (`id_firma`);

ALTER TABLE `usuario` ADD FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`);

