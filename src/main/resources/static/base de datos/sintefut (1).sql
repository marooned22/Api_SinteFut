-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3366
-- Generation Time: Nov 24, 2023 at 08:43 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sintefut`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrador_centro`
--

CREATE TABLE `administrador_centro` (
  `id` int(10) NOT NULL,
  `identificacion` int(20) NOT NULL,
  `Primer_Apellido` varchar(30) NOT NULL,
  `Segundo_Apellido` varchar(30) DEFAULT NULL,
  `Primer_nombre` varchar(30) NOT NULL,
  `Segundo_Nombre` varchar(30) DEFAULT NULL,
  `Email` varchar(50) NOT NULL,
  `fecha_nacimiento` datetime(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `administrador_centro`
--

INSERT INTO `administrador_centro` (`id`, `identificacion`, `Primer_Apellido`, `Segundo_Apellido`, `Primer_nombre`, `Segundo_Nombre`, `Email`, `fecha_nacimiento`) VALUES
(52, 0, 'dfgdfg', 'lopez', 'david', 'mike', 'dape@gmail.com', '2023-11-09 05:00:00.000000'),
(53, 123, 'perez', 'martinez', 'david', '', 'dperez@gmail.com', '2023-11-07 05:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `administrador_centro_seq`
--

CREATE TABLE `administrador_centro_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `administrador_centro_seq`
--

INSERT INTO `administrador_centro_seq` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Table structure for table `canchas`
--

CREATE TABLE `canchas` (
  `id` int(10) NOT NULL,
  `Numero_Cancha` int(10) NOT NULL,
  `estado_cancha` tinyint(1) DEFAULT NULL,
  `Costos` int(10) NOT NULL,
  `descripcion_canchas` varchar(255) DEFAULT NULL,
  `calificacion` int(11) NOT NULL,
  `tipo_cancha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `canchas`
--

INSERT INTO `canchas` (`id`, `Numero_Cancha`, `estado_cancha`, `Costos`, `descripcion_canchas`, `calificacion`, `tipo_cancha`) VALUES
(52, 1, 0, 55000, 'Cancha destapada, sintetica', 5, 'Futbol 5'),
(107, 2, 0, 180000, 'Cancha aire libre, grama', 4, 'Futbol 11'),
(152, 3, 0, 100000, 'Cancha aire libre, sintetica, canchas con redes', 4, 'Futbol 7');

-- --------------------------------------------------------

--
-- Table structure for table `canchas_seq`
--

CREATE TABLE `canchas_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `canchas_seq`
--

INSERT INTO `canchas_seq` (`next_val`) VALUES
(251);

-- --------------------------------------------------------

--
-- Table structure for table `centro_deportivo`
--

CREATE TABLE `centro_deportivo` (
  `Id_Centro_Deportivo` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `Servicios` varchar(30) NOT NULL,
  `Descripción_Centro` varchar(100) DEFAULT NULL,
  `Calificación` int(5) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `calificacion` int(11) NOT NULL,
  `descripcion_centro` varchar(255) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `centro_deportivo`
--

INSERT INTO `centro_deportivo` (`Id_Centro_Deportivo`, `nombre`, `Servicios`, `Descripción_Centro`, `Calificación`, `id`, `calificacion`, `descripcion_centro`, `direccion`) VALUES
(1, '8 Gol', 'null', 'conjunto deportivo con 4 canchas, con amplio garaje, baños y zona de alimentacion', 0, 0, 0, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `centro_deportivo_seq`
--

CREATE TABLE `centro_deportivo_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `centro_deportivo_seq`
--

INSERT INTO `centro_deportivo_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id` int(10) NOT NULL,
  `identificacion` int(20) NOT NULL,
  `Primer_Apellido` varchar(30) NOT NULL,
  `Segundo_Apellido` varchar(30) DEFAULT NULL,
  `Primer_nombre` varchar(30) NOT NULL,
  `Segundo_Nombre` varchar(30) DEFAULT NULL,
  `Email` varchar(50) NOT NULL,
  `fecha_nacimiento` datetime(6) DEFAULT NULL,
  `Servicio_Salud` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id`, `identificacion`, `Primer_Apellido`, `Segundo_Apellido`, `Primer_nombre`, `Segundo_Nombre`, `Email`, `fecha_nacimiento`, `Servicio_Salud`) VALUES
(1, 1018, 'montero', 'gordillo', 'juan', 'sebastian', 'juSe@gmail.com', '1997-02-12 00:00:00.000000', 'salucoop'),
(52, 2323, 'gutierrez', 'lopez', 'jhon', 'mike', 'jhon@gmail.com', '2003-07-06 05:00:00.000000', 'famisanar'),
(102, 0, 'perez', 'lopez', 'david', 'mike', 'dape@gmail.com', '1996-08-22 05:00:00.000000', 'sanitas'),
(352, 0, 'dfgdfg', 'martinez', 'david', 'mike', 'jhon@gmail.com', '1988-02-24 05:00:00.000000', 'famisanar');

-- --------------------------------------------------------

--
-- Table structure for table `cliente_seq`
--

CREATE TABLE `cliente_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `cliente_seq`
--

INSERT INTO `cliente_seq` (`next_val`) VALUES
(501);

-- --------------------------------------------------------

--
-- Table structure for table `costos`
--

CREATE TABLE `costos` (
  `Id_Costos` int(10) NOT NULL,
  `Valor_Dia` int(10) NOT NULL,
  `Valor_Noche` int(10) NOT NULL,
  `Valor_Tarde` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `disponibilidad`
--

CREATE TABLE `disponibilidad` (
  `Id_Disponibilidad` int(8) NOT NULL,
  `Id_Horario` int(8) NOT NULL,
  `Id_Cancha` int(10) NOT NULL,
  `Fecha` date NOT NULL,
  `Canchas_Disponibles` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `horarios`
--

CREATE TABLE `horarios` (
  `Id_Horario` int(10) NOT NULL,
  `Hora_inicio` date NOT NULL,
  `Hora_Fin` date NOT NULL,
  `Id_Cancha` int(10) NOT NULL,
  `Id_Reserva` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `otros_servicios`
--

CREATE TABLE `otros_servicios` (
  `Id_Otros_Servicios` int(11) NOT NULL,
  `Descripción_Servicio` varchar(100) NOT NULL,
  `Tipo_Servicio` varchar(20) NOT NULL,
  `id_Centro_Deportivo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservas`
--

CREATE TABLE `reservas` (
  `Id_Reservas` int(10) NOT NULL,
  `Fecha_Reserva` date NOT NULL,
  `hora_inicio` time(6) DEFAULT NULL,
  `hora_fin` time(6) DEFAULT NULL,
  `Metodo_pago` varchar(15) NOT NULL,
  `id` int(11) NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `pago` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservas_seq`
--

CREATE TABLE `reservas_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `reservas_seq`
--

INSERT INTO `reservas_seq` (`next_val`) VALUES
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrador_centro`
--
ALTER TABLE `administrador_centro`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Id_Administrador_Centro` (`id`);

--
-- Indexes for table `canchas`
--
ALTER TABLE `canchas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `Numero_Cancha` (`Numero_Cancha`);

--
-- Indexes for table `centro_deportivo`
--
ALTER TABLE `centro_deportivo`
  ADD PRIMARY KEY (`Id_Centro_Deportivo`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `costos`
--
ALTER TABLE `costos`
  ADD PRIMARY KEY (`Id_Costos`);

--
-- Indexes for table `disponibilidad`
--
ALTER TABLE `disponibilidad`
  ADD PRIMARY KEY (`Id_Disponibilidad`);

--
-- Indexes for table `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`Id_Horario`);

--
-- Indexes for table `otros_servicios`
--
ALTER TABLE `otros_servicios`
  ADD PRIMARY KEY (`Id_Otros_Servicios`);

--
-- Indexes for table `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`Id_Reservas`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrador_centro`
--
ALTER TABLE `administrador_centro`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `canchas`
--
ALTER TABLE `canchas`
  MODIFY `Numero_Cancha` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=403;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
