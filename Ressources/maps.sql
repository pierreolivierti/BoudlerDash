-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Ven 23 Juin 2017 à 09:09
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `boulderdash`
--

-- --------------------------------------------------------

--
-- Structure de la table `maps`
--

CREATE TABLE `maps` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `scriptmap` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `maps`
--

INSERT INTO `maps` (`id`, `name`, `scriptmap`) VALUES
(1, 'level1', '444444444444444444448\r\n472222222245552222248\r\n422222222242662222248\r\n422222522242222222248\r\n422222222242222622248\r\n422222255545552222248\r\n422226662222222222248\r\n422222222242222222248\r\n422555222242262222248\r\n422255222242666222248\r\n422225222242222220048\r\n422222222242222220148\r\n444444444444444444449\r\n'),
(2, 'level2', '444444444444444444444444444444448\r\n422222222200022252222222244446248\r\n422222262000022222225222222227248\r\n422222222000022622225555222222248\r\n422255550000000222222552222222248\r\n422255520003000022222222222222248\r\n422222222044444444444222222222248\r\n422222224442222222224422222252248\r\n426222244222226222222442222222248\r\n422222242225222262222244222222248\r\n422222242222222222222224422222248\r\n422222224444442222225222422222248\r\n462222222222244442222222442222248\r\n422222222222222244422222442252248\r\n422222226222222222442222422222248\r\n422222222222222224422224422222248\r\n422555552222444444222044222222248\r\n422225522244444222220000222222248\r\n422222222442222252220000222252248\r\n422222262426000222222442222622248\r\n422222222422010222222422222222248\r\n462222224444440266224422222222248\r\n444444444444444444444444444444449'),
(3, 'level3', '444444444444444444444444444444448\r\n412222222222222222222222222222248\r\n462222226252222622252222226622248\r\n422225222222222222222252222222248\r\n422222222222222222222222222222248\r\n422244444444444444444444444444448\r\n422255500000000000000005222222248\r\n462222200000000000000552222222248\r\n422200000000000000000222222262248\r\n422220000030000030000222222222248\r\n444444444444444444444444444422248\r\n422226222222222222222222222222248\r\n422222222222222226222222252222248\r\n422222222252226622222226222222248\r\n422222222222222222222222222222248\r\n422244444444444444444444444444448\r\n422622222224222255522555552222648\r\n422622222224226255555565552222248\r\n422222252224222222222222226222248\r\n400225222224262222622522222222248\r\n400022222222222222222222222222248\r\n463002222225222222222222222222748\r\n444444444444444444444444444444449'),
(4, 'level4', '444444444444444444444444444444448\r\n400022522222200000022522222222748\r\n400002252222220000025222222222248\r\n400002225222222603052222222222248\r\n436022222522222222522222222222248\r\n422222222252222225222222222222248\r\n422222222225222252222222222222248\r\n422222222222522522222222222222248\r\n422222222222255222222222222222248\r\n422222222222255222222222222222248\r\n422222222222522522222222222222248\r\n422222222225222255222222222222248\r\n422222222252222225222222222222248\r\n422222222522222222522222222222248\r\n422222225222222222252222222222248\r\n422222252220000222225222222222248\r\n422222522200000022222522222222248\r\n422225222000000622222252222222248\r\n422252222220030222222225222222248\r\n422552222222222222222222522222048\r\n425222222222222222222222252000048\r\n422222122222222222222222225003648\r\n444444444444444444444444444444449');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `maps`
--
ALTER TABLE `maps`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `maps`
--
ALTER TABLE `maps`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;