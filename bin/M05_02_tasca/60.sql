/* 60. Obten los empleados cuyo salario supera al de sus compa~neros de departamento.*/

SELECT ENAME, DEPTNO, SAL
FROM empleados
WHERE SAL IN  (
	SELECT max(SAL)
	FROM EMPLEADOS
    GROUP BY DEPTNO
 );


