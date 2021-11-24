/* 22. Halla los empleados que tienen una comision superior a la mitad de su salario.*/

SELECT ename
FROM empleados
WHERE COMM > sal/2;