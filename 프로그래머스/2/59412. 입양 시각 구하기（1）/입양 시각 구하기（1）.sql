-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, '%H') AS 'HOUR', COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_OUTS
WHERE DATE_FORMAT(DATETIME, '%H') BETWEEN 9 AND 19
GROUP BY DATE_FORMAT(DATETIME, '%H')
ORDER BY HOUR
;