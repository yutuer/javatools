/*
Navicat MySQL Data Transfer

Source Server         : 172.16.1.65
Source Server Version : 50530
Source Host           : 172.16.1.65:3306
Source Database       : bpActivity_0001

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2017-03-16 22:46:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activity_fanli
-- ----------------------------
DROP TABLE IF EXISTS `activity_fanli`;
CREATE TABLE `activity_fanli` (
  `notId` int(11) NOT NULL,
  `channelId` varchar(50) NOT NULL,
  `beginTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `ratio` double DEFAULT '0' COMMENT '百分之几(填5表示5%)',
  PRIMARY KEY (`notId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity_fanli
-- ----------------------------
