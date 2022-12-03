-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 03 déc. 2022 à 21:19
-- Version du serveur : 10.1.36-MariaDB
-- Version de PHP : 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `fly`
--

-- --------------------------------------------------------

--
-- Structure de la table `comunity`
--

CREATE TABLE `comunity` (
  `UserName` varchar(50) NOT NULL,
  `LastName` text NOT NULL,
  `FirstName` text NOT NULL,
  `PassportN` int(11) NOT NULL,
  `EmailPhone` varchar(50) NOT NULL,
  `PassWord` varchar(50) NOT NULL,
  `confirm password` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `comunity`
--

INSERT INTO `comunity` (`UserName`, `LastName`, `FirstName`, `PassportN`, `EmailPhone`, `PassWord`, `confirm password`) VALUES
('ALEXL3AZZIJR', 'AZZI', 'ALI', 3643734, '0687543455', '0987612345', 987612345),
('azzouzi', 'azzi', 'ahmed', 468956422, '068654355', '12345', 12345),
('CR7', 'RONALDO', 'CRISTIANO', 12345, '762568955', '0987654321', 987654321),
('TFDF', 'ZAFZEAFG', 'FYUUBD', 234242, 'AFKJBBA', '123456', 123456),
('u', 'achraf', 'yousra', 168736, '57845795', '0000', 0);

-- --------------------------------------------------------

--
-- Structure de la table `recu`
--

CREATE TABLE `recu` (
  `nom` text NOT NULL,
  `depart` varchar(100) NOT NULL,
  `seat` varchar(10) NOT NULL,
  `heuredep` varchar(100) NOT NULL,
  `passportnum` int(50) NOT NULL,
  `prenom` text NOT NULL,
  `arrivée` varchar(100) NOT NULL,
  `class` text NOT NULL,
  `airlines` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `recu`
--

INSERT INTO `recu` (`nom`, `depart`, `seat`, `heuredep`, `passportnum`, `prenom`, `arrivée`, `class`, `airlines`) VALUES
('ALEX', 'LOS ANGELES,UNITED STATES', 'A1', ' TUESDAY 18:59', 1242134, 'ALLOCK', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'UNITED'),
('BELAZRI', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'B5', ' TURSDAY 21:20', 123213124, 'MOSSAB', 'PARIS-CHARLES DE GAULLE,FRANCE', 'SILVER', 'ROYAL AIR MAROC'),
('azzi', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'B1', ' TUESDAY 23:00', 65433456, 'ahmed', 'PARIS-CHARLES DE GAULLE,FRANCE', 'GOLD', 'ROYAL AIR MAROC'),
('AEG', 'PARIS-CHARLES DE GAULLE,FRANCE', 'C4', ' WEDNESDAY 22:17', 23452523, 'JABGRJ', 'LOS ANGELES,UNITED STATES', 'SILVER', 'ROYAL AIR MAROC'),
('marcelo', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A10', ' MONDAY 17:28', 561346, 'viera', 'LYON-SAINT-EXUPERY,FRANCE', 'BRONZE', 'ROYAL AIR MAROC'),
('YTSDYT', 'PARIS-CHARLES DE GAULLE,FRANCE', 'C4', ' MONDAY 17:28', 453254, 'GFDIUF', 'LYON-SAINT-EXUPERY,FRANCE', 'SILVER', 'AIRARABIA'),
('DKTU', 'LYON-SAINT-EXUPERY,FRANCE', 'A5', ' TUESDAY 21:38', 54325, 'TDUUD', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'SILVER', 'EMIRATES'),
('ytdyhtj', 'LYON-SAINT-EXUPERY,FRANCE', 'E6', ' WEDNESDAY 11:38', 356335, 'yttdyt', 'LOS ANGELES,UNITED STATES', 'BRONZE', 'QATAR AIRWAYS'),
('TYDYT', 'LYON-SAINT-EXUPERY,FRANCE', 'E7', ' WEDNESDAY 11:38', 54435, 'SREY', 'LOS ANGELES,UNITED STATES', 'BRONZE', 'QATAR AIRWAYS'),
('AFAZ', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'B8', ' MONDAY 17:28', 12432, 'AFAZF', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'BRONZE', 'EMIRATES'),
('NUJSF', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'A6', ' MONDAY 17:28', 315331, 'SFBF', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'BRONZE', 'EMIRATES'),
('ERFEZ', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'A1', ' MONDAY 22:07', 3243244, 'ZEVEZ', 'LYON-SAINT-EXUPERY,FRANCE', 'GOLD', 'AIRARABIA'),
('HYGC', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'A1', ' MONDAY 17:28', 23141, 'AERFA', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'GOLD', 'ROYAL AIR MAROC'),
('ZEGVF', 'LYON-SAINT-EXUPERY,FRANCE', 'A1', ' TUESDAY 21:38', 32432, 'ECZE', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'AIRARABIA'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('AEFEAF', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' WEDNESDAY 22:17', 23452, 'FOIO', 'LOS ANGELES,UNITED STATES', 'SILVER', 'QATAR AIRWAYS'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('SZGRZ', 'LOS ANGELES,UNITED STATES', 'A2', ' TUESDAY 23:00', 235235, 'ZRGTZR', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('TYDYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'A3', ' MONDAY 22:04', 32432, 'VZRGG', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('CYYJK', 'LYON-SAINT-EXUPERY,FRANCE', 'B2', ' TUESDAY 21:38', 65343, 'UIYUY', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'EMIRATES'),
('JFUGUY', 'LYON-SAINT-EXUPERY,FRANCE', 'A7', ' TUESDAY 21:38', 7687689, 'GIUGI', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'BRONZE', 'EMIRATES'),
('GVCHJGJ', 'LYON-SAINT-EXUPERY,FRANCE', 'A10', ' TUESDAY 21:38', 57856, 'YGKGL', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'BRONZE', 'EMIRATES'),
('ZEGZZ', 'LYON-SAINT-EXUPERY,FRANCE', 'A1', ' TUESDAY 21:38', 234532, 'ERGGZE', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'UNITED'),
('jfdklA', 'LOS ANGELES,UNITED STATES', 'A1', ' TUESDAY 18:59', 54656445, 'hjnk', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'UNITED'),
('jfdklA', 'LOS ANGELES,UNITED STATES', 'A1', ' TUESDAY 18:59', 54656445, 'hjnk', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'UNITED'),
('ALI', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'A1', ' TUESDAY 21:38', 2342, 'ALILO', 'LYON-SAINT-EXUPERY,FRANCE', 'GOLD', 'AIRARABIA'),
('ZIZO', 'LYON-SAINT-EXUPERY,FRANCE', 'C4', ' MONDAY 21:58', 453256, 'ZINEDINE', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'SILVER', 'EMIRATES'),
('AGAEG', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A3', ' MONDAY 23:35', 231532, 'AERFG', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'SILVER', 'ROYAL AIR MAROC'),
('EGEZR', 'LYON-SAINT-EXUPERY,FRANCE', 'A2', ' TUESDAY 21:38', 235235, 'ZEVEZ', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'AIRARABIA'),
('REZ', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A1', ' WEDNESDAY 15:59', 23552, 'EZGZE', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'ROYAL AIR MAROC'),
('ZGZE', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A2', ' MONDAY 17:28', 54754, 'OIJKO', 'LYON-SAINT-EXUPERY,FRANCE', 'GOLD', 'QATAR AIRWAYS'),
('KALO', 'LYON-SAINT-EXUPERY,FRANCE', 'A6', ' TUESDAY 21:38', 243214, 'SALAMONE', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'BRONZE', 'EMIRATES'),
('FYFJSV', 'PARIS-CHARLES DE GAULLE,FRANCE', 'E10', ' WEDNESDAY 22:17', 342534, 'ERHEQ', 'LOS ANGELES,UNITED STATES', 'BRONZE', 'EMIRATES'),
('RHHRS', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'E1', ' MONDAY 22:07', 2435645, 'GERZG', 'LYON-SAINT-EXUPERY,FRANCE', 'GOLD', 'ROYAL AIR MAROC'),
('EREQGE', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A1', ' TUESDAY 05:19', 6543565, 'QEREEG', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'ROYAL AIR MAROC'),
('SGESG', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A2', ' TUESDAY 05:19', 95833, 'HYJJYT', 'NEW YORK CITY-JOHN F,KENNEDY,UNITED STATES', 'GOLD', 'ROYAL AIR MAROC'),
('AGFYU', 'PARIS-CHARLES DE GAULLE,FRANCE', 'A1', ' WEDNESDAY 15:59', 5672572, 'FAFHAD', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'GOLD', 'AIRARABIA'),
('YILHTB', 'LYON-SAINT-EXUPERY,FRANCE', 'A1', ' MONDAY 14:48', 6784272, 'EQRHR', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'GOLD', 'EMIRATES'),
('GUIEZGFE', 'LYON-SAINT-EXUPERY,FRANCE', 'A3', ' MONDAY 14:48', 36546, 'HQIUHKJV', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'SILVER', 'EMIRATES'),
('ZBU', 'LONDON-CITY AIRPORT,UNITED KINGDOM', 'A10', ' WEDNESDAY 15:59', 348217432, 'ZBI ', 'LOS ANGELES,UNITED STATES', 'BRONZE', 'ROYAL AIR MAROC'),
('sssakki', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'B1', ' TUESDAY 23:00', 89657865, 'marawane', 'PARIS-CHARLES DE GAULLE,FRANCE', 'GOLD', 'ROYAL AIR MAROC'),
('zouayçfa', 'CASABLANCA-MOHAMMED 5,MOROCCO', 'B1', ' TUESDAY 23:00', 4564654, 'uhgziufgia', 'PARIS-CHARLES DE GAULLE,FRANCE', 'GOLD', 'ROYAL AIR MAROC');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `comunity`
--
ALTER TABLE `comunity`
  ADD PRIMARY KEY (`UserName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;