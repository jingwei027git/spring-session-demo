CREATE TABLE `user` (
    `ID` bigint(20) NOT NULL AUTO_INCREMENT,
    `USERNAME` varchar(50) NOT NULL,
    `PASSWORD` varchar(100) NOT NULL,
    `EXPIRE_DATE_TIME` datetime NOT NULL,
    `STATUS` varchar(1) NOT NULL DEFAULT 'Y',
    PRIMARY KEY (`ID`)
) DEFAULT CHARSET=utf8mb4;

-- softpower / 11111
INSERT INTO `user` VALUES (
    NULL,
    'softpower',
    '$2a$10$fNBawu0c0kU3LkR/KKBij.dBfxpZG.ioBsEy304dX61l.7H2.PXYK',
    '2020-01-01 00:00:00',
    'Y');

-- eddie / 12345
INSERT INTO `user` VALUES (
    NULL,
    'eddie',
    '$2a$10$YjbXtA7Mca9JAvcxRzklwOa3J0V4yrBVq6X.emvEbKhfuK8jjLfVa',
    '2020-01-01 00:00:00',
    'Y');

-- david / 13579
INSERT INTO `user` VALUES (
    NULL,
    'david',
    '$2a$10$iyf/B2OOlwEeL9tX6Ld5tevrlGVCB03QwIZpgbEAL4U9DcZyGaoWa',
    '2020-01-01 00:00:00',
    'Y');

-- chad / 2468a
INSERT INTO `user` VALUES (
    NULL,
    'chad',
    '$2a$10$vBos3no8K4Oa7T57q2Ly/eemlm/NzFuo9sF4aDS1VarSUgOlzYEEm',
    '2020-01-01 00:00:00',
    'Y');
