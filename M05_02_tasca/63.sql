/* 63. Â¿Cuantos empleados tiene el departamento 20?*/

SELECT count(ename) AS Num_emp
FROM empleados
WHERE DEPTNO=20;