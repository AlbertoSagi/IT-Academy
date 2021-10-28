/* 45. Halla los nombres de los empleados cuyo nombre tiene como maximo cinco caracteres.*/

SELECT ENAME
FROM empleados
WHERE length(ename)<=5;