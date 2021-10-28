/* 59. Halla los empleados cuyo salario supera o coincide con la media del salario de la empresa.
*/

SELECT ENAME
FROM empleados
WHERE SAL >= (
	SELECT avg(SAL)
	FROM EMPLEADOS
    
);
