-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2025-10-09 03:49:03
-- 伺服器版本： 5.7.24
-- PHP 版本： 8.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫: `iii`
--

-- --------------------------------------------------------

--
-- 資料表結構 `cust`
--

CREATE TABLE `cust` (
  `id` int(10) UNSIGNED NOT NULL,
  `cname` varchar(100) NOT NULL,
  `tel` varchar(100) NOT NULL,
  `birthday` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `cust`
--

INSERT INTO `cust` (`id`, `cname`, `tel`, `birthday`) VALUES
(1, 'Brad', '1234567', '1999-01-02'),
(2, 'Andy', '7654321', '1999-02-03'),
(3, 'Vivian', '333', '1999-04-05'),
(4, 'Tony', '123', '1999-04-05'),
(7, 'Mark', '222', '1999-10-10');

-- --------------------------------------------------------

--
-- 資料表結構 `gift`
--

CREATE TABLE `gift` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(100) NOT NULL,
  `feature` text NOT NULL,
  `city` varchar(100) NOT NULL,
  `town` varchar(100) NOT NULL,
  `addr` varchar(1000) NOT NULL,
  `lat` double NOT NULL,
  `lng` double NOT NULL,
  `picurl` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `cust`
--
ALTER TABLE `cust`
  ADD PRIMARY KEY (`id`);

--
-- 資料表索引 `gift`
--
ALTER TABLE `gift`
  ADD PRIMARY KEY (`id`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `cust`
--
ALTER TABLE `cust`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `gift`
--
ALTER TABLE `gift`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
