-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-10-2021 a las 15:26:31
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `formula_1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escuderias`
--

CREATE TABLE `escuderias` (
  `id` varchar(10) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Presupuesto` int(11) NOT NULL,
  `tipo_motor` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pilotos`
--

CREATE TABLE `pilotos` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Salario` int(11) NOT NULL,
  `Fecha_inicio` datetime NOT NULL,
  `Fehca_salida` datetime NOT NULL,
  `id_Escuderia` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `escuderias`
--
ALTER TABLE `escuderias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pilotos`
--
ALTER TABLE `pilotos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_escuderia` (`id_Escuderia`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pilotos`
--
ALTER TABLE `pilotos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pilotos`
--
ALTER TABLE `pilotos`
  ADD CONSTRAINT `fk_escuderia` FOREIGN KEY (`id_Escuderia`) REFERENCES `escuderias` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
