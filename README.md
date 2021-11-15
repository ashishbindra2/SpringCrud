# SpringCrud
Assignment for spring crud

## Problems
+ application.properties - server.port = 8090


## MySQL Commands
-  CREATE DATABASE studentdb;
-  UPDATE `studentdb`.`student` SET `student_dob` = '', `student_doj` = '' WHERE (`student_id` = '4');
-  UPDATE `studentdb`.`student` SET `student_dob` = '', `student_doj` = '' WHERE (`student_id` = '1');
-  ALTER TABLE `studentdb`.`student` DROP COLUMN `student_id`,DROP PRIMARY KEY;
