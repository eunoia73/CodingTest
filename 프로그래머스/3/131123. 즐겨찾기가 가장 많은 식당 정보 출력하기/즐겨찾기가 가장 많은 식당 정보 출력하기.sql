-- 코드를 입력하세요
SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, R.FAVORITES
  FROM REST_INFO R
WHERE 1=1
  AND (R.FOOD_TYPE, R.FAVORITES) IN (SELECT R2.FOOD_TYPE, MAX(R2.FAVORITES)
                                       FROM REST_INFO R2
                                     GROUP BY R2.FOOD_TYPE
                                    )
ORDER BY R.FOOD_TYPE DESC
;