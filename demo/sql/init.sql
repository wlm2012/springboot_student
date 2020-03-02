CREATE TABLE `t_chengji` (
                             `id` int(11) NOT NULL AUTO_INCREMENT,
                             `student_id` varchar(20) DEFAULT NULL,
                             `shijuan_id` varchar(20) DEFAULT NULL,
                             `stat` varchar(2) DEFAULT NULL,
                             `answer` varchar(1000) DEFAULT NULL,
                             `result` varchar(3) DEFAULT NULL,
                             `clazz_id` int(11) DEFAULT NULL,
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `t_chengji_un` (`student_id`,`shijuan_id`),
                             KEY `t_chengji_clazz_id_IDX` (`clazz_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_clazz` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `grade` varchar(2) DEFAULT NULL,
                           `clazz` varchar(10) DEFAULT NULL,
                           PRIMARY KEY (`id`),
                           KEY `t_clazz_grade_IDX` (`grade`,`clazz`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_kemu` (
                          `id` int(11) NOT NULL AUTO_INCREMENT,
                          `miaoshu` varchar(100) DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_shijuan` (
                             `id` int(11) NOT NULL AUTO_INCREMENT,
                             `question_id` varchar(1000) DEFAULT NULL,
                             `clazz` varchar(3) DEFAULT NULL,
                             `grade` varchar(3) DEFAULT NULL,
                             `kemu` varchar(3) DEFAULT NULL,
                             PRIMARY KEY (`id`),
                             KEY `t_shijuan_clazz_IDX` (`clazz`) USING BTREE,
                             KEY `t_shijuan_banji_IDX` (`grade`) USING BTREE,
                             KEY `t_shijuan_kemu_IDX` (`kemu`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_student` (
                             `id` int(11) NOT NULL AUTO_INCREMENT,
                             `name` varchar(100) DEFAULT NULL,
                             `grade` varchar(2) DEFAULT NULL,
                             `clazz` varchar(3) DEFAULT NULL,
                             PRIMARY KEY (`id`),
                             KEY `t_student_clazz_IDX` (`clazz`,`grade`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_teacher` (
                             `id` int(11) NOT NULL AUTO_INCREMENT,
                             `name` varchar(40) DEFAULT NULL,
                             `flag` varchar(3) DEFAULT NULL,
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_teacher_clazz` (
                                   `id` int(11) NOT NULL AUTO_INCREMENT,
                                   `tearher_id` int(11) DEFAULT NULL,
                                   `clazz_id` int(11) DEFAULT NULL,
                                   PRIMARY KEY (`id`),
                                   KEY `t_teacher_clazz_tearher_id_IDX` (`tearher_id`) USING BTREE,
                                   KEY `t_teacher_clazz_clazz_id_IDX` (`clazz_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_teacher_kemu` (
                                  `id` int(11) NOT NULL AUTO_INCREMENT,
                                  `teacher_id` int(11) DEFAULT NULL,
                                  `kemu_id` int(11) DEFAULT NULL,
                                  PRIMARY KEY (`id`),
                                  KEY `t_teacher_kemu_teacher_id_IDX` (`teacher_id`) USING BTREE,
                                  KEY `t_teacher_kemu_kemu_id_IDX` (`kemu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_tiku` (
                          `id` int(11) NOT NULL AUTO_INCREMENT,
                          `question` text DEFAULT NULL,
                          `answer` varchar(10) DEFAULT NULL,
                          `kemu` varchar(10) DEFAULT NULL,
                          `grade` varchar(3) DEFAULT NULL,
                          PRIMARY KEY (`id`),
                          KEY `t_tiku_grade_IDX` (`grade`,`kemu`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;





INSERT INTO student.t_student
(id, name, grade, clazz)
VALUES(1, 'qqqqqqqqqqqq', '1', '2');
INSERT INTO student.t_student
(id, name, grade, clazz)
VALUES(2, 'wwwwwwwwwwwwwwwwwww', '1', '1');
INSERT INTO student.t_student
(id, name, grade, clazz)
VALUES(3, 'ee', '1', '1');


INSERT INTO student.t_clazz
(id, grade, clazz)
VALUES(1, '1', '1');
INSERT INTO student.t_clazz
(id, grade, clazz)
VALUES(2, '1', '2');



