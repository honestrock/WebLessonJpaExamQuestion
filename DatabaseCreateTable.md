WebLessonJpaExamQuestion
========================

JPA- Simple 

Database Schema WebDers

CREATE TABLE WebDers.`BOOK` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AUTHOR` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PRICE` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
