-- 코드를 입력하세요
SELECT B.TITLE,B.BOARD_ID,R.REPLY_ID,R.WRITER_ID,R.CONTENTS,DATE_FORMAT(R.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD B,USED_GOODS_REPLY R
WHERE B.BOARD_ID=R.BOARD_ID
AND YEAR(B.CREATED_DATE)='2022'
AND MONTH(B.CREATED_DATE)='10'
ORDER BY R.CREATED_DATE,B.TITLE ASC;