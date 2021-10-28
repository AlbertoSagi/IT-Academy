/* 35. Deseamos conocer el nombre de los empleados y el codigo del departamento 
de los administrativos(CLERK) que no trabajan en el departamento 10, y cuyo 
salario es superior a 800, ordenado por fecha de contratacion.*/

SELECT ENAME, DEPTNO
FROM empleados
WHERE JOB = 'CLERK' AND DEPTNO !=10 AND SAL>800
ORDER BY HIREDATE;