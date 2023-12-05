show databases;

# 데이터 베이스 만들기
CREATE database jdbc;

show databases;

# 데이터 베이스 사용하기
use jdbc;

# 테이블 만들기
# student_info 테이블 / 기본키 - std_id(varchar(100))
CREATE TABLE jdbc.student_info (
	std_id VARCHAR(100) NOT NULL, # 아이디
    std_name VARCHAR(100) NOT NULL, # 이름
    std_age INT NOT NULL, # 나이
    std_grade INT NOT NULL, # 학년
    std_gender VARCHAR(50) NOT NULL, # 성별
    std_phone VARCHAR(100) DEFAULT '', #번호
    PRIMARY KEY(std_id)
);

show tables;

# 테이블 내용 입력
INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202301','홍길동', 18, 2, '남자', '010-2989-5454');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202302','김철수', 20, 4, '남자', '010-1234-1234');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202303','황영수', 17, 1, '남자', '010-1234-5678');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202304','박수양', 18, 2, '여자', '010-1111-0000');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202305','황지호', 19, 3, '남자', '010-2222-00000');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202306','홍이동', 18, 2, '남자', '010-1212-3434');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202307','홍삼동', 18, 2, '남자', '010-3214-3231');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202308','홍사동', 17, 1, '남자', '010-1222-0923');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202309','박삼자', 19, 3, '여자', '010-3278-6542');
 INSERT INTO jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
 VALUES('202310','정영지', 17, 1, '여자', '010-7541-7653');
 
 UPDATE jdbc.student_info SET std_phone = '010-2222-0000' WHERE std_id = '202305';
 
 # 테이블 보기(전체)
 SELECT * FROM jdbc.student_info;
 
 # 테이블 보가(부분) -> WHERE 조건을 달아 작성.
 SELECT * FROM jdbc.student_info WHERE std_gender = '남자';
 SELECT * FROM jdbc.student_info WHERE std_gender = '여자';
 
 # 테이블 수정
 UPDATE jdbc.student_info SET std_gender = '여자', std_age = 17, std_grade = 1 WHERE std_id = '202306';
 
 SELECT * FROM jdbc.student_info WHERE std_id = '202306';
 
 # 테이블 삭제
 
 DELETE FROM student_info WHERE std_id = '202306';
 
 SELECT * FROM student_info;
 