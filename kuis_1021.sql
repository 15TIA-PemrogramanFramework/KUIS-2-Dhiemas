-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 15.53
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1021`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1021`
--

CREATE TABLE `identitas_1021` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1021`
--

INSERT INTO `identitas_1021` (`id`, `alamat`, `nama`, `prodi`) VALUES
(11, 'Jl.Sepakat No 3', 'Dhiemas Oktara', 'Teknik Informatika'),
(12, 'Jl.Berdikari', 'Osby Suganda', 'Teknik Informatika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1021`
--

CREATE TABLE `ipk_1021` (
  `id` bigint(20) NOT NULL,
  `matkul` varchar(100) NOT NULL,
  `nilai` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `identitas_1021_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1021`
--
ALTER TABLE `identitas_1021`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_mqoenp2q0bc58y24cb6vfpd6s` (`nama`);

--
-- Indexes for table `ipk_1021`
--
ALTER TABLE `ipk_1021`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_70i2hhuix3yk84kl8rgqwoq8o` (`matkul`),
  ADD KEY `FKe6ck3lv6ipvwab1lhi7gvfr9l` (`identitas_1021_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1021`
--
ALTER TABLE `identitas_1021`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `ipk_1021`
--
ALTER TABLE `ipk_1021`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1021`
--
ALTER TABLE `ipk_1021`
  ADD CONSTRAINT `FKe6ck3lv6ipvwab1lhi7gvfr9l` FOREIGN KEY (`identitas_1021_id`) REFERENCES `identitas_1021` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
