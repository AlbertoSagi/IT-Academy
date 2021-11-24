/* 40. Halla el nombre, el salario y el sueldo total de todos los empleados, ordenando 
el resultado primero por salario y luego por el sueldo total. En el caso de que no 
tenga comision, el sueldo total debe reflejar solo el salario.*/

SELECT ENAME, SAL, ifnull(SAL+COMM, SAL) AS SALARIO_TOTAL
FROM empleados
ORDER BY SAL ASC, SALARIO_TOTAL;