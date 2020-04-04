DROP TABLE IF EXISTS `t_chengji`;
CREATE TABLE `t_chengji`
(
    `id`         int(11) NOT NULL AUTO_INCREMENT,
    `student_id` varchar(20)   DEFAULT NULL,
    `shijuan_id` varchar(20)   DEFAULT NULL,
    `stat`       varchar(2)    DEFAULT NULL,
    `answer`     varchar(1000) DEFAULT NULL,
    `result`     varchar(3)    DEFAULT NULL,
    `clazz_id`   int(11)       DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `t_chengji_un` (`student_id`, `shijuan_id`),
    KEY `t_chengji_clazz_id_IDX` (`clazz_id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_chengji` WRITE;

INSERT INTO `t_chengji`
VALUES (1, ''1'', ''1'', NULL, NULL, ''70'', 2),
       (6, ''1'', ''11'', NULL, NULL, ''0'', 2);
UNLOCK TABLES;


DROP TABLE IF EXISTS `t_clazz`;
CREATE TABLE `t_clazz`
(
    `id`    int(11) NOT NULL AUTO_INCREMENT,
    `grade` varchar(2)  DEFAULT NULL,
    `clazz` varchar(10) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `t_clazz_un` (`grade`, `clazz`),
    KEY `t_clazz_grade_IDX` (`grade`, `clazz`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_clazz` WRITE;

INSERT INTO `t_clazz`
VALUES (2, ''1'', ''2''),
       (3, ''1'', ''3''),
       (4, ''1'', ''4'');

UNLOCK TABLES;



DROP TABLE IF EXISTS `t_kemu`;
CREATE TABLE `t_kemu`
(
    `id`      int(11) NOT NULL AUTO_INCREMENT,
    `miaoshu` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `t_kemu_un` (`miaoshu`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_kemu` WRITE;

INSERT INTO `t_kemu`
VALUES (3, ''c''),
       (2, ''java''),
       (4, ''python'');
UNLOCK TABLES;


DROP TABLE IF EXISTS `t_shijuan`;
CREATE TABLE `t_shijuan`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `name`        varchar(100)  DEFAULT NULL,
    `question_id` varchar(1000) DEFAULT NULL,
    `clazz`       varchar(3)    DEFAULT NULL,
    `grade`       varchar(3)    DEFAULT NULL,
    `kemu`        varchar(100)  DEFAULT NULL,
    `year`        varchar(4)    DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `t_shijuan_clazz_IDX` (`clazz`) USING BTREE,
    KEY `t_shijuan_banji_IDX` (`grade`) USING BTREE,
    KEY `t_shijuan_kemu_IDX` (`kemu`) USING BTREE,
    KEY `t_shijuan_year_IDX` (`year`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 22
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_shijuan` WRITE;
INSERT INTO `t_shijuan`
VALUES (1, ''java'', ''2, 15 '', ''2'', ''1'', ''java'', ''2020''),
       (11, ''第一次考试'', ''2, 16 '', ''2'', ''1'', ''java'', ''2020''),
       (17, NULL, NULL, NULL, NULL, NULL, NULL),
       (18, NULL, NULL, NULL, NULL, NULL, NULL),
       (19, NULL, NULL, NULL, NULL, NULL, NULL),
       (20, NULL, NULL, NULL, NULL, NULL, NULL),
       (21, NULL, NULL, NULL, NULL, NULL, NULL);
UNLOCK TABLES;


DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`
(
    `id`    int(11) NOT NULL AUTO_INCREMENT,
    `name`  varchar(100) DEFAULT NULL,
    `grade` varchar(2)   DEFAULT NULL,
    `clazz` varchar(3)   DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `t_student_clazz_IDX` (`clazz`, `grade`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 25
  DEFAULT CHARSET = utf8mb4;

LOCK TABLES `t_student` WRITE;
INSERT INTO `t_student`
VALUES (1, ''qqqqqqqqqqqq'', ''1'', ''2''),
       (2, ''wwwwwwwwwwwwwwwwwww'', ''1'', ''1''),
       (3, ''ee11'', ''1'', ''1'');
UNLOCK TABLES;


DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher`
(
    `id`   int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(40) DEFAULT NULL,
    `flag` varchar(3)  DEFAULT '' 0 '',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_teacher` WRITE;
INSERT INTO `t_teacher`
VALUES (1, ''bbb'', ''0''),
       (4, ''nnn'', ''0''),
       (5, ''ssss'', ''1'');
UNLOCK TABLES;



DROP TABLE IF EXISTS `t_teacher_clazz_kemu`;
CREATE TABLE `t_teacher_clazz_kemu`
(
    `id`         int(11) NOT NULL AUTO_INCREMENT,
    `teacher_id` int(11) DEFAULT NULL,
    `clazz_id`   int(11) DEFAULT NULL,
    `kemu_id`    int(11) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `t_teacher_clazz_kemu_un` (`teacher_id`, `clazz_id`, `kemu_id`),
    KEY `t_teacher_clazz_tearher_id_IDX` (`teacher_id`) USING BTREE,
    KEY `t_teacher_clazz_clazz_id_IDX` (`clazz_id`) USING BTREE,
    KEY `t_teacher_clazz_kemu_kemu_id_IDX` (`kemu_id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = utf8mb4;

LOCK TABLES `t_teacher_clazz_kemu` WRITE;

INSERT INTO `t_teacher_clazz_kemu`
VALUES (3, 1, 3, 2),
       (2, 1, 3, 4),
       (1, 1, 4, 2);
UNLOCK TABLES;



DROP TABLE IF EXISTS `t_teacher_kemu`;
CREATE TABLE `t_teacher_kemu`
(
    `id`         int(11) NOT NULL AUTO_INCREMENT,
    `teacher_id` int(11) DEFAULT NULL,
    `kemu_id`    int(11) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `t_teacher_kemu_teacher_id_IDX` (`teacher_id`) USING BTREE,
    KEY `t_teacher_kemu_kemu_id_IDX` (`kemu_id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_teacher_kemu` WRITE;
UNLOCK TABLES;



DROP TABLE IF EXISTS `t_tiku`;
CREATE TABLE `t_tiku`
(
    `id`       int(11) NOT NULL AUTO_INCREMENT,
    `question` text         DEFAULT NULL,
    `answers`  varchar(100) DEFAULT NULL,
    `answer`   varchar(10)  DEFAULT NULL,
    `kemu`     varchar(100) DEFAULT NULL,
    `grade`    varchar(3)   DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `t_tiku_grade_IDX` (`grade`, `kemu`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 22
  DEFAULT CHARSET = utf8mb4;


LOCK TABLES `t_tiku` WRITE;
INSERT INTO `t_tiku`
VALUES (2, ''dddddddd'', ''aa, bb, cc, dd '', ''D'', ''python'', ''1''),
       (16, ''jjjd<br>fff<br>jjj'', ''aa, bb, cc, dd '', ''B'', ''c'', ''1''),
       (20, ''dkalfei<br>'', ''aa, bb, cc, dd '', ''A'', ''python'', ''1''),
       (21, ''ddkkdkd'', ''aa, bb, cc, dd '', ''A'', ''java'', ''1'');
UNLOCK TABLES;