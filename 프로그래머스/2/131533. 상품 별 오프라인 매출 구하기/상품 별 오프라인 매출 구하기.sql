-- 코드를 입력하세요
SELECT P.PRODUCT_CODE, (PRICE * SUM(SALES_AMOUNT)) AS 'SALES'
FROM PRODUCT P
JOIN OFFLINE_SALE O
ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SALES DESC, P.PRODUCT_CODE
;