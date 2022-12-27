-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 22, 2022 at 11:08 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kereta_api`
--

-- --------------------------------------------------------

--
-- Table structure for table `argentina`
--

CREATE TABLE `argentina` (
  `No_Kursi` varchar(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Jumlah` int(11) NOT NULL,
  `Tujuan` varchar(50) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `argentina`
--

INSERT INTO `argentina` (`No_Kursi`, `Nama`, `Jumlah`, `Tujuan`, `Harga`) VALUES
('1', 'q', 1, 'Sumedang', 300000),
('54', 'al', 2, 'Bandung', 400000);

-- --------------------------------------------------------

--
-- Table structure for table `bandung`
--

CREATE TABLE `bandung` (
  `No_Kursi` varchar(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `Tujuan` varchar(50) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bandung`
--

INSERT INTO `bandung` (`No_Kursi`, `Nama`, `jumlah`, `Tujuan`, `Harga`) VALUES
('21', 'aw', 2, 'Sumedang', 400000),
('5', 'Alka', 2, 'Sumedang', 400000),
('7', 'alka', 2, 'Jakarta', 600000);

-- --------------------------------------------------------

--
-- Table structure for table `jakarta`
--

CREATE TABLE `jakarta` (
  `No_Kursi` varchar(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Jumlah` int(11) NOT NULL,
  `Tujuan` varchar(50) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jakarta`
--

INSERT INTO `jakarta` (`No_Kursi`, `Nama`, `Jumlah`, `Tujuan`, `Harga`) VALUES
('1', 'alkarizqy', 5, 'Bandung', 2000000),
('10', 'alka', 1, 'Argentina', 450000),
('2', 'ajay', 2, 'Bandung', 900000),
('9', 'alka', 3, 'Bandung', 1350000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('admin', 'admin'),
('al', '123'),
('alka', '3');

-- --------------------------------------------------------

--
-- Table structure for table `saldo`
--

CREATE TABLE `saldo` (
  `Username` varchar(50) NOT NULL,
  `Saldo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `saldo`
--

INSERT INTO `saldo` (`Username`, `Saldo`) VALUES
('admin', '30000000');

-- --------------------------------------------------------

--
-- Table structure for table `sumedang`
--

CREATE TABLE `sumedang` (
  `No_Kursi` varchar(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Jumlah` int(11) NOT NULL,
  `Tujuan` varchar(20) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sumedang`
--

INSERT INTO `sumedang` (`No_Kursi`, `Nama`, `Jumlah`, `Tujuan`, `Harga`) VALUES
('l4', 'ajay', 2, 'Jakarta', 200000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `argentina`
--
ALTER TABLE `argentina`
  ADD PRIMARY KEY (`No_Kursi`);

--
-- Indexes for table `bandung`
--
ALTER TABLE `bandung`
  ADD PRIMARY KEY (`No_Kursi`);

--
-- Indexes for table `jakarta`
--
ALTER TABLE `jakarta`
  ADD PRIMARY KEY (`No_Kursi`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `saldo`
--
ALTER TABLE `saldo`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `sumedang`
--
ALTER TABLE `sumedang`
  ADD PRIMARY KEY (`No_Kursi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
