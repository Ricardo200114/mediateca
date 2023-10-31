-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 17:15:12
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cds`
--

CREATE TABLE `cds` (
  `codId` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `artista` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `durancion` varchar(45) NOT NULL,
  `numero_canciones` int(11) NOT NULL,
  `unidades` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `cds`
--

INSERT INTO `cds` (`codId`, `titulo`, `artista`, `genero`, `durancion`, `numero_canciones`, `unidades`) VALUES
('CDA00002', 'A STATE OF TRANCE', 'ARMIN VAN BUUREN', 'TRANCE', '2:10:19', 23, 1),
('CDA00940', 'EL REY DEL POP', 'MICHAEL JACKSON', 'POP', '2:10:39', 12, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dvds`
--

CREATE TABLE `dvds` (
  `codId` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `director` varchar(45) NOT NULL,
  `duracion` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `dvds`
--

INSERT INTO `dvds` (`codId`, `titulo`, `director`, `duracion`, `genero`) VALUES
('PRUEBA5', 'PRUEBA5', 'PRUEBA5', '20', 'PRUEBA5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `codId` varchar(50) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `autor` varchar(45) NOT NULL,
  `paginas` int(11) NOT NULL,
  `editorial` varchar(45) NOT NULL,
  `isbn` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `unidades` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`codId`, `titulo`, `autor`, `paginas`, `editorial`, `isbn`, `fecha`, `unidades`) VALUES
('LIB21214', 'modificacion', 'otra prueba update', 20, 'iscariote', 'LIB21214', '2023', 2),
('PRUEBA1', 'prueba', 'prueba', 20, 'prueba', 'PRUEBA1', '2022', 8),
('PRUEBA4', 'PRUEBA4', 'PRUEBA4', 2, 'PRUEBA4', 'PRUEBA4', '2012', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revistas`
--

CREATE TABLE `revistas` (
  `codId` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `editorial` varchar(45) NOT NULL,
  `periodicidad` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `unidades` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `revistas`
--

INSERT INTO `revistas` (`codId`, `titulo`, `editorial`, `periodicidad`, `fecha`, `unidades`) VALUES
('REV00001', 'NATIONAL', 'GEOGRAPHIC', 'DIARIA', '12/09/2029', 2),
('REV00002', 'FACTUM', 'FACTUM', 'SEMANAL', '28/04/2023', 1),
('REV00934', 'NEW YORK TIMES', 'TIMES', 'SEMANAL', '12/09/2012', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cds`
--
ALTER TABLE `cds`
  ADD PRIMARY KEY (`codId`);

--
-- Indices de la tabla `dvds`
--
ALTER TABLE `dvds`
  ADD PRIMARY KEY (`codId`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`codId`);

--
-- Indices de la tabla `revistas`
--
ALTER TABLE `revistas`
  ADD PRIMARY KEY (`codId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
