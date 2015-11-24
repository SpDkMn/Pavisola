-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-11-2015 a las 22:19:53
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `pavisola`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
`id` int(10) unsigned NOT NULL,
  `codigo` varchar(9) COLLATE utf8_bin NOT NULL,
  `nombre` varchar(10) COLLATE utf8_bin NOT NULL,
  `direccion` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `telefono` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `contacto` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `codigo`, `nombre`, `direccion`, `telefono`, `contacto`) VALUES
(1, 'CLT000001', 'EOFAP', NULL, NULL, 'Cristian Alpaca'),
(2, 'CLT000002', 'ESOFAP', NULL, NULL, 'Alberto ponce'),
(3, 'CLT000003', 'ESCAP', NULL, NULL, 'Cesar Amorin'),
(4, 'CLT000004', 'SEINT', NULL, NULL, 'Guillermo galvez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
`id` int(10) unsigned NOT NULL,
  `cod_factura` varchar(9) COLLATE utf8_bin NOT NULL,
  `cod_pedido` int(10) unsigned NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `fecha` date NOT NULL,
  `pagado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
`id` int(10) unsigned NOT NULL,
  `codigo` varchar(9) COLLATE utf8_bin NOT NULL,
  `numero_orden` int(10) unsigned NOT NULL,
  `cliente` int(10) unsigned NOT NULL,
  `fecha_recepcion` date NOT NULL,
  `fecha_entrega` date NOT NULL,
  `entregado` tinyint(1) NOT NULL,
  `pagado` tinyint(1) NOT NULL,
  `generado` tinyint(1) NOT NULL,
  `anulado` tinyint(1) NOT NULL,
  `sub_total` decimal(10,0) NOT NULL,
  `IGV` decimal(10,0) NOT NULL,
  `total` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_producto`
--

CREATE TABLE IF NOT EXISTS `pedido_producto` (
  `cod_pedido` int(10) unsigned NOT NULL,
  `cod_producto` int(10) unsigned NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
`id` int(10) unsigned NOT NULL,
  `producto` varchar(50) COLLATE utf8_bin NOT NULL,
  `unidad` varchar(3) COLLATE utf8_bin NOT NULL,
  `cantidad` int(10) unsigned NOT NULL,
  `costo` decimal(10,0) unsigned NOT NULL,
  `p_venta` decimal(10,0) unsigned NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `producto`, `unidad`, `cantidad`, `costo`, `p_venta`) VALUES
(1, 'Agua de mesa x 3 Lts', 'UND', 84, '4', '5'),
(2, 'Apio', 'KGR', 15, '2', '2'),
(3, 'Camote', 'KGR', 150, '2', '3'),
(4, 'Carne de cerdo chuleta', 'KGR', 60, '18', '23'),
(5, 'Carne de res guiso', 'KGR', 90, '16', '20'),
(6, 'Carne de res tapa', 'KGR', 90, '16', '20'),
(7, 'Culantro', 'KGR', 20, '8', '10'),
(8, 'Huacatay', 'KGR', 12, '6', '7'),
(9, 'Manzanilla fresca', 'KGR', 5, '6', '8'),
(10, 'Papa', 'KGR', 180, '4', '5'),
(11, 'Pollo fresco eviscerado', 'KGR', 200, '8', '10'),
(12, 'Sal', 'KGR', 15, '1', '1'),
(13, 'Zanahoria', 'KGR', 84, '4', '4');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `codigo` (`codigo`,`numero_orden`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
