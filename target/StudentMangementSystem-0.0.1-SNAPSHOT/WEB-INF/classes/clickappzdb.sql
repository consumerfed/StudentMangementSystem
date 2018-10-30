/*
SQLyog Community Edition- MySQL GUI v8.03 
MySQL - 5.1.32-community : Database - clickappzdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`clickappzdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `clickappzdb`;

/*Table structure for table `course_details` */

DROP TABLE IF EXISTS `course_details`;

CREATE TABLE `course_details` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'course id',
  `course_name` varchar(100) DEFAULT NULL,
  `course_description` varchar(100) DEFAULT NULL,
  `course_eligiblity` varchar(55) DEFAULT NULL,
  `course_min_age` int(11) DEFAULT NULL,
  `course_max_age` int(11) DEFAULT NULL,
  `course_status` char(1) DEFAULT 'A' COMMENT 'A - if course is availalbe',
  `course_created` datetime DEFAULT NULL,
  `course_updated` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `course_created_by` int(11) DEFAULT NULL COMMENT 'user who created the course',
  `course_strength` int(11) DEFAULT NULL COMMENT 'maximum stength of the course',
  `course_duration` int(11) DEFAULT NULL COMMENT 'duration of the course in month',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Table structure for table `student_course_details` */

DROP TABLE IF EXISTS `student_course_details`;

CREATE TABLE `student_course_details` (
  `student_course_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_course_id`),
  KEY `FK_course_course_details` (`course_id`),
  KEY `FK_student_course_details` (`student_id`),
  CONSTRAINT `FK_course_course_details` FOREIGN KEY (`course_id`) REFERENCES `course_details` (`course_id`),
  CONSTRAINT `FK_student_course_details` FOREIGN KEY (`student_id`) REFERENCES `student_details` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `student_details` */

DROP TABLE IF EXISTS `student_details`;

CREATE TABLE `student_details` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_roll_no` varchar(12) NOT NULL DEFAULT '' COMMENT '19MCA012',
  `student_name` varchar(100) DEFAULT NULL,
  `student_dob` date DEFAULT NULL,
  `student_qualification` varchar(55) DEFAULT NULL,
  `student_address` varchar(150) DEFAULT NULL,
  `student_father_name` varchar(100) DEFAULT NULL,
  `student_status` char(1) DEFAULT NULL COMMENT 'A - approved B- blocked',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
