/* 62. Â¿Cuantos empleados tienen comision?*/

SELECT count(COMM) AS EMP_COMMISION
FROM empleados
WHERE COMM!=0;