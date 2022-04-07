DROP DATABASE IF EXISTS db100;

CREATE DATABASE IF NOT EXISTS db100;
USE db100;

CREATE TABLE board 
(
  no INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(45) NULL,
  contents VARCHAR(45) NULL
);

insert into board(title,contents) values('title1','contents1');
insert into board(title,contents) values('title2','contents2');
insert into board(title,contents) values('title3','contents3');
insert into board(title,contents) values('title4','contents4');
insert into board(title,contents) values('title5','contents5');
insert into board(title,contents) values('title6','contents6');
insert into board(title,contents) values('title7','contents7');
insert into board(title,contents) values('title8','contents8');
insert into board(title,contents) values('title9','contents9');
insert into board(title,contents) values('title10','contents10');
insert into board(title,contents) values('title11','contents11');
insert into board(title,contents) values('title12','contents12');