/* 28. Lista la misma informacion, pero para los empleados que no tienen comision.*/

SELECT SAL, ifnull(comm,"")COMM, ifnull(SAL+COMM,"") AS SALARIO_TOTAL
FROM empleados
WHERE COMM IS NULL
ORDER BY EMPNO ASC;