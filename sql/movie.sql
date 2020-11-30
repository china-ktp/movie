/*
 Navicat Premium Data Transfer

 Source Server         : mysql_db
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : movie

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 30/11/2020 21:31:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for m_admin
-- ----------------------------
DROP TABLE IF EXISTS `m_admin`;
CREATE TABLE `m_admin`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_admin
-- ----------------------------
INSERT INTO `m_admin` VALUES (1, 'admin', 'admin');
INSERT INTO `m_admin` VALUES (2, 'ktp', 'ktpe');

-- ----------------------------
-- Table structure for v_movie
-- ----------------------------
DROP TABLE IF EXISTS `v_movie`;
CREATE TABLE `v_movie`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mvname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电影名称',
  `m_id` int(8) NULL DEFAULT NULL COMMENT '电影类型',
  `des` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '电影描述',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电影封面图',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_movie
-- ----------------------------
INSERT INTO `v_movie` VALUES (1, '八百', NULL, '《八佰》是由华谊兄弟电影有限公司、北京七印象文化传媒有限公司出品，管虎执导，黄志忠、欧豪、王千源、姜武、张译、杜淳、魏晨、李晨、俞灏明等主演的战争题材影片。该片取材于1937年淞沪会战，讲述了被称作“八百壮士”的中国国民革命军第三战区88师524团的一个加强营，固守苏州河畔的四行仓库、阻击日军的故事。该片于2020年8月21日在中国内地上映。', 'http://localhost:10010/movie/images/movie-images/0.png');
INSERT INTO `v_movie` VALUES (2, '一点就到家', NULL, '《一点就到家》是由许宏宇执导，刘昊然、彭昱畅主演的电影，于2020年10月4日在中国内地上映。', 'http://localhost:10010/movie/images/movie-images/1.png');
INSERT INTO `v_movie` VALUES (3, '住在手机里的朋友', NULL, '通信时代，无论是初次相见还是老友重逢，交换联系方式，常常是 彼此交换名片，然后郑重或是出于礼貌用手机记的过客， 通信时代，无论是初次相见还是老友重逢，交换联系方式，常常是彼此交换名片，然后 郑重或是出于礼貌用手机记的过客，这种快餐式的通信时代，无论是初次相见还是老友 重逢，通信时代，无论是初次相见还是老友重种快餐式的这种快餐式的友谊 ...', 'http://localhost:10010/movie/images/movie-images/2.jpg');
INSERT INTO `v_movie` VALUES (4, '海大鱼', NULL, '《海大鱼》是由任英健执导，张予曦、韩栋、贾征宇 、肖向飞 [1] 等主演的玄幻爱情电影。该片已于2020年10月30日在腾讯视频上线播出。该片讲述了渔女阿狸与海大鱼之间所发生的爱恨情仇的故事。', 'http://localhost:10010/movie/images/movie-images/3.png');
INSERT INTO `v_movie` VALUES (5, '小时代', NULL, '《小时代》是由郭敬明执导，杨幂、柯震东、郭采洁、郭碧婷等领衔主演的青春时尚都市电影，该片是《小时代》系列电影的第一部。该片根据郭敬明同名小说《小时代》改编，影片以上海为背景，讲述四个从小感情深厚、有着不同价值观和人生观的女生，经历了友情、爱情、亲情的巨大转变。在一个宿舍朝夕相处的四个女生，开始找工作实习的忙碌生活，面对巨大压力，在看似平静的校园相继发生着让她们措手不及的故事', 'http://localhost:10010/movie/images/movie-images/4.jpg');
INSERT INTO `v_movie` VALUES (6, '战狼', NULL, '《战狼Ⅱ》是吴京执导的动作军事电影，由吴京、弗兰克·格里罗、吴刚、张翰、卢靖姗、淳于珊珊、丁海峰等主演。该片于2017年7月27日在中国内地上映 。2020年3月20日，《战狼Ⅱ》重映。该片讲述了脱下军装的冷锋被卷入了一场非洲国家的叛乱，本来能够安全撤离的他无法忘记军人的职责，', 'http://localhost:10010/movie/images/movie-images/5.jpg');

-- ----------------------------
-- Table structure for v_movie_type
-- ----------------------------
DROP TABLE IF EXISTS `v_movie_type`;
CREATE TABLE `v_movie_type`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `vname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_movie_type
-- ----------------------------
INSERT INTO `v_movie_type` VALUES (1, '搞笑');
INSERT INTO `v_movie_type` VALUES (2, '惊悚');
INSERT INTO `v_movie_type` VALUES (3, '爱情');
INSERT INTO `v_movie_type` VALUES (4, '综艺');
INSERT INTO `v_movie_type` VALUES (5, '恐怖');

-- ----------------------------
-- Table structure for v_user
-- ----------------------------
DROP TABLE IF EXISTS `v_user`;
CREATE TABLE `v_user`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `sex` int(1) NULL DEFAULT NULL COMMENT '性别:1男0女',
  `vname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_user
-- ----------------------------
INSERT INTO `v_user` VALUES (1, '18402994746', '123456', '22@qq.com', 'test', 1, 'ktp');
INSERT INTO `v_user` VALUES (29, '18402994747', '123456', '11@qq.com', 'test', 1, 'user');

SET FOREIGN_KEY_CHECKS = 1;
