/* 12. Obtener el nombre y empleo de todos los empleados, ordenado primero por su trabajo y luego por su salario.*/

SELECT ENAME, JOB
FROM empleados
ORDER BY JOB, SAL;