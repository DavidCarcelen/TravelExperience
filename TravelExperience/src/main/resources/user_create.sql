CREATE SCHEMA `travelexperience` ;

USE mysql;

CREATE USER 'deep'@'localhost' IDENTIFIED BY 'deep123';

GRANT ALL PRIVILEGES ON travelexperience.* TO 'deep'@'localhost';
FLUSH PRIVILEGES;

GRANT ALL PRIVILEGES ON test_db.* TO 'deep'@'localhost';
FLUSH PRIVILEGES;
