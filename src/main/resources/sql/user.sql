create schema if not exists `mybatisplus`;

CREATE TABLE `mybatisplus`.`user` (
                        `id` bigint(20) auto_increment NOT NULL COMMENT '主键ID' primary key,
                        `name` varchar(30) DEFAULT NULL COMMENT '姓名',
                        `age` int(11) DEFAULT NULL COMMENT '年龄',
                        `email` varchar(50) DEFAULT NULL COMMENT '邮箱'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
