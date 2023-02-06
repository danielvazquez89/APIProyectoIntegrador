-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-02-2023 a las 13:57:37
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectointegradordb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chat`
--

CREATE TABLE `chat` (
  `id_usuario` int(11) NOT NULL,
  `id_mensaje` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_vendedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id_usuario` int(11) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `fecha_compra` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id_usuario`, `id_vendedor`, `id_producto`, `fecha_compra`) VALUES
(2, 1, 3, 'hopy');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generos`
--

CREATE TABLE `generos` (
  `tipo_genero` varchar(100) NOT NULL,
  `url_imagen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `generos`
--

INSERT INTO `generos` (`tipo_genero`, `url_imagen`) VALUES
('Aventura', ''),
('Drama', ''),
('Life Simulation', ''),
('Puzzle', ''),
('RPG', ''),
('Shooter', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegos`
--

CREATE TABLE `juegos` (
  `id_producto` int(11) NOT NULL,
  `nombre_juego` varchar(100) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  `descripcion_juego` varchar(300) NOT NULL,
  `url_imagen` varchar(400) NOT NULL,
  `genero` varchar(100) NOT NULL,
  `precio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `juegos`
--

INSERT INTO `juegos` (`id_producto`, `nombre_juego`, `id_vendedor`, `descripcion_juego`, `url_imagen`, `genero`, `precio`) VALUES
(3, 'Last of us', 1, 'Gran juego', '', 'Aventura', '12.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegos_favoritos`
--

CREATE TABLE `juegos_favoritos` (
  `id_usuario` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `fecha_like` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensaje`
--

CREATE TABLE `mensaje` (
  `id_mensaje` int(11) NOT NULL,
  `contenido_mensaje` varchar(110) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `mail` varchar(60) DEFAULT NULL,
  `contrasena` varchar(60) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `codigo_postal` varchar(60) DEFAULT NULL,
  `ciudad` varchar(60) DEFAULT NULL,
  `fecha_nacimiento` varchar(60) DEFAULT NULL,
  `saldo_monedero` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre`, `apellidos`, `mail`, `contrasena`, `direccion`, `codigo_postal`, `ciudad`, `fecha_nacimiento`, `saldo_monedero`) VALUES
(1, 'Juan', 'Munoz', 'pruab1@prueba.com', '12345678', 'avd. la mena', '2342', 'madrid', '12 diciembre 2023', '10.25'),
(2, 'Monica', 'Naranko', 'monica@prueba.com', '12345678', 'avd. la mena', '12332', 'madrid', '12 diciembre 2023', '0.00'),
(3, 'Juan', 'Perez', 'juanperez@gmail.com', '123456', 'Calle falsa', '28172', 'Madrid', '18 de enero de 1999', '0.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios_favoritos`
--

CREATE TABLE `usuarios_favoritos` (
  `id_usuario` int(11) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  `fecha_like` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`id_mensaje`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_vendedor` (`id_vendedor`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_vendedor` (`id_vendedor`);

--
-- Indices de la tabla `generos`
--
ALTER TABLE `generos`
  ADD PRIMARY KEY (`tipo_genero`);

--
-- Indices de la tabla `juegos`
--
ALTER TABLE `juegos`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_vendedor` (`id_vendedor`),
  ADD KEY `genero` (`genero`);

--
-- Indices de la tabla `juegos_favoritos`
--
ALTER TABLE `juegos_favoritos`
  ADD PRIMARY KEY (`id_usuario`,`id_producto`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD KEY `id_mensaje` (`id_mensaje`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `usuarios_favoritos`
--
ALTER TABLE `usuarios_favoritos`
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_vendedor` (`id_vendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `chat`
--
ALTER TABLE `chat`
  MODIFY `id_mensaje` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `juegos`
--
ALTER TABLE `juegos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `chat_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `juegos` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `chat_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `chat_ibfk_3` FOREIGN KEY (`id_vendedor`) REFERENCES `juegos` (`id_vendedor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `juegos` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `compras_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `compras_ibfk_3` FOREIGN KEY (`id_vendedor`) REFERENCES `juegos` (`id_vendedor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `juegos`
--
ALTER TABLE `juegos`
  ADD CONSTRAINT `juegos_ibfk_1` FOREIGN KEY (`id_vendedor`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `juegos_ibfk_2` FOREIGN KEY (`genero`) REFERENCES `generos` (`tipo_genero`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `juegos_favoritos`
--
ALTER TABLE `juegos_favoritos`
  ADD CONSTRAINT `juegos_favoritos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `juegos_favoritos_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `juegos` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD CONSTRAINT `mensaje_ibfk_1` FOREIGN KEY (`id_mensaje`) REFERENCES `chat` (`id_mensaje`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios_favoritos`
--
ALTER TABLE `usuarios_favoritos`
  ADD CONSTRAINT `usuarios_favoritos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_favoritos_ibfk_2` FOREIGN KEY (`id_vendedor`) REFERENCES `juegos` (`id_vendedor`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
