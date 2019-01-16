CREATE DATABASE  IF NOT EXISTS `desastres` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `desastres`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: desastres
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `habilitado` tinyint(4) DEFAULT NULL,
  `tipo_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `tipo_usu_idx` (`tipo_usuario`),
  CONSTRAINT `tip_us` FOREIGN KEY (`tipo_usuario`) REFERENCES `tipo_usuario` (`idtipo_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'gaston','graziani','g@gmail.com','Ggraziani','otto',0,1),(2,'otto','otto','otto@gmail.com','otto','otto',0,0),(3,'Gaston','Graziani','grazianigaston@gma','','',0,1),(4,'a','a','aasdasd','aaaaaaaaaaaa2','aaaaaaaa221a',0,1),(5,'asd','asdas','asd','asd1213as','asdd112123as',0,1),(6,'asdasdasd','asdasdas','a','asdsadasdasd','asdasdd123123',0,1),(7,'asdasd','asdasd','a','asdsad2132','asdasd12312312',0,1),(8,'asdasd','asdasd','a','asdsad2132','asdasd12312312',0,1),(9,'asdasd','asdasd','a','asdasdasasd','asdasd123',0,1),(10,'aa','aa','asdasd','aasdasd123@1.com','asdsd132213',0,1),(11,'aa','aa','asdasd','aasdasd123@1.com','asdsd132213',0,1),(12,'asdasd','asdasdds','aa','asdasdasd12321','asdasd123',0,1),(13,'asdasd','asdasd','a','asdasdasd','asdasdasd12312',0,1),(14,'saddasads','asdsad','assdsa@otto.com','asdasdasdasd','otto1234',0,1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-16 19:30:15
