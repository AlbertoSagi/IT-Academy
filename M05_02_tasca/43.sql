/* 43. Lista los nombres y empleos de aquellos empleados cuyo empleo acaba 
en MAN y cuyo nombre empieza por A.*/

SELECT ENAME, JOB
FROM empleados
WHERE JOB LIKE '%MAN' AND ENAME LIKE 'A%';