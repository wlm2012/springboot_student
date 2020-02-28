
CREATE TABLE `t_student` (
  `code` varchar(20) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `nianji` varchar(2) DEFAULT NULL,
  `banji` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `t_clazz` (
  `clazz` varchar(10) DEFAULT NULL,
  `banji` varchar(3) DEFAULT NULL,
  `nianji` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `t_teacher` (
  `name` varchar(40) DEFAULT NULL,
  `kemu` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `t_tiku` (
  `bianhao` varchar(10) DEFAULT NULL,
  `leixing` varchar(2) DEFAULT NULL,
  `daan` varchar(100) DEFAULT NULL,
  `mekubianhao` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `t_shijuan` (
  `bianhao` varchar(10) DEFAULT NULL,
  `timubianhao` varchar(10) DEFAULT NULL,
  `clazz` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `t_kemu` (
  `bianhao` varchar(3) DEFAULT NULL,
  `miaoshu` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `t_chengji` (
  `xueshengbianhao` varchar(20) DEFAULT NULL,
  `chengji` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

