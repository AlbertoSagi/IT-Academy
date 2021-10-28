/* 61. Â¿Cuantos empleos diferentes, cuantos empleados, y cuantos salarios diferentes 
encontramos en el departamento 30, y a cuanto asciende la suma de salarios de dicho departamento?*/

SELECT DISTINCT count(JOB), count(ENAME), COUNT(SAL), sum(SAL)
FROM empleados
WHERE DEPTNO = 30; 