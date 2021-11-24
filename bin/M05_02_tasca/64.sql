/* 64. Halla los departamentos que tienen mas de tres empleados, y el numero de empleados de los mismos.*/

SELECT DEPTNO
FROM empleados
WHERE (SELECT sum(ENAME)
		FROM empleados
        GROUP BY DEPTNO) >3;
