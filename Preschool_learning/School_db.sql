-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 27, 2017 at 05:38 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `school_db`
--
CREATE DATABASE `school_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `school_db`;

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE IF NOT EXISTS `answers` (
  `answer_id` int(11) NOT NULL,
  `answer` varchar(80) DEFAULT NULL,
  `correct` tinyint(1) DEFAULT NULL,
  `questionFK` int(11) NOT NULL,
  PRIMARY KEY (`answer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `answers`
--

INSERT INTO `answers` (`answer_id`, `answer`, `correct`, `questionFK`) VALUES
(1, 'two', NULL, 1),
(2, 'seven', NULL, 1),
(3, 'six', 1, 1),
(4, 'three', NULL, 1),
(5, 'six', NULL, 2),
(6, 'two', NULL, 2),
(7, 'three', NULL, 2),
(8, 'one', 1, 2),
(9, 'three', 1, 3),
(10, 'two', NULL, 3),
(11, 'five', NULL, 3),
(12, 'one', NULL, 3),
(13, 'ten', NULL, 4),
(14, 'eleven', 1, 4),
(15, 'five', NULL, 4),
(16, 'seven', NULL, 4);

-- --------------------------------------------------------

--
-- Table structure for table `question_tbl`
--

CREATE TABLE IF NOT EXISTS `question_tbl` (
  `type` varchar(40) NOT NULL,
  `question` varchar(100) NOT NULL,
  `ans1` varchar(50) NOT NULL,
  `ans2` varchar(50) NOT NULL,
  `ans3` varchar(50) NOT NULL,
  `ans4` varchar(50) NOT NULL,
  `c_ans` varchar(50) NOT NULL,
  `alt` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question_tbl`
--

INSERT INTO `question_tbl` (`type`, `question`, `ans1`, `ans2`, `ans3`, `ans4`, `c_ans`, `alt`) VALUES
('math', 'Subtract : 10-1', '7', '5', '9', '3', '9', ''),
('math', 'Add : 5+3', '9', '3', '7', '8', '8', ''),
('math', 'Multiply: 4*3', '15', '12', '9', '14', '12', ''),
('math', 'Divide : 9/3', '5', '2', '3', '0', '3', ''),
('math', 'Modules : 15%2', '1', '4', '2', '6', '1', ''),
('english', 'A for', 'Apple', 'Mango', 'Banana', 'Orange', 'Apple', 'Animal'),
('english', 'What Become After F', 'B', 'K', 'G', 'H', 'G', 'Green'),
('english', 'F for', 'Fish', 'Apple', 'banana', 'Horse', 'Fish', 'Flag'),
('month', 'What Become After June', 'January', 'March', 'July', 'December', 'July', ''),
('month', 'What Become Before December', 'November', 'January', 'June', 'Febuary', 'November', ''),
('week', 'What Become After Sunday', 'Monday', 'Friday', 'Tuesday', 'Thrusdy', 'Monday', ''),
('week', 'What Become Before Satuday', 'Thrusday', 'Monday', 'Sunday', 'Friday', 'Friday', '');
