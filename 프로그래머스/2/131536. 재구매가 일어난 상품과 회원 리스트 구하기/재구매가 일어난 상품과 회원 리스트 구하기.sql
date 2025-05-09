-- 코드를 입력하세요
SELECT DISTINCT A.USER_ID, A.PRODUCT_ID 
FROM ONLINE_SALE A
JOIN ONLINE_SALE B
    ON A.USER_ID = B.USER_ID
WHERE A.PRODUCT_ID = B.PRODUCT_ID
    AND A.SALES_DATE != B.SALES_DATE
ORDER BY A.USER_ID, A.PRODUCT_ID DESC;