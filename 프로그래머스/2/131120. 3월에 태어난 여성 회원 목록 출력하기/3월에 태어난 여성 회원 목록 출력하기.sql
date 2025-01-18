-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER
    , DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d')AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE DATE_OF_BIRTH LIKE '%-03-%'
AND GENDER = 'W'
AND TLNO IS NOT NULL
ORDER BY MEMBER_ID 
;
