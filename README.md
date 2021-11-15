# SpringCrud
Assignment for spring crud

## Problems
+ application.properties - server.port = 8090


## MySQL Commands
-  CREATE DATABASE studentdb;
-  UPDATE `studentdb`.`student` SET `student_dob` = '', `student_doj` = '' WHERE (`student_id` = '4');
-  UPDATE `studentdb`.`student` SET `student_dob` = '', `student_doj` = '' WHERE (`student_id` = '1');
-  ALTER TABLE `studentdb`.`student` DROP COLUMN `student_id`,DROP PRIMARY KEY;
-  DELETE FROM `studentdb`.`student` WHERE (`student_id` = '1');
-  DELETE FROM `studentdb`.`student` WHERE (`student_id` = '4');
-  ALTER TABLE `studentdb`.`student` CHANGE COLUMN `student_no` `student_no` INT NOT NULL AUTO_INCREMENT ,ADD PRIMARY KEY (`student_no`);
-  ALTER TABLE `studentdb`.`student` CHANGE COLUMN `student_no` `student_no` INT(3) NOT NULL ,CHANGE COLUMN `student_dob` `student_dob` TEXT(30) NULL DEFAULT NULL ,
CHANGE COLUMN `student_doj` `student_doj` DATE NULL DEFAULT NULL ,
CHANGE COLUMN `student_name` `student_name` DATE NULL DEFAULT NULL ;


