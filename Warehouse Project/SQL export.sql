-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: warehouse
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fabric`
--

DROP TABLE IF EXISTS `fabric`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fabric` (
  `id` bigint(20) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `colour` varchar(255) DEFAULT NULL,
  `composition` varchar(255) DEFAULT NULL,
  `producer` varchar(255) DEFAULT NULL,
  `texture` varchar(255) DEFAULT NULL,
  `warehouse_id` bigint(20) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1yb1vp5r9ma8bfrknsyn9meba` (`warehouse_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabric`
--

LOCK TABLES `fabric` WRITE;
/*!40000 ALTER TABLE `fabric` DISABLE KEYS */;
INSERT INTO `fabric` VALUES (1,'Climacool','blue','100% wool','Coolfabrics','plain',15,2000),(2,'Climacool','red','100% wool','Coolfabrics','plain',16,1000),(3,'Climacool','pink','100% wool','Coolfabrics','plain',15,1500),(4,'Climacool','pink','100% cotton','Coolfabrics','plain',15,800),(5,'Climacool','white','100% cotton','Coolfabrics','plain',16,800),(6,'Climacool','black','100% cotton','Coolfabrics','plain',16,1200),(7,'Climacool','black','100% cotton','Coolfabrics','stripes',15,1200),(8,'Warmclima','black','80% wool & 20% cashmere','Coolfabrics','plain',15,1200),(9,'Warmclima','white','80% wool & 20% cashmere','Coolfabrics','plain',15,2000),(10,'Warmclima','blue','80% wool & 20% cashmere','Coolfabrics','plain',16,2500),(11,'Stren','white','100% cotton','Strene','plain',16,3000),(12,'Stren','black','100% cotton','Strene','plain',16,4200);
/*!40000 ALTER TABLE `fabric` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goods`
--

DROP TABLE IF EXISTS `goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL,
  `colour` varchar(255) DEFAULT NULL,
  `ordercode` varchar(255) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `texture` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `warehouse_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmr2ssnsreufmrtp0p4ci0fnpq` (`warehouse_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods`
--

LOCK TABLES `goods` WRITE;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (17),(17),(17),(17);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `material` (
  `id` bigint(20) NOT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  `specs` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `warehouse_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnl33wf7um0u6h3og6dm5syslc` (`warehouse_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (13,'2000','100% cotton','labels',15);
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse`
--

DROP TABLE IF EXISTS `warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `warehouse` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse`
--

LOCK TABLES `warehouse` WRITE;
/*!40000 ALTER TABLE `warehouse` DISABLE KEYS */;
INSERT INTO `warehouse` VALUES (15,'Sofia'),(16,'Varna');
/*!40000 ALTER TABLE `warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse_fabrics`
--

DROP TABLE IF EXISTS `warehouse_fabrics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `warehouse_fabrics` (
  `warehouse_id` bigint(20) NOT NULL,
  `fabrics_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_tpmwwa29m978474rcyua9wnou` (`fabrics_id`),
  KEY `FKrwmmau668xqxduei186xdm5km` (`warehouse_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse_fabrics`
--

LOCK TABLES `warehouse_fabrics` WRITE;
/*!40000 ALTER TABLE `warehouse_fabrics` DISABLE KEYS */;
/*!40000 ALTER TABLE `warehouse_fabrics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse_goods`
--

DROP TABLE IF EXISTS `warehouse_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `warehouse_goods` (
  `warehouse_id` bigint(20) NOT NULL,
  `goods_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_c8l6en8fdm707e6os41w6pkfn` (`goods_id`),
  KEY `FKbf2w2i6ka1899d9l90ncn9h4f` (`warehouse_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse_goods`
--

LOCK TABLES `warehouse_goods` WRITE;
/*!40000 ALTER TABLE `warehouse_goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `warehouse_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse_materials`
--

DROP TABLE IF EXISTS `warehouse_materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `warehouse_materials` (
  `warehouse_id` bigint(20) NOT NULL,
  `materials_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_psvmpx51oupvrc4g6uxttcu34` (`materials_id`),
  KEY `FK7tju81mmc22w3xbqvymdc6f9s` (`warehouse_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse_materials`
--

LOCK TABLES `warehouse_materials` WRITE;
/*!40000 ALTER TABLE `warehouse_materials` DISABLE KEYS */;
/*!40000 ALTER TABLE `warehouse_materials` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-31 18:17:07
