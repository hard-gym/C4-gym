#1
CREATE TABLE cqupt_student(
                              studentid VARCHAR(10),
                              NAME VARCHAR(20),
                              sex VARCHAR(2),
                              age INTEGER,
                              Fee DECIMAL(10,2),
                              address VARCHAR(50),
                              memo VARCHAR(300)
);
#2
CREATE TABLE IF NOT EXISTS CourseAa(
    Aa1 VARCHAR(20),
    Aa2 INTEGER,
    Aa3 DECIMAL(10)
    );
#3
CREATE TABLE IF NOT EXISTS ChooseBb(
    Bb1 VARCHAR(30),
    Bb2 INTEGER,
    Bb3 DECIMAL(6)
    );
#4
ALTER TABLE chooseBb ADD Bb4 VARCHAR(20);
ALTER TABLE chooseBb MODIFY Bb4 VARCHAR(20) NOT NULL;
#5
ALTER TABLE chooseBb ADD Bb5 VARCHAR(10);
ALTER TABLE chooseBb MODIFY Bb5 VARCHAR(10) PRIMARY KEY;
#6
CREATE VIEW view_chooseBb(View_bb1,View_bb2,view_bb3)
AS SELECT Bb1,Bb4,Bb5
FROM chooseBb;
#7
DROP VIEW view_chooseBb;
#8
CREATE INDEX index_indexbb2 ON chooseBb(Bb2 ASC);
CREATE INDEX index_indexbb4 ON chooseBb(Bb4 DESC);
#9
DROP INDEX index_bb2 ON chooseBb;
#10
CREATE TABLE test(
                     NAME VARCHAR(20),
                     Age INTEGER,
                     Score NUMERIC(10,2),
                     Address VARCHAR(60)
);
#11
INSERT INTO test
(NAME,Age,Score,Address)
VALUES
('赵一',20,580.00,'重邮宿舍 12-3-5'),
('钱二',19,540.00,'南福苑 5-2-9'),
('孙三',21,555.50,'学生新区 21-5-15'),
('李四',22,505.00,'重邮宿舍 8-6-22'),
('周五',20,495.50,'学生新区 23-4-8'),
('吴六',19,435.00,'南福苑 2-5-12');
#12
CREATE TABLE test_temp(
                          NAME VARCHAR(20),
                          Age INTEGER,
                          Score NUMERIC(10,2),
                          Address VARCHAR(60)
);
#13
INSERT INTO test_temp(NAME,Age,Score,Address) VALUES
('郑七',21,490.50,'重邮宿舍 11-2-1'),
('张八',20,560.00,'南福苑 3-3-3'),
('王九',10,515.00,'学生新区 19-7-1');
#14
INSERT INTO test SELECT * FROM test_temp;
#15
UPDATE test SET Age=Age+5 WHERE Age<=20;
#16
UPDATE test SET Age=Age-1 WHERE Address LIKE '南福苑%';
#17
DELETE FROM test WHERE Age>=21&&Score>=500.00;
#18
DELETE FROM test WHERE Score<550&&Address LIKE '重邮宿舍%';
#19
CREATE TABLE Student(
                        SNO VARCHAR(20),
                        NAME VARCHAR(10),
                        Age INTEGER,
                        College VARCHAR(30)
);
#20
CREATE TABLE Course(
                       CourseID VARCHAR(15),
                       CourseName VARCHAR(30),
                       CourseBeforeID VARCHAR(15)
);
#21
CREATE TABLE Choose(
                       SNO VARCHAR(20),
                       CourseID VARCHAR(30),
                       Score DECIMAL(5,2)
);
#22
INSERT INTO Student(SNO,NAME,Age,College)
VALUES
('S00001','张三',20,'计算机学院'),
('S00002','李四',19,'通信学院'),
('S00003','王五',21,'计算机学院');
#23
INSERT INTO Course(CourseID,CourseName,CourseBeforeID)
VALUES
('C1','计算机引论',NULL),
('C2','C语言','C1'),
('C3','数据结构','C2');
#24
INSERT INTO Choose(SNO,CourseID,Score)
VALUES
('S00001','C1',95),
('S00001','C2',80),
('S00001','C3',84),
('S00002','C1',80),
('S00002','C2',85),
('S00003','C1',78),
('S00003','C3',70);
#25
SELECT SNO,NAME FROM Student;
#26
select *from student where Age between 20 and 23;
#27
SELECT COUNT(SNO) FROM Student;
#28
SELECT MAX(Score),MIN(Score),SUM(Score),AVG(Score) FROM Choose;
#29
SELECT CourseID,CourseName FROM Course WHERE CourseBeforeID IS NULL;
#30
SELECT Student.*,Course.*,Choose.*
FROM Student,Course,Choose
WHERE Student.`SNO`=Choose.`SNO`&&Choose.`CourseID`=Course.`CourseID`
#31
SELECT * FROM Student a WHERE EXISTS ( SELECT 1 FROM student b WHERE b.name='张三'AND b.college=a.college)  -- 用 SELECT 的存在量词 EXISTS，查询与“张三”在同一个学院学习的学生
    信息
#32
SELECT SNO,Score FROM Choose WHERE CourseID='C1'&&Score<ANY(SELECT Score FROM Student,Choose WHERE Student.`SNO`=Choose.`SNO`&&NAME='张三');
#33
SELECT SNO FROM Choose WHERE CourseID='C1' UNION SELECT SNO FROM Choose WHERE CourseID='C3';
#34
SELECT DISTINCT SNO FROM choose WHERE CourseID='C1' UNION SELECT DISTINCT SNO FROM choose WHERE CourseID='C3';
SELECT DISTINCT SNO FROM student WHERE SNO IN(SELECT SNO FROM choose WHERE CourseID='C1') UNION SELECT DISTINCT SNO FROM student WHERE SNO IN (SELECT SNO FROM choose WHERE CourseID='C3');
