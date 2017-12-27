#学生表 student
# 学生 id
#学生姓名 name
CREATE TABLE student
(
  id INT(10) PRIMARY KEY  AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL
);
# 学生成绩表
# 成绩id id
# 学生id student_id
# 科目名 lesson
# 成绩 score
CREATE TABLE score
(
  id INT(10) PRIMARY KEY AUTO_INCREMENT,
  student_id INT(10) NOT NULL ,
  lesson VARCHAR(64) NOT NULL ,
  score FLOAT NOT NULL,
  CONSTRAINT score_student_fk_consultant FOREIGN KEY (student_id) REFERENCES student (id)
  ON UPDATE CASCADE
);
