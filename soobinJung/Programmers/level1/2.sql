-- 코드를 입력하세요
SELECT DATETIME 
FROM ANIMAL_INS
ORDER BY DATETIME 
DESC LIMIT 1;

-- SELECT max(datetime) as '시간' from animal_ins;



-- SELECT datetime as 시간
-- from animal_ins
-- where datetime = (select max(datetime) from animal_ins);