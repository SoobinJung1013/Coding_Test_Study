-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.NAME 
FROM ANIMAL_OUTS As o
LEFT JOIN ANIMAL_INS As i 
ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE i.ANIMAL_ID IS NULL

-- SELECT ANIMAL_OUTS.ANIMAL_ID, ANIMAL_OUTS.NAME
--     from ANIMAL_OUTS
--     left join ANIMAL_INS
--     using(ANIMAL_ID)
--     where ANIMAL_INS.ANIMAL_ID is NULL


-- SELECT ANIMAL_ID, NAME
-- FROM animal_outs
-- WHERE ANIMAL_ID not in (
--                         SELECT ANIMAL_ID
--                         FROM animal_ins
--                         );

